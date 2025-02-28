package Entidades;

public class Piano extends Instrumento{

	private int noTeclas;
	
	public String mostrarD() {
		return "Piano\n"+"Marca " + this.marca + "\nColor " +this.color+"\nNombre "+this.nombre+ "\nNumero de Teclas "+this.noTeclas;
	}
	
	public Piano () {
		
	}

	public Piano(String marca, String color, String nombre, int noTeclas) {
		super(marca, color, nombre);
		this.noTeclas = noTeclas;
	}

	public int getNoTeclas() {
		return noTeclas;
	}

	public void setNoTeclas(int noTeclas) {
		this.noTeclas = noTeclas;
	}

	@Override
	public String toString() {
		return "Piano [marca= " + marca + ", color= " + color + ", nombre= " + nombre + ", noTeclas= " + noTeclas + "]\n";
	}
	
	
	
}
