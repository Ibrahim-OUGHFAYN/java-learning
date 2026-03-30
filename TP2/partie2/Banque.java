package partie2;
import partie1.CompteBancaire;

public class Banque {
	//Q1
	public String nom;
	public CompteBancaire[] comptes;
	public static int nbActuel=0;
	
	//Q2
	public Banque(String nom,int cap) {
		this.nom=nom;
		this.comptes=new CompteBancaire[cap];
	}
	//Q3
	public void ajouterCompte(CompteBancaire c) {
		if(comptes.length>nbActuel) {
			comptes[nbActuel]=c;
			nbActuel++;
		}else {
			System.out.println("la banque est plain");
		}
	}
	//Q4
	public void afficherTous() {
	    for(int i = 0; i < nbActuel; i++) {
	        comptes[i].afficher();
	    }
	}
}

