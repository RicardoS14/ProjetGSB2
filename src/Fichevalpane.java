import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Fichevalpane extends JPanel{
	
	private JPanel panel = new JPanel();
	
	private JTable table = new JTable();
	
	public Fichevalpane(){
		
		String[] entetes = {"Nom", "Mois", "Montant", "Date-Modif", "Etat"};
		DefaultTableModel tableModel = new DefaultTableModel(entetes, 0);
		
		for(int i = 0; i < .size(); i++) {
			String nom = .get(i).getNom();
			String mois = .get(i).getMois();
			String montant = .get(i).getMontant();
			String datemodif = .get(i).getDtamodif();
			String etat = .get(i).getEtat();
			
			Object[] ligne = {nom, mois, montant, datemodif, etat};
			
			tableModel.addRow(ligne);
		}
		
		this.panel.add(table);
		
	}
}