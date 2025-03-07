package com.mx.Coche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Instanmciar a nuestro objeto: Mando a llamas a mi clase 
	Coche coche1 = new Coche("Toyota", "Corola",2020, "Rojo","Automatico", 255589.70);
	Coche coche2 = new Coche("Cupra", "Leon", 2024, "Negro", "Estandar", 700000);
	Coche coche3 = new Coche("Ford", "Explorer", 2024, "azul", "automatico", 302452.50);
	Coche coche4 = new Coche("Chevrolet", "Cabalier", 2022, "Azul", "estandar", 30673.70);
	Coche coche5= new Coche ("Chevrolet","Aveo", 2023, "Negro", "Estandar", 555589.70);
	Coche coche6 = new Coche("Honda",  "Civic", 2004, "Plata", "Automático", 40000.00);

	
	//asignarle un valor de busqueda
	//se declara en nulo para despues asignarle el valor que se requiera
	Coche auxCoche = null;
	
	
	//Creacion de lista
	//Es una estructura de datos que permite almacenar elementos de manera ordenada
	// se utiliza la libreria java.util. que nos ofrece la interfaz de list
	//list proporciona los metodos: añadir, eliminar , modificar y visualizar elementos dentro de la lista
	//new ArrayList<> es una implementacion concreta de la interfaz list que realiza un arreglo dinamico para almacenar informacion
	List<Coche> lista = new ArrayList<Coche>();
	
	//agregasr elementos a las listas 
	// usa el metodo ad
	
	lista.add(coche1);
	lista.add(coche2);
	lista.add(coche3);
	lista.add(coche4);
	lista.add(coche5);
	lista.add(coche6);
	
	//Creacion de mmenu interactivo 
	Scanner scan = null;
	int menuPrincipal = 0, menuSecundario=0, indice=0;
	//los menus son variables que van almacenar opciones 
	//indice va almacenar el indice de un objeto 
	
	//ahora se declara las variables locales
	String marca, subMarca, color, transmision;
	int modelo;
	double precio;
	
	//inicio de mi menu interactivo 
	//usaremos ciclo do-while: en java es una estrctura que permite ejecutar 
	// un bloque de codigo al menos una vez y continua su ejecucion hasata cumplir la condicion 
	
	do {
		System.out.println("----MENU---------------------------------------------");
		System.out.println("1.- Agregar nuevo registro");
		System.out.println("2.- Mostrar la lista ");
		System.out.println("3.- Editar");
		System.out.println("4.- Buscar un elemento");
		System.out.println("5.- Eliminar un elemento");
		System.out.println("6.- Contar todos los elementos");
		System.out.println("7.- Salir del menu");
		System.out.println("-------------------elige una opcion valida ------------");
		scan = new Scanner(System.in);
		menuPrincipal = scan.nextInt();
		
		//metodo switch o metodo case: es una estructura de control de flujo que 
		//permite ejecutar diferentes bloques de codigo basdos en el valor de una expresion
		//tambien es conocido como metodo case porque dentro de un switch se utilizan
		//varias declaraciones case para manejar los diferentes casos de una posible
		//expresion
		
	switch(menuPrincipal) {
	case 1:
		System.out.println("1.- Agregar un nuevo registro");
		System.out.println("Escribe la marca del coche");
		scan = new Scanner(System.in);
		marca = scan.nextLine();
		
		System.out.println("Escribe la subMarca del coche");
		scan = new Scanner(System.in);
		subMarca = scan.nextLine();
		
		System.out.println("Escribe el modelo del coche");
		scan = new Scanner(System.in);
		modelo = scan.nextInt();
		
		System.out.println("Escribe el color del coche");
		scan = new Scanner(System.in);
		color = scan.nextLine();
		
		System.out.println("Escribe la Transmision del coche");
		scan = new Scanner(System.in);
		transmision = scan.nextLine();
		
		System.out.println("Escribe el precio del coche");
		scan = new Scanner(System.in);
		precio = scan.nextDouble();
		
		
		//instanciar el objeto
		auxCoche = new Coche(marca, subMarca, modelo, color, transmision, precio);
		//guardar en la lista 
		lista.add(auxCoche);
		System.out.println("El registro fue existoso");
		break; // rompe el caso 1 
	case 2:
		System.out.println("2.- Mostrar la lista");
		System.out.println("la informacion almacenada es:\n" + lista);
		break;//rompe el caso
	case 3:
		System.out.println("3.- Editando un elemento");
		System.out.println("Ingresa el indice para editar");
		scan = new Scanner(System.in);
		indice = scan.nextInt();
		
		auxCoche = lista.get(indice);
		
		do {
			System.out.println("1.- Editar marca");
			System.out.println("2.- Editar la subMarca");
			System.out.println("3.- Editar el modelo");
			System.out.println("4.- Editar el color");
			System.out.println("5.- Editar la transmision");
			System.out.println("6.- Editar el precio");
			System.out.println("7.- Regresar al menu principal");
			System.out.println("-----Elige una opcion para editar-----");
			scan = new Scanner(System.in);
			menuSecundario = scan.nextInt();
			
			switch(menuSecundario) {
			case 1:
				System.out.println("Escribe la nueva marca");
				scan = new Scanner(System.in);
				marca = scan.nextLine();
				auxCoche.setMarca(marca);
				lista.set(indice,  auxCoche);
				System.out.println("Se edito correctamente la marca");
				break;
			case 2:
				System.out.println("Escribe la nueva subMarca");
				scan = new Scanner(System.in);
				subMarca = scan.nextLine();
				auxCoche.setSubMarca(subMarca);
				lista.set(indice, auxCoche);
				System.out.println("Se edito correctamente la submarca");
				break;
			case 3:
				System.out.println("Escribe el nuevo modelo");
				scan = new Scanner(System.in);
				modelo = scan.nextInt();
				auxCoche.setModelo(modelo);
				lista.set(indice, auxCoche);
				System.out.println("Se edito correctamente el modelo");
				break;
			case 4:
				System.out.println("Escribe el nuevo color");
				scan = new Scanner(System.in);
				color = scan.nextLine();
				auxCoche.setColor(color);
				lista.set(indice, auxCoche);
				System.out.println("Se edito correctamente el color");
				break;
			case 5:
				System.out.println("Escribe la nueva transmision");
				scan = new Scanner(System.in);
				transmision = scan.nextLine();
				auxCoche.setTransmision(transmision);
				lista.set(indice, auxCoche);
				System.out.println("Se edito correctamente la transmision");
				break;
			case 6:
				System.out.println("Escribe el nuevo precio");
				scan = new Scanner(System.in);
				precio = scan.nextDouble();
				auxCoche.setPrecio(precio);
				lista.set(indice, auxCoche);
				System.out.println("Se edito correctamente el precio");
				break;
			case 7:
				System.out.println("Regresando al menu Principal. . . . Regresa pronto");
				break;
				default:
					System.out.println("Indice fuera de rango Escriba una opcion valida");
					break;
			
			}
			
				
		}while(menuSecundario !=7);
		break;
	case 4:
		System.out.println("4.- Buscando un elemento");
		System.out.println("Cual es el elemento que busca?");
		scan = new Scanner(System.in);
		indice = scan.nextInt();
		auxCoche = lista.get(indice);
		System.out.println("Elemento encontrado" + auxCoche);
		break;
	case 5:
		System.out.println("5.- Eliminado elementos");
		System.out.println("Que desa eliminar?");
		scan = new Scanner(System.in);
		indice = scan.nextInt();
		lista.remove(indice);
		System.out.println("Se elimino correctamente\n lista actualizada:\n" +lista);
		break;
	case 6:
		System.out.println("6.- Contando el tamaño de la lista");
		System.out.println("Existen : " + lista.size() + "Coches en la listas");
		break;
	case 7:
		System.out.println("Saliendo del menu, Vuelve pronto ------");
		break;
		default:
			System.out.println("opcion invalida intenta con una del menu");
			break;
	}
			
	}while(menuPrincipal !=7);
	
	
	
	
	
	
    /*
	// visualizar la informacion de la lista 
	// usamos metodo de impresion
	System.out.println(lista);
	
	
	//metodo para buscar un elemento especifico en la lista
	auxCoche = lista.get(1);
	System.out.println("Elemento encontrado: " + auxCoche);
	
	//editando un elemento
	auxCoche = lista.get(0);
	auxCoche.setColor("NEGRO");
	auxCoche.setTransmision("Estandar");
	System.out.println("Elemento editado: " + auxCoche);
	
	//eliminar un elemento
	auxCoche = lista.get(5);
	lista.remove(5);
	System.out.println("Lista Actualizada: " + lista);
	
	//contando el tamño de la lista
	System.out.println("Existen: " + lista.size() + "coches en la lista");

	
	//eliminar todo de la lista
	lista.clear();
	
	//validar si la lista esta vacia
	if(lista.isEmpty()) {
		System.out.println("la lista esta vacia");
	}else{
		System.out.println("la lista es \n" + lista);
		
	}*/
	}

}
