import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Fichevalpane extends JPanel{
	
	private JPanel panel = new JPanel();
	
	private JTable table = new JTable();
	private ArrayList<Fichefrais>Fichefrais;
	
	
	public Fichevalpane(ArrayList<Fichefrais> lesFichefrais){
		this.Fichefrais = lesFichefrais;
		
		String[] entetes = {"IdVisiteur", "Mois", "Montant", "Date-Modif", "Etat"};
		DefaultTableModel tableModel = new DefaultTableModel(entetes, 0);
		
		for(int i = 0; i < lesFichefrais.size(); i++) {
			String id = lesFichefrais.get(i).getId();
			int mois = lesFichefrais.get(i).getMois();
			float montant = lesFichefrais.get(i).getMontant();
			String datemodif = lesFichefrais.get(i).getModif();
			String etat = lesFichefrais.get(i).getEtat();
			
			Object[] ligne = {id, mois, montant, datemodif, etat};
			tableModel.addRow(ligne);
		}	
		this.panel.add(table, BorderLayout.CENTER);
	}
	
	public JPanel getpane(){
		return panel;
	}
}