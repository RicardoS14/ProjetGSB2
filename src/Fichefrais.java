import java.sql.Date;


public class Fichefrais {

	private int idvisiteur;
	private Date mois;
	private int nbjusti;
	private float montant;
	private Date datemodif;
	private String etat;
	
	public Fichefrais(int idvisiteur, Date mois, int nbjusti, float montant, Date datemodif, String etat){
		this.idvisiteur = idvisiteur;
		this.mois = mois;
		this.nbjusti = nbjusti;
		this.montant = montant;
		this.datemodif = datemodif;
		this.etat = etat;
	}
	public int getId() {
		return idvisiteur;
	}
	public Date getMois() {
		return mois;
	}
	public int getJusti() {
		return nbjusti;
	}
	public float getMontant() {
		return montant;
	}
	public Date getModif() {
		return datemodif;
	}
	public String getEtat() {
		return etat;
	}
}
