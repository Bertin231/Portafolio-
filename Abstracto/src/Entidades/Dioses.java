package Entidades;

public abstract class Dioses {
	
	protected String nombre;
	protected String mitologia;
	protected String elemento;
	protected int año;
	protected int edad;
	
	
	
	public void SER(String deidad, double poder) {
		System.out.println("Yo soy:   " + deidad + " \nMi PODER ES DE:     " +poder);
		
	}
	
	
	public abstract void Deidad();
	
	public Dioses() {
		
	}


	public Dioses(String nombre, String mitologia, String elemento, int año, int edad) {
		super();
		this.nombre = nombre;
		this.mitologia = mitologia;
		this.elemento = elemento;
		this.año = año;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMitologia() {
		return mitologia;
	}


	public void setMitologia(String mitologia) {
		this.mitologia = mitologia;
	}


	public String getElemento() {
		return elemento;
	}


	public void setElemento(String elemento) {
		this.elemento = elemento;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Dioses [nombre= " + nombre + ", mitologia= " + mitologia + ", elemento= " + elemento + ", año= " + año
				+ ", edad=  " + edad + "]\n";
	}
	
	
	
	
	

}
