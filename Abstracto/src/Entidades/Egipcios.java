package Entidades;

public class Egipcios extends Dioses {

	private String color;
	private int brillo;
	private double resos;
	
	
	@Override
	public void Deidad() {
		// TODO Auto-generated method stub
		System.out.println("Las deidades no nacen se hacen");
	}
	
	
	public Egipcios() {
		
	}


	public Egipcios(String nombre, String mitologia, String elemento, int año, int edad, String color, int brillo,
			double resos) {
		super(nombre, mitologia, elemento, año, edad);
		this.color = color;
		this.brillo = brillo;
		this.resos = resos;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getBrillo() {
		return brillo;
	}


	public void setBrillo(int brillo) {
		this.brillo = brillo;
	}


	public double getResos() {
		return resos;
	}


	public void setResos(double resos) {
		this.resos = resos;
	}


	@Override
	public String toString() {
		return "Egipcios [nombre=" + nombre + ", mitologia=" + mitologia + ", elemento=" + elemento + ", año=" + año
				+ ", edad=" + edad + ", color=" + color + ", brillo=" + brillo + ", resos=" + resos + "]\n";
	}
	
	

}
