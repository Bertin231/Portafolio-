package com.mx.Telefonos;

public class Telefonos {

	private int clave;
	private String marca;
	private String color;
	private String llamadas;
	private double precio;
	
	public Telefonos() {
		
	}

	public Telefonos(int clave, String marca, String color, String llamadas, double precio) {
		super();
		this.clave = clave;
		this.marca = marca;
		this.color = color;
		this.llamadas = llamadas;
		this.precio = precio;
	}
	


	public Telefonos(int clave) {
		// TODO Auto-generated constructor stub
		this.clave = clave;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLlamadas() {
		return llamadas;
	}

	public void setLlamadas(String llamadas) {
		this.llamadas = llamadas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Telefonos [clave=" + clave + ", marca=" + marca + ", color=" + color + ", llamadas=" + llamadas
				+ ", precio=" + precio + "\n]";
	}
	
	
	
	
	
	
}
