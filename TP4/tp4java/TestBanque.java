package tp4java;

public class TestBanque {

	public static void main(String[] args) {
		Compte[] cmpt= new Compte[4];
		
		cmpt[0]=new CompteCourant("1234er","ahmed mahmoud",1000,2000); 
		cmpt[1]=new CompteEpargne("12990","brahim oughfayn",500,0.01); 
		cmpt[2]=new ComptePremium("7890","ayoub jabir",700,1500); 
		cmpt[3]=new CompteCourant("9089","mohamed mansour",3000,5000); 
		
		System.out.println("--------------------------------------------------------------------------------");
		for(Compte C:cmpt) {
			C.deposer(100);
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		for(Compte C:cmpt) {
			C.afficher();
			C.retirer(1000);
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		for(Compte C:cmpt) {
			if( C instanceof CompteEpargne) {
				C.afficher();
			}
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		Compte c = new CompteEpargne("12990","brahim oughfayn",500,0.01);
		CompteCourant cc = (CompteCourant) c;	
	}
}


