package tp4java;

public class CompteEpargne extends Compte{
	private double tauxInteret;
	
	//la constructure
	public CompteEpargne(String numero,String titulaire,double solde,double tauxInteret) {
		super(numero,titulaire,solde);
		this.tauxInteret=tauxInteret;
	}
	
	//la methodee calculer interet
	public void calculerInteret() {
		this.solde=this.solde*(1+tauxInteret);
	}
	
	@Override
	public void retirer(double montant) {
		if(montant > solde) {
			System.out.println("impossible de reirer");
		}else {
			this.solde-=montant;
		}
	}
}
