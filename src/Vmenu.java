import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Vmenu extends JFrame{

	
	private JLabel comptable;
	

	public Vmenu(){

		this.setTitle("Projet GSB2");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		//Nom du comptable connecté
		this.comptable = new JLabel("WELCOME COMPTABLE!!!!!!");
		Font font = new Font("Arial",Font.BOLD,30);
		this.comptable.setFont(font);
		this.comptable.setForeground(new Color(18,44,202));
		this.comptable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		/*Si connexion bdd*/
		if(Modeleconnexion.connexionBDD()){

			//panel Menu
			this.setContentPane(new paneMenu().getpane());

			this.getContentPane().add(comptable);

			this.setVisible(true);
		}
	}
}
