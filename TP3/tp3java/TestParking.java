package tp3java;

public class TestParking {

	public static void main(String[] args) {
          Vehicule[] v=new Vehicule[4];
          
          v[0]=new Voiture("39/3456","Porshe",5);
          v[1]=new Voiture("39/44222","lamburgini",2);
          v[2]=new Moto("12B99","appolo",false);
          v[3]=new Camion("39/4232","bedford",5000);
          
          System.out.println("===================================================="); 
          System.out.println("la parcouur de tous les vehicule");         
          for(Vehicule vehicule:v) {
        	  vehicule.stationner();
        	  vehicule.afficher();
          }
          System.out.println("");         
          System.out.println("la parcouur de tous les voiture");         
          for(Vehicule vehicule:v) {
        	  if(vehicule instanceof Voiture) {
            	  vehicule.afficher();
        	  } 
          }
          
          System.out.println("===================================================="); 
          Vehicule x = new Moto("11C22", "Yamaha", true);

          if (x instanceof Voiture) {
              Voiture v1 = (Voiture) x;
              System.out.println("Downcasting reussi ");
          } else {
              System.out.println("Downcasting impossible ");
          }
          
          
          
          
	}

}
