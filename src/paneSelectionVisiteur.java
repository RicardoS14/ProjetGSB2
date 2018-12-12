import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class paneSelectionVisiteur implements ActionListener {
	
	private static JPanel monPanel = new JPanel();
	private JComboBox listeVisiteur;
	private JComboBox listeMois;
	private JButton valider;
	
	
	public paneSelectionVisiteur(){

		
		//liste deroulante de tous les visiteurs
		this.listeVisiteur = new JComboBox();
		this.listeVisiteur.setPreferredSize(new Dimension(90, 28));
		this.listeMois = new JComboBox();
		this.listeMois.setPreferredSize(new Dimension(90, 28));

		

		//ajout des listes deroulantes dans le panel Selection Visiteur
		List<Visiteur> ls = new ArrayList<Visiteur>();
		ls = ModeleAppli.getVisiteurs();
		this.listeVisiteur.add((Component) ls);
		this.monPanel.add(listeVisiteur);

		//ajout des listes deroulantes dans le panel Selection Mois
		List<Date> mois = new ArrayList<Date>();
		mois = ModeleAppli.getDate();
		this.listeMois.add((Component) mois);
		this.monPanel.add(listeMois);
		
		this.valider = new JButton("Valider");
		this.valider.addActionListener(new Action1());
		this.valider.setPreferredSize(new Dimension(90, 28));

	}

	//Methode pour recuperer ce panel de selection de visiteur et mois
	public static JPanel getpane() {
		return monPanel;
	}

	//renvoi sur le panel ou on affiche les fiches des frais du visiteur selectionné
	public class Action1 implements ActionListener{
		public void actionPerformed(ActionEvent arg){
			if(arg.getSource() == valider){
				
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
