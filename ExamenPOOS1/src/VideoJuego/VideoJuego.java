package VideoJuego;

import Entregable.Entregable;
import Serie.Serie;

public class VideoJuego implements Entregable {

	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	
	public VideoJuego() {
		
	}


	public VideoJuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compañia) {
		super();
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}
	
	public VideoJuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
		
	}


	public VideoJuego(String titulo, int horasEstimadas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.compañia = compañia;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getHorasEstimadas() {
		return horasEstimadas;
	}


	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCompañia() {
		return compañia;
	}


	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}


	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
	}


	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}


	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return entregado;
	}


	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		if(a instanceof VideoJuego) {
			VideoJuego otroJuego = (VideoJuego) a;
			return Integer.compare(this.horasEstimadas, otroJuego.getHorasEstimadas() );
		}
		return 0;
		
		
	}


	@Override
	public String toString() {
		return "VideoJuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]\n";
	}
	
	
	
	
	
	
	
	
	
	
}
