package com.mx.Electrodomesticos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomesticos el1 = new Electrodomesticos(1,"refrigerador","Linea Blanca","Gris","Samsung",17320.70);
		Electrodomesticos el2 = new Electrodomesticos(2, "Lavadora", "Linea Blanca", "Blanco", "LG", 4500);
		Electrodomesticos el3 = new Electrodomesticos(3,"lavadora","linea blanca", "rojo", "mitage", 20353.70);
		Electrodomesticos el4 = new Electrodomesticos(4,"lavadora","Linea Blanca","Blanco","LG",19360.76);
		Electrodomesticos el5 = new Electrodomesticos(5,"Pantalla","Tecnología","Negro","LG",10530.23);
		Electrodomesticos el6 = new Electrodomesticos(6, "Plancha", "Linea blanca", "Azul", "oster", 3000);
		Electrodomesticos el7 = new Electrodomesticos(7, "Plan", "Li blanca", "Azul", "oster", 3000);
		
		
		Electrodomesticos elec = null;
		
		Implementacion imp = new Implementacion();
		
		imp.guardar(el1);
		imp.guardar(el2);
		imp.guardar(el3);
		imp.guardar(el4);
		imp.guardar(el5);
		imp.guardar(el6);
		imp.guardar(el7);
		
		
			
		
		
	}

}


/*

//mostrar
imp.mostrar();
//buscar
elec = new Electrodomesticos(4);
elec = imp.buscar(elec);
System.out.println("Encopntrado:  " + elec);

//editar
elec = new Electrodomesticos(2);
elec = imp.buscar(elec);
elec.setColor("MORADO");
elec.setMarca("MABE");
imp.editar(elec);
imp.mostrar();

//eliminar 
elec = new Electrodomesticos(3);
elec = imp.buscar(elec);
imp.eliminar(elec);
imp.mostrar();

//contar 
imp.contar();
*/
