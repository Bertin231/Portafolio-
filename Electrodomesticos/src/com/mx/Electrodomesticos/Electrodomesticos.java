package com.mx.Electrodomesticos;

public class Electrodomesticos {
	private int clave;
	private String nombre;
	private String tipo;
	private String color;
	private String marca;
	private double precio;
	
	
	public Electrodomesticos() {
		
	}


	public Electrodomesticos(int clave, String nombre, String tipo, String color, String marca, double precio) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.tipo = tipo;
		this.color = color;
		this.marca = marca;
		this.precio = precio;
	}

//solo resibe un parametro y es clave 
	public Electrodomesticos(int clave) {
		this.clave = clave;	}


	public int getClave() {
		return clave;
	}


	public void setClave(int clave) {
		this.clave = clave;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Electrodomesticos [clave= " + clave + ", nombre= " + nombre + ", tipo= " + tipo + ", color= " + color
				+ ", marca= " + marca + ", precio= " + precio + "]\n";
	}

	
	
	
	
	
	
}
