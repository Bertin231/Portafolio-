package Entidades;

public class Arboles {

	private String nombre;
	private String tipo;
	private String temporada;
	private double precio;
	private int tamaño;
	
	public Arboles() {
		
	}

	public Arboles(String nombre, String tipo, String temporada, double precio, int tamaño) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.temporada = temporada;
		this.precio = precio;
		this.tamaño = tamaño;
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

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Arboles [nombre=" + nombre + ", tipo=" + tipo + ", temporada=" + temporada + ", precio=" + precio
				+ ", tamaño=" + tamaño + "\n]";
	}
	
	
	
}
