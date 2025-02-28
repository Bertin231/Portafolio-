package Entidades;

public class Bebidas {

	private String nombre;//key mi llave 
	private String color;
	private String pais;
	private int creacion;
	private double precio;
	
	public Bebidas() {
		
	}

	public Bebidas(String nombre, String color, String pais, int creacion, double precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.pais = pais;
		this.creacion = creacion;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getCreacion() {
		return creacion;
	}

	public void setCreacion(int creacion) {
		this.creacion = creacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Bebidas [nombre=" + nombre + ", color=" + color + ", pais=" + pais + ", creacion=" + creacion
				+ ", precio=" + precio + "\n]";
	}
	
	
	
	
}
