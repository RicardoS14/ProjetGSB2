import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;


public class ModeleAppli {

	private static Statement stat;
	private static Connection connexion;
	private paneMenu visiteur;

	//Recuperation de tous les visiteurs e retournant une liste de tout les noms
	public static ArrayList<ResultSet> getVisiteurs(){

		ArrayList<ResultSet> lesVisiteurs = new ArrayList<ResultSet>();

		try {
			PreparedStatement stat = connexion.prepareStatement("SELECT nom FROM visiteur");
			ResultSet result = stat.executeQuery();

			lesVisiteurs.add(result);

			result.close();
			stat.close();
		} catch (SQLException e) {
			System.out.println("erreur dans la recuperation de tout les visiteurs");
		}

		return lesVisiteurs;
		
	}

	
}