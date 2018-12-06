import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class paneMenu extends JPanel implements ActionListener{
	private JPanel panelMenu = new JPanel();
	private JLabel connexion;
	private JMenu jMenu1 = new JMenu();
	private static JMenuBar menubar = new JMenuBar();
	private JMenuItem menuItem1 = new JMenuItem();
	private JMenuItem menuItem2 = new JMenuItem();
	private JMenu menuDeconnexion = new JMenu();


	public paneMenu(){
		
		//Mise en page du menu pour l'application
		this.setBarMenu(new JMenuBar());
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
		this.menuItem1.addActionListener(new ActionDeconnexion());
		this.menuDeconnexion.setPreferredSize(new Dimension(90, 28));
		
		this.panelMenu.setLayout(new BorderLayout());
		this.jMenu1.add(menuItem1);
		this.jMenu1.add(menuItem2);
		
		this.menubar.add(jMenu1);
		this.menubar.add(Box.createHorizontalGlue()); 
		this.menubar.add(menuDeconnexion);
		this.panelMenu.add(menubar ,BorderLayout.PAGE_START);
		
	}

	public void setBarMenu(JMenuBar barMenu) {
		this.menubar = barMenu;
	}
	public static JMenuBar getBarMenu() {
		return menubar;
	}
	public JPanel getpane() {
		return panelMenu;
	}

	//Action du button dans le pour la validation des fiches de frais
	public class Action1 implements ActionListener{
		public void actionPerformed(ActionEvent arg){
			if(arg.getSource()==menuItem1){
				JPanel panel1 = new paneSelectionVisiteur().getpane();
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
				Modeleconnexion.deconnexionBDD();
				//Revient sur la vue de connexion
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
