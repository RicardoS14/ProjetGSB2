import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class Modeleconnexion {
	
	private static Connection connexion;
	private static Statement stat;
	private static ResultSet result;
	
	
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
	
	//methode de getMD5
	public static String getMd5(String input){ 
		try {
			MessageDigest md = MessageDigest.getInstance("MD5"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest);  
            String text = no.toString(16); 
            while (text.length() < 32) { 
            	text = "0" + text; 
            }
            return text; 
		}  
		catch (NoSuchAlgorithmException e) { 
			throw new RuntimeException(e); 
		} 
	} 
	
	//methode de connexion du comptable
	public static boolean connexioncomptable(String login, String mdp){
		connexionBDD();
		boolean test = false;
		try{
			PreparedStatement stat = connexion.prepareStatement("SELECT login, mdp FROM comptable;");
			ResultSet result = stat.executeQuery();
			result.next();
			String loginE = result.getString(1);
			String mdpE = result.getString(2);
			if(loginE.equals(login) && mdpE.equals(getMd5(mdp))){
				test = true;
			}
			result.close();
			stat.close();
		}
		catch(SQLException e){
			System.out.println("Erreur de lancement de la requete comptable !");
		}
		deconnexionBDD();
		return test;
	}
}