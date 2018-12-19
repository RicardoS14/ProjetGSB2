import java.sql.*;
import java.util.ArrayList;

public class ModeleAppli {

	private static Statement stat;
	private static ResultSet result;
	private static Connection connexion;
	private Fichefrais fiche;
	
	
	//methode de connexion de la base de donnée
		public static boolean connexionBDD(){
			boolean test;
			try{
				connexion = DriverManager.getConnection("jdbc:mysql://172.16.203.100/2018chevrier","rchevrier","123456");
				stat = connexion.createStatement();
				test = true;
			}
			catch(SQLException e){
				System.out.println("Erreur de connection de la BDD !");
				test = false;
			}
			return test;
		}
		
		//methode de deconnexion de la base de donnée
		public static boolean deconnexionBDD(){
			boolean test;
			try{
				connexion.close();
				test = true;
			}
			catch(SQLException e){
				System.out.println("Erreur de deconnexion de la BDD !");
				test = false;
			}
			return test;
		}


	//Recuperation de tous les visiteurs e retournant une liste de tout les noms
	public static ArrayList<Visiteur> getVisiteurs(){

		connexionBDD();
		ArrayList<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
		ArrayList<Visiteur> resultVis = new ArrayList<Visiteur>();

		try {
			stat = connexion.createStatement();
			result = stat.executeQuery("SELECT * FROM visiteur;");

			resultVis.add((Visiteur) result);
			for(Visiteur visiteur : resultVis){
				lesVisiteurs.add(visiteur);
			}

			result.close();
			stat.close();
		} catch (SQLException e) {
			System.out.println("erreur dans la recuperation de tout les visiteurs");
		}
		deconnexionBDD();
		return lesVisiteurs;	
	}
	
	//Recuperation de tout les fiches de frais en cours de saisie
	public static ArrayList<Fichefrais> getFichefrais(){
		connexionBDD();
		ArrayList<Fichefrais> lesFichefrais = new ArrayList<Fichefrais>();

		try {
			stat = connexion.createStatement();
			result = stat.executeQuery("SELECT * FROM fichefrais WHERE idEtat='CR';");
			while(result.next()){
				Fichefrais fiche = new Fichefrais(result.getString(1), result.getInt(2), result.getInt(3), result.getInt(4), result.getString(5), result.getString(6));
				lesFichefrais.add(fiche);
			}
			result.close();
			stat.close();
		} catch (SQLException e) {
			System.out.println("erreur dans la recuperation de tout les fichefrais : " +e);
		}
		deconnexionBDD();
		return lesFichefrais;
	}
	
	//Recuperation de Comptable et retournant un comptable
	public static ArrayList<Comptable> getComptable(){
		connexionBDD();
		ArrayList<Comptable> leComptable = new ArrayList<Comptable>();
		ArrayList<Comptable> resultCom = new ArrayList<Comptable>();

		try {
			stat = connexion.createStatement();
			result = stat.executeQuery("SELECT * FROM comptable;");

			resultCom.add((Comptable) result);

			result.close();
			stat.close();
		} catch (SQLException e) {
			System.out.println("erreur dans la recuperation du Comptable");
		}
		deconnexionBDD();
		return leComptable;	
	}

	//Recuperation des dates lors de la selection des fiches frais retournant une liste de toute les dates dans le champs mois de la table Fichefrais
	public static ArrayList<Date> getDate(){
		connexionBDD();
		ArrayList<Date> lesDates = new ArrayList<Date>();
		int i = 0;
		try {
			stat = connexion.createStatement();
			result = stat.executeQuery("Select mois From fichefrais;");
			while(result.next()){
				lesDates.add(result.getDate(i));
				i+=1;
			}
		} catch (SQLException e) {
			System.out.println("Erreur lors de la recuperation des dates pour la section d'un visiteur!");
		}
		deconnexionBDD();
		return lesDates;	
	}
}