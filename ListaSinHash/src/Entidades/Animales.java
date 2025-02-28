package Entidades;

public class Animales {

	private int sku;
	private String nombre;
	private String tipo;
	private String color;
	private double vacunas;
	private int años;
	
	
	public Animales() {
		
	}


	public Animales(int sku, String nombre, String tipo, String color, double vacunas, int años) {
		super();
		this.sku = sku;
		this.nombre = nombre;
		this.tipo = tipo;
		this.color = color;
		this.vacunas = vacunas;
		this.años = años;
	}


	public int getSku() {
		return sku;
	}


	public void setSku(int sku) {
		this.sku = sku;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getVacunas() {
		return vacunas;
	}


	public void setVacunas(double vacunas) {
		this.vacunas = vacunas;
	}


	public int getAños() {
		return años;
	}


	public void setAños(int años) {
		this.años = años;
	}


	@Override
	public String toString() {
		return "Animales [sku=" + sku + ", nombre=" + nombre + ", tipo=" + tipo + ", color=" + color + ", vacunas="
				+ vacunas + ", años=" + años + "\n]";
	}
	
	
	
	
}
