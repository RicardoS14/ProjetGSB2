import java.awt.Component;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ModeleAppli {

	private static Statement stat;
	private static ResultSet result;
	private static Connection connexion;
	private paneMenu visiteur;

	//Recuperation de tous les visiteurs et retournant une liste
	public static ArrayList<ResultSet> getVisiteurs(){
		Modeleconnexion.connexionBDD();
		ArrayList<ResultSet> lesVisiteurs = new ArrayList<ResultSet>();

		try {
			PreparedStatement stat = connexion.prepareStatement("SELECT * FROM visiteur");
			ResultSet result = stat.executeQuery();

			lesVisiteurs.add(result);

			result.close();
			stat.close();
		} catch (SQLException e) {
			System.out.println("erreur dans la recuperation de tout les visiteurs");
		}
		Modeleconnexion.deconnexionBDD();
		return lesVisiteurs;	
	}
	
	//Recuperation de tout les fiches de frais saisie
	public static ArrayList<Fichefrais> getFichefrais(){
		Modeleconnexion.connexionBDD();
		ArrayList<Fichefrais> lesFichefrais = new ArrayList<Fichefrais>();

		try {
			stat = connexion.createStatement();
			result = stat.executeQuery("SELECT * FROM fichefrais WHERE etat='CR'");
			while(result.next()){
				Fichefrais fiche = new Fichefrais(result.getInt(1), result.getDate(2), result.getInt(3), result.getInt(4), result.getDate(5), result.getString(6));
				lesFichefrais.add(fiche);
			}
			result.close();
			stat.close();
		} catch (SQLException e) {
			System.out.println("erreur dans la recuperation de tout les fichefrais");
		}
		Modeleconnexion.deconnexionBDD();
		return lesFichefrais;
	}	
	
	//Recuperation de Comptable et retournant une liste
		public static ArrayList<ResultSet> getComptable(){
			Modeleconnexion.connexionBDD();
			ArrayList<ResultSet> leComptable = new ArrayList<ResultSet>();

			try {
				PreparedStatement stat = connexion.prepareStatement("SELECT * FROM comptable");
				ResultSet result = stat.executeQuery();

				leComptable.add(result);

				result.close();
				stat.close();
			} catch (SQLException e) {
				System.out.println("erreur dans la recuperation du Comptable");
			}
			Modeleconnexion.deconnexionBDD();
			return leComptable;	
		}
}