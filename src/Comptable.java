import java.sql.Date;


public class Comptable {
	
	private int idComptable;
	private String nomComptable;
	private String prenomComptable;
	private String loginComptable;
	private String mdpComptable;
	private String adresseComptable;
	private int cpComptable;
	private String villeComptable;
	private Date dateEmbaucheComptable;


	public Comptable(int idComptable,String nomComptable,String prenomComptable,String loginComptable,String mdpComptable,String adresseComptable,int cpComptable,String villeComptable,Date dateEmbaucheComptable){
		this.idComptable = idComptable;
		this.nomComptable = nomComptable;
		this.prenomComptable = prenomComptable;
		this.loginComptable = loginComptable;
		this.mdpComptable = mdpComptable;
		this.adresseComptable = adresseComptable;
		this.cpComptable = cpComptable;
		this.villeComptable = villeComptable;
		this.dateEmbaucheComptable = dateEmbaucheComptable;
	}
	
	public Comptable(){
		
	}


	public int getIdComptable() {
		return idComptable;
	}
	public void setIdComptable(int idComptable) {
		this.idComptable = idComptable;
	}
	public String getNomComptable() {
		return nomComptable;
	}
	public void setNomComptable(String nomComptable) {
		this.nomComptable = nomComptable;
	}
	public String getPrenomComptable() {
		return prenomComptable;
	}
	public void setPrenomComptable(String prenomComptable) {
		this.prenomComptable = prenomComptable;
	}
	public String getLoginComptable() {
		return loginComptable;
	}
	public void setLoginComptable(String loginComptable) {
		this.loginComptable = loginComptable;
	}
	public String getMdpComptable() {
		return mdpComptable;
	}
	public void setMdpComptable(String mdpComptable) {
		this.mdpComptable = mdpComptable;
	}
	public String getAdresseComptable() {
		return adresseComptable;
	}
	public void setAdresseComptable(String adresseComptable) {
		this.adresseComptable = adresseComptable;
	}
	public int getCpComptable() {
		return cpComptable;
	}
	public void setCpComptable(int cpComptable) {
		this.cpComptable = cpComptable;
	}
	public String getVilleComptable() {
		return villeComptable;
	}
	public void setVilleComptable(String villeComptable) {
		this.villeComptable = villeComptable;
	}
	public Date getDateEmbaucheComptable() {
		return dateEmbaucheComptable;
	}
	public void setDateEmbaucheComptable(Date dateEmbaucheComptable) {
		this.dateEmbaucheComptable = dateEmbaucheComptable;
	}


}
