import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Fichevalpane extends JPanel{
	
	private JPanel panel = new JPanel();
	
	private JTable table = new JTable();
	private ArrayList<Fichefrais> lesFichefrais;
	
	private JButton buton = new JButton();
	
	public Fichevalpane(ArrayList<Fichefrais> lesFichefrais){
		this.lesFichefrais = lesFichefrais;
		
		String[] entetes = {"IdVisiteur", "Mois", "Montant", "Date-Modif", "Etat"};
		DefaultTableModel tableModel = new DefaultTableModel(entetes, 0);
		
		for(int i = 0; i < lesFichefrais.size(); i++) {
			int id = lesFichefrais.get(i).getId();
			Date mois = lesFichefrais.get(i).getMois();
			float montant = lesFichefrais.get(i).getMontant();
			Date datemodif = lesFichefrais.get(i).getModif();
			String etat = lesFichefrais.get(i).getEtat();
			this.buton = new JButton();
			
			Object[] ligne = {id, mois, montant, datemodif, etat, buton};
			tableModel.addRow(ligne);
		}	
		this.panel.add(table);	
	}
	
	public JPanel getpane(){
		return panel;
	}
}