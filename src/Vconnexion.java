import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Vconnexion extends JFrame{
	
	//Fenetre de connexion
	//ce ferme lors de la connexion d'un comptable
	//puis ouvre l'appli de gestion de frais
	
	private JPanel pane = new JPanel();
	
	public Vconnexion(){
		
		this.setTitle("Connexion Comptable");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		if(Modeleconnexion.connexionBDD()){
			setContentPane(new Connexionpane(this).getpane());
		}
		
		this.setVisible(true);
		
	}
}