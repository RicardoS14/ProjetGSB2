import java.sql.*;
import java.sql.PreparedStatement;


public class Modeleconnexion {
	
	private static Connection connexion;
	private static Statement stat;
	private static ResultSet result;
	

	//methode de connexion de la base de donnée
	public static boolean connexionBDD(){
		boolean test;
		try{
			connexion = DriverManager.getConnection("jdbc:mysql://172.16.203.100/2018chevrier","rdesousa","123456");
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
	
	//methode de connexion du comptable
	public static boolean connexioncomptable(String login, String mdp){
		boolean test;
		try{
			PreparedStatement stat = connexion.prepareStatement("SELECT login, mdp FROM comptable WHERE login = ? AND mdp = MD5(?);");
			stat.setString(1, login);
			stat.setString(2, mdp);
			ResultSet result = stat.executeQuery();
			result.close();
			stat.close();
			
			test = true;
		}
		catch(SQLException e){
			System.out.println("Erreur de lancement de la requete comptable !");
			test = false;
		}
		return test;
	}
}
