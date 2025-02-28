package Entidades;

public class Autobus extends Transporte {

	private String rutas;
	private String conductor;
	private int modelo;
	
	
	
	@Override
	public void iniciarRuta() {
		// TODO Auto-generated method stub
		System.out.println("Las rutas pueden variar segun el trafico el incio de las rutas es a las 5:00AM.");
	}
	
	public Autobus() {
		
	}

	public Autobus(String nombre, String color, int noAsignado, double precio, String mantenimiento, String rutas,
			String conductor, int modelo) {
		super(nombre, color, noAsignado, precio, mantenimiento);
		this.rutas = rutas;
		this.conductor = conductor;
		this.modelo = modelo;
	}

	public String getRutas() {
		return rutas;
	}

	public void setRutas(String rutas) {
		this.rutas = rutas;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Autobus [nombre=" + nombre + ", color=" + color + ", noAsignado=" + noAsignado + ", precio=" + precio
				+ ", mantenimiento=" + mantenimiento + ", rutas=" + rutas + ", conductor=" + conductor + ", modelo="
				+ modelo + "]\n";
	}
	
	

}
