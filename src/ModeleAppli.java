import java.awt.Component;
import java.sql.*;
import java.util.ArrayList;


public class ModeleAppli {

	private static Statement stat;
	private static ResultSet result;
	private static Connection connexion;
	private paneMenu visiteur;

	//Recuperation de tous les visiteurs e retournant une liste de tout les noms
	public static ArrayList<String> getVisiteurs(){

		ArrayList<String> lesVisiteurs = new ArrayList<String>();
		ArrayList<ResultSet> resultVis = new ArrayList<ResultSet>();

		try {
			stat = connexion.createStatement();
			result = stat.executeQuery("SELECT nom FROM visiteur");

			resultVis.add(result);
			for(ResultSet visiteur : resultVis){
				lesVisiteurs.add(visiteur.toString());
			}

			result.close();
			stat.close();
		} catch (SQLException e) {
			System.out.println("erreur dans la recuperation de tout les visiteurs");
		}
		return lesVisiteurs;
	}
	
	//Recuperation de tout les fiches de frais saisie
	public static ArrayList<Fichefrais> getFichefrais(){
		Modeleconnexion.connexionBDD();
		ArrayList<Fichefrais> lesFichefrais = new ArrayList<Fichefrais>();

		try {
			stat = connexion.createStatement();
			result = stat.executeQuery("SELECT * FROM fichefrais");
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
	
}