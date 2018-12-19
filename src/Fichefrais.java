import java.sql.Date;


public class Fichefrais {

	private String idvisiteur;
	private int mois;
	private int nbjusti;
	private float montant;
	private String datemodif;
	private String etat;
	
	public Fichefrais(String idvisiteur, int mois, int nbjusti, float montant, String datemodif, String etat){
		this.idvisiteur = idvisiteur;
		this.mois = mois;
		this.nbjusti = nbjusti;
		this.montant = montant;
		this.datemodif = datemodif;
		this.etat = etat;
	}
	public String getId() {
		return idvisiteur;
	}
	public int getMois() {
		return mois;
	}
	public int getJusti() {
		return nbjusti;
	}
	public float getMontant() {
		return montant;
	}
	public String getModif() {
		return datemodif;
	}
	public String getEtat() {
		return etat;
	}
}
