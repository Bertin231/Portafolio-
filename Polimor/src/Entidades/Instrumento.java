package Entidades;

public class Instrumento {

	protected String marca;
	protected String color;
	protected String nombre;
	
	
	public String mostrarD() {
		return "Instrumento\n"+"Marca " + this.marca + "\nColor " +this.color+"\nNombre "+this.nombre;
	}
	
	public Instrumento() {
		
	}

	public Instrumento(String marca, String color, String nombre) {
		super();
		this.marca = marca;
		this.color = color;
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Instrumento [marca= " + marca + ", color= " + color + ", nombre= " + nombre + "]\n";
	}
	
	
	
}
