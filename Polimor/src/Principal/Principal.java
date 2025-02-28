package Principal;

import Entidades.Bateria;
import Entidades.Guitarra;
import Entidades.Instrumento;
import Entidades.Piano;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instrumento[] ins = new Instrumento[4];
		
		ins[0] = new Instrumento("Rocksade","Negro","Violin");
		ins[1] = new Guitarra("Lomas","Blanco","Guitarra",500);
		ins[2] = new Piano("Tadre","Dorado","Piano",204);
		ins[3] = new Bateria("Bonis","Cafe","Bateria",10);
		
		    System.out.println("-------------------------------");
		for(Instrumento instru:  ins) {
			System.out.println(instru.mostrarD());
			System.out.println(instru);
			System.out.println("-------------------------------");
		}
		
		
		
		
		
	}

}
