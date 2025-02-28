package Entidades;

public class Turismo extends Vehiculo{

	private int numAsientos;
	
	public String mostrarDatos() {
		return "Turismo\n" + "Marca: " +this.marca + "\nSub Marca"+this.subMarca+
				"\nModelo: "+ this.modelo+ "\nNumero de asientos" +this.numAsientos;
	}	
	
	public Turismo () {
		
	}

	public Turismo(String marca, String subMarca, String modelo, int numAsientos) {
		super(marca, subMarca, modelo);
		this.numAsientos = numAsientos;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	@Override
	public String toString() {
		return "Turismo [marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", numAsientos="
				+ numAsientos + "]\n";
	}

	
	
	
	
}
