package Herencia;

public class Guerrero {

	protected String nombre;
	protected String rango;
	protected int edad;
	protected double altura;
	protected String raza;
	
	
	public Guerrero() {
		
	}


	public Guerrero(String nombre, String rango, int edad, double altura, String raza) {
		super();
		this.nombre = nombre;
		this.rango = rango;
		this.edad = edad;
		this.altura = altura;
		this.raza = raza;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRango() {
		return rango;
	}


	public void setRango(String rango) {
		this.rango = rango;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	@Override
	public String toString() {
		return "Guerrero [nombre= " + nombre + ", rango= " + rango + ", edad= " + edad + ", altura= " + altura + ", raza= "
				+ raza + "\n]";
	}
	
	public void Entrenar() {
		System.out.println("Entreno diario para ser el mejor guerrero");
		
	}
	
	
}
