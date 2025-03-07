package Entidades;

public abstract class Transporte {

	protected String nombre;
	protected String color;
	protected int noAsignado;
	protected double precio;
	protected String mantenimiento;
	
	
	public void RUT(String lisTransporte,String ruta ) {
		System.out.println("La lista de Transporte es:  " +lisTransporte+ "\nLa ruta que seguira es: " + ruta );
	}
	
	public abstract void iniciarRuta();
	
	public Transporte() {
		
	}

	public Transporte(String nombre, String color, int noAsignado, double precio, String mantenimiento) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.noAsignado = noAsignado;
		this.precio = precio;
		this.mantenimiento = mantenimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoAsignado() {
		return noAsignado;
	}

	public void setNoAsignado(int noAsignado) {
		this.noAsignado = noAsignado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(String mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	@Override
	public String toString() {
		return "Transporte [nombre=" + nombre + ", color=" + color + ", noAsignado=" + noAsignado + ", precio=" + precio
				+ ", mantenimiento=" + mantenimiento + "]\n";
	}
	
	
	
	
	
}
