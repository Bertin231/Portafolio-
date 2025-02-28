package Herencia;

public class Escudero extends Guerrero {
	
	private String region;
	private String orden;
	
	
	public Escudero() {
		
	}


	public Escudero(String nombre, String rango, int edad, double altura, String raza, String region, String orden) {
		super(nombre, rango, edad, altura, raza);
		this.region = region;
		this.orden = orden;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getOrden() {
		return orden;
	}


	public void setOrden(String orden) {
		this.orden = orden;
	}


	@Override
	public String toString() {
		return "Escudero [nombre= " + nombre + ", rango= " + rango + ", edad= " + edad + ", altura= " + altura + ", raza= "
				+ raza + ", region= " + region + ", orden= " + orden + "\n]";
	}
	

	
	
}
