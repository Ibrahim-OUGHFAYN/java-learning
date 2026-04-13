package tp4java;

public class Compte {
	protected String numero;
	protected String titulaire;
	protected double solde;
	
	//constructure parametre
	public Compte(String numero,String titulaire,double solde) {
		this.numero=numero;
		this.titulaire=titulaire;
		this.solde=solde;
	}
	
	//getters
	public String getNumero() {
		return this.numero;
	}
	public String getTitulaire() {
		return this.titulaire;
	}
	public double getSolde() {
		return solde;
	}
	
	//setters
	public void setNumero(String numero) {
		this.numero=numero;
	}
	public void setTitulaire(String titulaire) {
		this.titulaire=titulaire;
	}
	public void setSolde(double solde) {
		this.solde=solde;
	}
	
	//la methode deposer
	public void deposer(double montant) {
		if(montant > 0) {
			this.solde+=montant;
		}else {
			System.out.println("impossible de deposer");
		}
	}
	
	//la methode retirer
	public void retirer(double montant) {
			this.solde-=montant;
	}
	
	//la methode afficher
	public void afficher() {
		System.out.println("Numero: "+this.numero +",Titulaire: "+this.titulaire+",Solde: "+this.solde);
	}	
}
