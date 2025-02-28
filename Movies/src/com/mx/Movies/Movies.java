package com.mx.Movies;

public class Movies {

	private String nombre;
	private String genero;
	private int año;
	private double precio;
	private String director;
	
	
	public Movies() {
		
	}
//parametros
	public Movies(String nombre, String genero, int año, double precio, String director) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.año = año;
		this.precio = precio;
		this.director = director;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movies [nombre= " + nombre + ", genero= " + genero + ", año= " + año + ", precio= " + precio + ", director= "
				+ director + "]\n";
	}
	
	
	
	
	
	
	
}
