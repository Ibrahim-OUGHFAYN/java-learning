package tp4java;

public class CompteCourant extends Compte{
	private double decouvertAutorise;
	
	public CompteCourant(String numero,String titulaire,double solde,double decouvertAutorise) {
		super(numero,titulaire,solde);
		this.decouvertAutorise=decouvertAutorise;
	}
	
	@Override
	public void retirer(double montant) {
		if(montant > decouvertAutorise) {
			System.out.println("impossible de reirer");
		}else {
			this.solde-=montant;
		}
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("le decouvert autorise est : "+ this.decouvertAutorise);
	}
}
