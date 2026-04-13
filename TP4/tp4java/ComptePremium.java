package tp4java;

public class ComptePremium extends Compte{
	
	private double plafondRetrait;
	
	//la constructure
	public ComptePremium(String numero,String titulaire,double solde,double plafond) {
	     super(numero,titulaire,solde);
		 this.plafondRetrait=plafond;
	} 
	
	//la redifintioin de la methode retirer
	@Override
	public void retirer(double montant) {
		if(montant>this.plafondRetrait) {
			System.out.println("impossible de retirer");
		}else {
			solde-=montant;
		}
	}
}
