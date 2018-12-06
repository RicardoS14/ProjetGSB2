import java.util.ArrayList;
import java.awt.Dimension;
import javax.swing.*;

public class paneSelectionVisiteur {
	
	private JPanel monPanel = new JPanel();
	private JComboBox listeVisiteur;
	private JComboBox listeMois;
	
	public paneSelectionVisiteur(){

		//liste deroulante de tous les visiteurs
		this.listeVisiteur = new JComboBox((ComboBoxModel<ArrayList>) ModeleAppli.getVisiteurs() );
		this.listeVisiteur.setPreferredSize(new Dimension(90, 28));
		this.listeMois = new JComboBox();
		this.listeMois.setPreferredSize(new Dimension(90, 28));

		//ajout des listes deroulantes dans le panel Selection Visiteur et mois
		this.monPanel.add(listeVisiteur);
		this.monPanel.add(listeMois);
		
	}

	//Methode pour recuperer ce panel de selection de visiteur et mois
	public JPanel getpane() {
		return monPanel;
	}
}
