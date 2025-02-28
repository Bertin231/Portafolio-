package Principal;

import Entidades.Autobus;
import Entidades.Metro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autobus auto = new Autobus("Micro","Naranja",125,15.220,"Lunes","Heroes - Indios Verdes","JAVIER",2015);
		System.out.println("-------------------------------------------");
		System.out.println(auto);
		auto.iniciarRuta();
		auto.RUT(auto.getNombre(),auto.getRutas());
		System.out.println("-------------------------------------------");
		
		System.out.println("-------------------------------------------");
		Metro met = new Metro("Bala","Rojo",506,25.01,"Martes","Bellas Artes - CU","JOSE",13.20);
		System.out.println(met);
		met.iniciarRuta();
		met.RUT(met.getNombre(),met.getParadas());
		System.out.println("-------------------------------------------");
		
		
		
	}

}
