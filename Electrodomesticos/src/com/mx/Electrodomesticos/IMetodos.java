package com.mx.Electrodomesticos;

public interface IMetodos {

	public void guardar(Electrodomesticos electrodomestico);
	
	public Electrodomesticos buscar(Electrodomesticos electrodomestico);
	
	public void editar(Electrodomesticos electrodomestico);
	
	public void eliminar(Electrodomesticos electrodomestico);
	
	public void mostrar();
	

}
