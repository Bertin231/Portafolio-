package Principal;

import Entidades.Deportivo;
import Entidades.PickUp;
import Entidades.Turismo;
import Entidades.Vehiculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		Vehiculo[]ves = new Vehiculo[4]; 
		
		ves[0] = new Vehiculo("Honda","Civic","2002");
		ves[1] = new Deportivo("Ford","GT","2023",8);
		ves[2] = new PickUp("Toyota","tahoma","2021",30);
		ves[3] = new Turismo("Mercedes-Bens","Spinter","2025",15);
		
		for(Vehiculo vehi: ves) {
			System.out.println("-------------------------------");
			System.out.println(vehi.mostrarDatos());
			System.out.println(vehi);
			System.out.println("-------------------------------");
		}
		

	}

}
