package tp3java;

public class Camion extends Vehicule{
	private double chargeMax;
	
	public Camion(String matricule, String marque,double chargeMax) {
		super(matricule,marque);
		this.chargeMax=chargeMax;
	}
	
	@Override
	public void stationner() {
		System.out.println("la camion se gare dans dans une zone pour vehicules lourdes");
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("les charge max c'est : "+this.chargeMax);
	}

}
