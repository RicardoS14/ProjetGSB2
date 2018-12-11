import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class paneMenu extends JFrame implements ActionListener{
	
	private JPanel panelMenu = new JPanel();
	private JLabel connexion;
	private JMenu jMenu1 = new JMenu();
	private static JMenuBar menubar = new JMenuBar();
	private JMenuItem menuItem1 = new JMenuItem();
	private JMenuItem menuItem2 = new JMenuItem();
	private JMenu menuDeconnexion = new JMenu();
	
	private JLabel comptable;



	public paneMenu(){
		this.setTitle("Projet GSB2");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		//Mise en page du menu pour l'application
		this.menubar = new JMenuBar();
		this.jMenu1 = new JMenu("Fichier");
		this.jMenu1.setPreferredSize(new Dimension(90, 28));
		
		//Menu Item 1
		this.menuItem1 = new JMenuItem("Valider");
		this.menuItem1.addActionListener(new Action1());
		this.menuItem1.setPreferredSize(new Dimension(90, 28));

		//Menu Item 2
		this.menuItem2 = new JMenuItem("Suivie");
		this.menuItem2.addActionListener(new Action1());
		this.menuItem2.setPreferredSize(new Dimension(90, 28));

		//Menu Item deconnexion
		this.menuDeconnexion = new JMenu("Deconnexion");
		this.menuDeconnexion.addActionListener(new ActionDeconnexion());
		this.menuDeconnexion.setPreferredSize(new Dimension(90, 28));
		
		this.panelMenu.setLayout(new BorderLayout());
		this.jMenu1.add(menuItem1);
		this.jMenu1.add(menuItem2);
		
		this.menubar.add(jMenu1);
		this.menubar.add(Box.createHorizontalGlue()); 
		this.menubar.add(menuDeconnexion);
		this.panelMenu.add(menubar ,BorderLayout.PAGE_START);
		
		//Nom du comptable connecté
		this.comptable = new JLabel("WELCOME COMPTABLE!!!!!!");
		Font font = new Font("Arial",Font.BOLD,30);
		this.comptable.setFont(font);
		this.comptable.setForeground(new Color(18,44,202));
		this.comptable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		
		/*Si connexion bdd*/
		if(Modeleconnexion.connexionBDD()){

			//panel Menu
			this.setContentPane(new paneMenu());
			getContentPane().revalidate();

			this.getContentPane().add(comptable);

			this.setVisible(true);
		}
		
	}

	//Action du button dans le pour la validation des fiches de frais
	public class Action1 implements ActionListener{
		public void actionPerformed(ActionEvent arg){
			if(arg.getSource()==menuItem1){
				JPanel unPanel = new paneSelectionVisiteur().getpane();
			}
		}
	}

	//Action du button dans le menu pour le suivie des fiches de frais
	public class Action2 implements ActionListener{
		public void actionPerformed(ActionEvent arg){
			if(arg.getSource()==menuItem1){
				
			}
		}
	}

	//Action du bouton de deconnexion 
	public class ActionDeconnexion implements ActionListener{
		public void actionPerformed(ActionEvent a){
			if(a.getSource()==menuDeconnexion){
				//Revient sur la vue de connexion
				Vconnexion unConnexion = new Vconnexion();
				Modeleconnexion.deconnexionBDD();
			} 
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
