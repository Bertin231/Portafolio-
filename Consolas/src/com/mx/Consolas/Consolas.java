package com.mx.Consolas;

public class Consolas {
	
private String nombre;
private String marca;
private double precio;
private int generacion;
private String color;


public Consolas() {
	
}

public Consolas(String nombre, String marca, double precio, int generacion, String color) {
	this.nombre=nombre;
	this.marca=marca;
	this.precio=precio;
	this.generacion=generacion;
	this.color=color;
}



public String getNombre(){
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca=marca;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio=precio;
}
public int getGeneracion() {
	return generacion;
}
public void setGeneracion(int generacion) {
	this.generacion=generacion;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color=color;
}

public String toString() {
	return "Consolas[" + " nombre= " + nombre + " marca= " + marca + " precio= " + precio + " generacion= " + generacion + " color= " + color + "]\n";
}



}
