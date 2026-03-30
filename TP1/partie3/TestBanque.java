package partie3;
import partie1.CompteBancaire;
import partie2.Banque;


public class TestBanque {

	public static void main(String[] args) {
           Banque b=new Banque("albaridbank",1500);
           CompteBancaire c1=new CompteBancaire("brahim",1000,200);
           CompteBancaire c2=new CompteBancaire("ahmed",300,100);
           CompteBancaire c3=new CompteBancaire();
           
           b.ajouterCompte(c1);
           b.ajouterCompte(c2);
           b.ajouterCompte(c3);
           
           c1.deposer(2000);
           c1.retirer(500);
           
           c2.virementVers(c3, 100);
           c2.calculerSoldeAvecInterets();
           c2.calculerSoldeAvecInterets(0.015);

           System.out.println(c1.getNbComptes());
           System.out.println(c1.getTauxInteret());
           
           b.afficherTous();
	}
}
