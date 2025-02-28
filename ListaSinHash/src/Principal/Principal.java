package Principal;

import Entidades.Animales;
import Entidades.Arboles;
import Entidades.Bebidas;
import Implementacion.ImpAnimales;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#################################################################");
		System.out.println("SOLO ANIMALES");

		Animales ani1 = new Animales(1,"Perro","canino","blanco",5,10);
		Animales ani2 = new Animales(2,"Gato","Gatuno","negro",10,2);
		Animales ani3 = new Animales(3,"Perico","Ave","verde",15,3);
		Animales ani4 = new Animales(4,"Vaca","Animal","blanco",20,6);
		Animales ani5 = new Animales(5,"Raton","Ruedor","gris",25,7);
		
		
		Animales anima = null;
		
		ImpAnimales impA = new  ImpAnimales();
		
		impA.guardar(ani1.getNombre(), ani1);
		impA.guardar(ani2.getNombre(), ani2);
		impA.guardar(ani3.getNombre(), ani3);
		impA.guardar(ani4.getNombre(), ani4);
		impA.guardar(ani5.getNombre(), ani5);
		
		impA.mostrar();
		
		System.out.println("BUSCANDO ---------------------");
		
		anima = (Animales) impA.buscar(ani1.getNombre());
		System.out.println("Encontrada " + anima);
		
		System.out.println("BUSCANDO ---------------------");
		
		//editar
		anima = (Animales)impA.buscar(ani2.getNombre());
		anima.setColor("DORADO");
		impA.editar(ani1.getNombre(), anima);
		System.out.println("Editada:  " + anima);
		
		//eliminar
		anima = (Animales)impA.buscar(ani5.getNombre());
		impA.eliminar(ani4.getNombre());
		impA.mostrar();
		
		//contar
		impA.contar();
		
		
		System.out.println("#################################################################");
		System.out.println("SOLO ARBOLES");
		
		
		
		Arboles ar1 = new Arboles("Pino","Roble","Primavera", 50,250);
		Arboles ar2 = new Arboles("palmera","caoba","verano", 70,850);
		Arboles ar3 = new Arboles("Sakura","tinto","Primavera", 80,460);
		Arboles ar4 = new Arboles("Bananero","fragil","otoño", 60,350);
		Arboles ar5 = new Arboles("Cocotero","robusto","invierno", 200,950);
		
		Arboles arbol = null;
		
		ImpAnimales impAA = new  ImpAnimales();
		
		impAA.guardar(ar1.getNombre(), ar1);
		impAA.guardar(ar2.getNombre(), ar2);
		impAA.guardar(ar3.getNombre(), ar3);
		impAA.guardar(ar4.getNombre(), ar4);
		impAA.guardar(ar5.getNombre(), ar5);
		
        impAA.mostrar();
        
        
        System.out.println("BUSCANDO ---------------------");
        
		arbol = (Arboles) impAA.buscar(ar1.getNombre());
		System.out.println("Encontrada " + arbol);
		
		System.out.println("BUSCANDO ---------------------");
		
		//editar
		arbol = (Arboles)impAA.buscar(ar2.getNombre());
		arbol.setTipo("aBRILLLLL");
		impAA.editar(ar1.getNombre(), arbol);
		System.out.println("Editada:  " + arbol);
		
		//eliminar
		arbol = (Arboles)impAA.buscar(ar5.getNombre());
		impAA.eliminar(ar4.getNombre());
		impAA.mostrar();
		
		//contar
		impAA.contar();
		
		
		System.out.println("#################################################################");
		System.out.println("SOLO BEBIDAS");
		
		
		Bebidas be1 = new Bebidas("Azulito","Azul","Mexico",1950,50);
		Bebidas be2 = new Bebidas("Rojito","rojo","china",1960,70);
		Bebidas be3 = new Bebidas("Morado","Morado","panama",1970,150);
		Bebidas be4 = new Bebidas("Manza Verde","Verde","egipto",1985,60);
		Bebidas be5 = new Bebidas("Pantera Rosa","Rosa","colombia",1945,90);
		
		Bebidas bebid = null;
		
		ImpAnimales impB = new  ImpAnimales();
		
		impB.guardar(be1.getNombre(), be1);
		impB.guardar(be2.getNombre(), be2);
		impB.guardar(be3.getNombre(), be3);
		impB.guardar(be4.getNombre(), be4);
		impB.guardar(be5.getNombre(), be5);

		impB.mostrar();
		
		System.out.println("BUSCANDO ---------------------");
		
		bebid = (Bebidas) impB.buscar(be1.getNombre());
		System.out.println("Encontrada " + bebid);
		
		System.out.println("BUSCANDO ---------------------");
		
		//editar
		bebid = (Bebidas)impB.buscar(be2.getNombre());
		bebid.setColor("DORADO DIAMANTE");
		impB.editar(be1.getNombre(), bebid);
		System.out.println("Editada:  " + bebid);
		
		//eliminar
		bebid = (Bebidas)impB.buscar(be5.getNombre());
		impB.eliminar(be4.getNombre());
		impB.mostrar();
		
		//contar
		impB.contar();


		
	}

}
