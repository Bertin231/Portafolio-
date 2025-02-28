package Entidades;

public class Griegos extends Dioses {

	private String rasgos;
	private String luz;
	private double ofrendas;
	
	
	@Override
	public void Deidad() {
		// TODO Auto-generated method stub
		System.out.println("Soy una deidad reconocida por mi pueblo");
		
	}
	
	
	public Griegos() {
		
	}


	public Griegos(String nombre, String mitologia, String elemento, int año, int edad, String rasgos, String luz,
			double ofrendas) {
		super(nombre, mitologia, elemento, año, edad);
		this.rasgos = rasgos;
		this.luz = luz;
		this.ofrendas = ofrendas;
	}


	public String getRasgos() {
		return rasgos;
	}


	public void setRasgos(String rasgos) {
		this.rasgos = rasgos;
	}


	public String getLuz() {
		return luz;
	}


	public void setLuz(String luz) {
		this.luz = luz;
	}


	public double getOfrendas() {
		return ofrendas;
	}


	public void setOfrendas(double ofrendas) {
		this.ofrendas = ofrendas;
	}


	@Override
	public String toString() {
		return "Griegos [nombre=" + nombre + ", mitologia=" + mitologia + ", elemento=" + elemento + ", año=" + año
				+ ", edad=" + edad + ", rasgos=" + rasgos + ", luz=" + luz + ", ofrendas=" + ofrendas + "]\n";
	}
	
	

	
	
	
	
	
	
	
}
