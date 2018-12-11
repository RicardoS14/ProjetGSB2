import java.sql.*;
import java.util.ArrayList;


public class ModeleAppli {

	private static Statement stat;
	private static ResultSet result;
	private static Connection connexion;

	//Recuperation de tous les visiteurs e retournant une liste de tout les noms
	public static ArrayList<Visiteur> getVisiteurs(){

		Modeleconnexion.connexionBDD();
		ArrayList<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
		ArrayList<Visiteur> resultVis = new ArrayList<Visiteur>();

		try {
			stat = connexion.createStatement();
			result = stat.executeQuery("SELECT nom,prenom FROM visiteur");

			resultVis.add((Visiteur) result);
			for(Visiteur visiteur : resultVis){
				lesVisiteurs.add(visiteur);
			}

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
	
	//Recuperation des dates lors de la selection des fiches frais retournant une liste de toute les dates dans le champs mois de la table Fichefrais
	public static ArrayList<Date> getDate(){
		Modeleconnexion.connexionBDD();
		ArrayList<Date> lesDates = new ArrayList<Date>();
		int i = 0;
		try {
			stat = connexion.createStatement();
			result = stat.executeQuery("Select mois From fichefrais");
			while(result.next()){
				lesDates.add(result.getDate(i));
				i+=1;
			}
		} catch (SQLException e) {
			System.out.println("Erreur lors de la recuperation des dates pour la section d'un visiteur!");
		}
		Modeleconnexion.deconnexionBDD();
		return lesDates;
		
	}
}