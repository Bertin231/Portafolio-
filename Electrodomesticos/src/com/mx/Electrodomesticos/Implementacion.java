package com.mx.Electrodomesticos;

import java.util.HashMap;

public class Implementacion implements IMetodos {
	
	//sintaxis de hashMap
	//HashMap<clave, Valor> hash = new HashMap<Clavw , valor>
	//HashMap es una libreria de java.util
	//KeyDataType ->Clase contenedora del dato primitivo de nuestra clave
	//valueDataType ->el nombre de la clave 
	//nombre ->asignado por el programador
	// new-> es una palabra reservada para invocar al constructor
	
	HashMap<Integer, Electrodomesticos> hash = new HashMap<Integer, Electrodomesticos>();

	@Override
	public void guardar(Electrodomesticos electrodomestico) {
		// TODO Auto-generated method stub
		hash.put(electrodomestico.getClave(),electrodomestico);
	}

	@Override
	public Electrodomesticos buscar(Electrodomesticos electrodomestico) {
		// TODO Auto-generated method stub
		return hash.get(electrodomestico.getClave());
	}

	@Override
	public void editar(Electrodomesticos electrodomestico) {
		// TODO Auto-generated method stub
		//al agregar un objeto con clave existente este sera remplazado
		hash.replace(electrodomestico.getClave(), electrodomestico);
	}

	@Override
	public void eliminar(Electrodomesticos electrodomestico) {
		// TODO Auto-generated method stub
		hash.remove(electrodomestico.getClave());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}
	
	public void contar() {
		System.out.println("el hashMap contiene  " +hash.size()+ " electrodomestico.");
		
		
	}

}
