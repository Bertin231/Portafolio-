package Entidades;

public class Deportivo extends Vehiculo {

	private int noCilindros;
	
	public String mostrarDatos() {
		return "Deportivo\n" + "Marca: " +this.marca + "\nSub Marca"+this.subMarca+"\nModelo: "+ this.modelo+ 
				"\nNumero de Silindros" +this.noCilindros;
	}	
	
	public Deportivo() {
		
	}

	public Deportivo(String marca, String subMarca, String modelo, int noCilindros) {
		super(marca, subMarca, modelo);
		this.noCilindros = noCilindros;
	}

	public int getNoCilindros() {
		return noCilindros;
	}

	public void setNoCilindros(int noCilindros) {
		this.noCilindros = noCilindros;
	}

	@Override
	public String toString() {
		return "Deportivo [marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", noCilindros="
				+ noCilindros + "]\n";
	}

	
	
	
}
