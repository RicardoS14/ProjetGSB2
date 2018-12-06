import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Connexionpane extends JPanel implements ActionListener{
	
	//contenue de la fentre connexion
	
	private Vconnexion vc;
	
	private JPanel panelco = new JPanel();
	
	private JTextField tlog = new JTextField();
	private JTextField tmdp = new JTextField();
	
	private JLabel llog = new JLabel("Login : ");
	private JLabel lmdp = new JLabel("Mot de passe : ");

	private JButton bvalider = new JButton("Valider");
	private JButton bannuler = new JButton("Annuler");
	
	private JLabel lretour = new JLabel("");
	
	public Connexionpane(Vconnexion vc){
		
		this.vc = vc;
		
		this.panelco.add(llog);
		this.panelco.add(tlog);
		this.tlog.setPreferredSize(new Dimension(50,20));
		
		
		this.panelco.add(lmdp);
		this.panelco.add(tmdp);
		this.tmdp.setPreferredSize(new Dimension(50,20));
		
		
		this.panelco.add(bvalider);
		bvalider.addActionListener(new Actionco());
		
		this.panelco.add(bannuler);
		bannuler.addActionListener(this);
		
		this.panelco.add(lretour);
		
		if(Modeleconnexion.connexionBDD()){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
	}
	
	//retourne le contenue de la fenetre connexion
	
	public JPanel getpane(){
		return panelco;
	}
	
	//bouton reset les champ
	
	public void actionPerformed(ActionEvent arg) {
		if(arg.getSource() == bannuler){
			tlog.setText("");
			tmdp.setText("");
			revalidate();
		}
	}
	
	//bouton valider qui lance le test de connexion
	//puis retour dans la console les etapes de connexion
	
	class Actionco implements ActionListener{
		public void actionPerformed(ActionEvent arg){
			if(arg.getSource() == bvalider){
				if(!tlog.getText().equals("") && !tmdp.getText().equals("")){
					if(Modeleconnexion.connexioncomptable(tlog.getText(),tmdp.getText())){
						vc.dispose();
						//new Vmenu();
						System.out.println("Connexion réussie");
					}
					else{
						lretour.setText("Le login ou le mdp est incorrect");
						System.out.println("Erreur log ou mdp saisie incorrect");
					}
				}
				else {
					lretour.setText("Le login ou le mdp n'est pas saisie");
					System.out.println("Erreur log ou mdp champ vide");
					revalidate();
				}
			}
		}
	}
}