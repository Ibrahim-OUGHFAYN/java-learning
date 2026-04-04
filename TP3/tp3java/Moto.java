package tp3java;

public class Moto extends Vehicule{
	private boolean avecCasque;
	
	public Moto(String matricule,String marque,boolean avecCasque) {
		super(matricule, marque);
		this.avecCasque=avecCasque;
	}
	
	@Override
	public void stationner() {
		System.out.println("la moto se gare dans une place reservee auz deux-routes.");
	}
	
	@Override
	public void afficher() {
		super.afficher();
		if(avecCasque) {
			System.out.println("avec Casque");
		}else {
			System.out.println("sans Casque");
		}
	}

}
