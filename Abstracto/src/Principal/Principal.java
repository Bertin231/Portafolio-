package Principal;

import Entidades.Egipcios;
import Entidades.Griegos;

public class Principal {

	public static void main(String[] args) {
		
		Griegos griego = new Griegos("Ares","Griega","Fisico",1500,1000,"Guerrero","Fuego",25000);
		System.out.println("-------------------------------------------");
		System.out.println(griego);
		griego.Deidad();
		griego.SER(griego.getMitologia(),griego.getOfrendas());
		System.out.println("-------------------------------------------");
		
		System.out.println("-------------------------------------------");
		Egipcios egip = new Egipcios("Ra","Egipcia","Magico",20000,59663,"Dorado",100,28880000);
		System.out.println(egip);
		egip.Deidad();
		egip.SER(egip.getMitologia(),egip.getResos());
		System.out.println("-------------------------------------------");
		
		

	}

}
