package Entidades;

public class Metro extends Transporte{

	private String paradas;
	private String maquinista;
	private double horario;
	
	
	@Override
	public void iniciarRuta() {
		// TODO Auto-generated method stub
		System.out.println("Las paradas se realizaran en tiempo y forma comienza a las 6AM");
		
	}
	
	public Metro() {
		
	}

	public Metro(String nombre, String color, int noAsignado, double precio, String mantenimiento, String paradas,
			String maquinista, double horario) {
		super(nombre, color, noAsignado, precio, mantenimiento);
		this.paradas = paradas;
		this.maquinista = maquinista;
		this.horario = horario;
	}

	public String getParadas() {
		return paradas;
	}

	public void setParadas(String paradas) {
		this.paradas = paradas;
	}

	public String getMaquinista() {
		return maquinista;
	}

	public void setMaquinista(String maquinista) {
		this.maquinista = maquinista;
	}

	public double getHorario() {
		return horario;
	}

	public void setHorario(double horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Metro [nombre=" + nombre + ", color=" + color + ", noAsignado=" + noAsignado + ", precio=" + precio
				+ ", mantenimiento=" + mantenimiento + ", paradas=" + paradas + ", maquinista=" + maquinista
				+ ", horario=" + horario + "]\n";
	}
	
	
	
	

}
