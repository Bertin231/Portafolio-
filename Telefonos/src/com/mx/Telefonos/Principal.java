package com.mx.Telefonos;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefonos tel1 = new Telefonos(1,"LG","NEGRO","si",250000);
		Telefonos tel2 = new Telefonos(2,"SAMSUNG","BLANCO","si",30000);
		Telefonos tel3 = new Telefonos(3,"STEAM","GRIS","si",90000);
		Telefonos tel4 = new Telefonos(4,"OPPO","DORADO","si",70000);
		Telefonos tel5 = new Telefonos(5,"APPLE","ROSA","si",20000);
		Telefonos tel6 = new Telefonos(6,"MOVISTAR","NEGRO","si",50000);
		
		
		Telefonos tele = null;
		
		Implementacion imp = new Implementacion();
		
		imp.guardar(tel1);
		imp.guardar(tel2);
		imp.guardar(tel3);
		imp.guardar(tel4);
		imp.guardar(tel5);
		imp.guardar(tel6);
		
		imp.mostrar();
		/*
		tele = new Telefonos(5);
		tele = imp.buscar(tele);
		System.out.println("Telefono Encontrado:  " + tele);
		
		
		tele = new Telefonos(1);
		tele = imp.buscar(tele);
		tele.setColor("AMAZUL");
		tele.setMarca("OVNI");
		imp.editar(tele);
		imp.mostrar();
		
		 
		tele = new Telefonos(2);
		tele = imp.buscar(tele);
		imp.eliminar(tele);
		imp.mostrar();
		
		 
		imp.conar();
		*/
		
		
	}

}
