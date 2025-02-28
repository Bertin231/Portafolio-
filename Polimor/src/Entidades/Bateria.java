package Entidades;

public class Bateria extends Instrumento {

	private int noTambores;
	
	public String mostrarD() {
		return "Bateria\n"+"Marca " + this.marca + "\nColor " +this.color+"\nNombre "+this.nombre+ "\nNumero de tambores "+this.noTambores;
	}
	
	public Bateria() {
		
	}

	public Bateria(String marca, String color, String nombre, int noTambores) {
		super(marca, color, nombre);
		this.noTambores = noTambores;
	}

	public int getNoTambores() {
		return noTambores;
	}

	public void setNoTambores(int noTambores) {
		this.noTambores = noTambores;
	}

	@Override
	public String toString() {
		return "Bateria [marca= " + marca + ", color= " + color + ", nombre= " + nombre + ", noTambores= " + noTambores
				+ "]\n";
	}
	
	
	
}
