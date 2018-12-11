import java.sql.*;

public class Visiteur {

	private int idVisiteur;
	private String nomVisiteur;
	private String prenomVisiteur;
	private String loginVisiteur;
	private String mdpVisiteur;
	private String adresseVisiteur;
	private int cpVisiteur;
	private String villeVisiteur;
	private Date dateEmbaucheVisiteur;


	public Visiteur(int idVisiteur,String nomVisiteur,String prenomVisiteur,String loginVisiteur,String mdpVisiteur,String adresseVisiteur,int cpVisiteur,String villeVisiteur,Date dateEmbaucheVisiteur){
		this.idVisiteur = idVisiteur;
		this.nomVisiteur = nomVisiteur;
		this.prenomVisiteur = prenomVisiteur;
		this.loginVisiteur = loginVisiteur;
		this.mdpVisiteur = mdpVisiteur;
		this.adresseVisiteur = adresseVisiteur;
		this.cpVisiteur = cpVisiteur;
		this.villeVisiteur = villeVisiteur;
		this.dateEmbaucheVisiteur = dateEmbaucheVisiteur;
	}
	public Visiteur(){
		
	}


	public int getIdVisiteur() {
		return idVisiteur;
	}
	public void setIdVisiteur(int idVisiteur) {
		this.idVisiteur = idVisiteur;
	}
	public String getNomVisiteur() {
		return nomVisiteur;
	}
	public void setNomVisiteur(String nomVisiteur) {
		this.nomVisiteur = nomVisiteur;
	}
	public String getPrenomVisiteur() {
		return prenomVisiteur;
	}
	public void setPrenomVisiteur(String prenomVisiteur) {
		this.prenomVisiteur = prenomVisiteur;
	}
	public String getLoginVisiteur() {
		return loginVisiteur;
	}
	public void setLoginVisiteur(String loginVisiteur) {
		this.loginVisiteur = loginVisiteur;
	}
	public String getMdpVisiteur() {
		return mdpVisiteur;
	}
	public void setMdpVisiteur(String mdpVisiteur) {
		this.mdpVisiteur = mdpVisiteur;
	}
	public String getAdresseVisiteur() {
		return adresseVisiteur;
	}
	public void setAdresseVisiteur(String adresseVisiteur) {
		this.adresseVisiteur = adresseVisiteur;
	}
	public int getCpVisiteur() {
		return cpVisiteur;
	}
	public void setCpVisiteur(int cpVisiteur) {
		this.cpVisiteur = cpVisiteur;
	}
	public String getVilleVisiteur() {
		return villeVisiteur;
	}
	public void setVilleVisiteur(String villeVisiteur) {
		this.villeVisiteur = villeVisiteur;
	}
	public Date getDateEmbaucheVisiteur() {
		return dateEmbaucheVisiteur;
	}
	public void setDateEmbaucheVisiteur(Date dateEmbaucheVisiteur) {
		this.dateEmbaucheVisiteur = dateEmbaucheVisiteur;
	}

}
