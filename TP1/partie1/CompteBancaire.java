package partie1;

public class CompteBancaire {
	//Q2
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;
    //Q3
    private static int nbComptes = 0;
    private double tauxInteret = 0.03;
    
    //Q4
    public CompteBancaire() {
        this.numero =nbComptes++;
        this.titulaire="";
        this.solde = 0;
        this.decouvertAutorise=0;
    }
    
    //Q5
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        this.numero =nbComptes++;
        this.titulaire=titulaire;
        this.solde = solde;
        this.decouvertAutorise=decouvertAutorise;
    }
    
    //Q6
    public int getNumero() {
        return numero;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setTitulaire(String titulaire) {
        while(titulaire=="") {
            System.out.println("titulaire vide");
        }
        this.titulaire=titulaire;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
    	while(decouvertAutorise<0) {
            System.out.println("decouvertAutorise negative");
        }
    	this.decouvertAutorise=decouvertAutorise;
    }
    
    //Q7
    public void afficher() {
        System.out.println("----- Compte Bancaire -----");
        System.out.println("Numéro: " + numero);
        System.out.println("Titulaire: " + titulaire);
        System.out.println("Solde: " + solde + " MAD");
        System.out.println("Découvert autorisé: " + decouvertAutorise + " MAD");
        System.out.println("---------------------------");
    }

    //Q8
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Depot effectue avec succes");
        } else {
            System.out.println("depot invalide");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde + decouvertAutorise) {
            solde -= montant;
            System.out.println("Retrait effectue avec succes" );
        } else {
            System.out.println("Retrait refusé.");
        }
    } 
    
    
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && montant <= solde+decouvertAutorise) {
            autre.deposer(montant);
            this.retirer(montant);
            System.out.println("virement effectue avec succes" );
        } else {
            System.out.println("virement impossible");
        }
    } 
    
    //Q9    
    public double calculerSoldeAvecInterets() {
    	return this.solde*(1+tauxInteret);
    }
    
    public double calculerSoldeAvecInterets(double bounus) {
    	return this.solde*(1+tauxInteret+bounus);
    }
    
    //Q10
    public  int getNbComptes() {
        return nbComptes;
    }

    public  double getTauxInteret() {
        return tauxInteret;
    }
    public void setTauxInteret(double tauxInteret) {
    	this.tauxInteret=tauxInteret;
    }
}