package com.mx.Coche;

public class Coche {
//declracion de atributos 
	private String marca;
	private String subMarca;
	private int modelo;
	private String color;
	private String transmision;
	private double precio;
	
	//Constructor por defecto o constructor vacio
	public Coche() {
		
	} 
	
	//Constructor Parametrizado: Inicializar el objeto con valores especificos son atributos
	public Coche(String marca, String subMarca, int modelo, String color, String transmicion, double precio) {
		this.marca=marca;
		this.subMarca=subMarca;
		this.modelo=modelo;
		this.color=color;
		this.transmision=transmicion;
		this.precio=precio;
	} 
	//metodo get y set 
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getSubMarca() {
		return subMarca;
	}
	public void setSubMarca(String subMarca) {
		this.subMarca=subMarca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo=modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getTransmision() {
		return transmision;
	}
	public void setTransmision(String transmision) {
		this.transmision=transmision;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	//metodo toString declaracion en las funciones sirve para cualquier objeto en cadena (String)
	//se utiliza para representar un objeto en cadena y los convierte en legibles
	public String toString() {
		return "Coche[" + " marca = " + marca + "subMarca =" + subMarca + "modelo =" + modelo + "color =" + color + "transmision=" + transmision + 
				" precio=" + precio +"]\n"; 
	}
}
