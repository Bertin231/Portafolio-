package com.mx.Movies;

public interface Metodos  {

	public void guardar(Movies movi);
	public void editar(int cartelera, Movies movi);
	public void mostrar();
	public void eliminar(int cartelera);
	public Movies buscar(int cartelera);
	
}
