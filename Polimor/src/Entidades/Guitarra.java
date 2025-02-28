package Entidades;

public class Guitarra extends Instrumento {

	private int precio;
	
	public String mostrarD() {
		return "Guitarra\n"+"Marca " + this.marca + "\nColor " +this.color+"\nNombre "+this.nombre+ "\nPrecio de Guitarra "+this.precio;
	}
	
	public Guitarra() {
		
	}

	public Guitarra(String marca, String color, String nombre, int precio) {
		super(marca, color, nombre);
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Guitarra [marca= " + marca + ", color= " + color + ", nombre= " + nombre + ", precio= " + precio + "]\n";
	}
	
	
	
}
