package Serie;

import Entregable.Entregable;

public class Serie implements Entregable {

	public String titulo;
	public int noTemporada;
	public boolean entregado;
	public String genero;
	public String creador;
	
	
	public Serie() {
		
	}


	public Serie(String titulo, int noTemporada, boolean entregado, String genero, String creador) {
		super();
		this.titulo = "";
		this.noTemporada = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}


	public Serie(String titulo,String creador ) {
		super();
		this.titulo = titulo;
		this.noTemporada=3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}


	public Serie(String titulo, int noTemporada,  String genero, String creador) {
		super();
		    this.titulo = titulo;
	        this.noTemporada = noTemporada;
	        this.entregado = false;
	        this.genero = genero;
	        this.creador = creador;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNoTemporada() {
		return noTemporada;
	}


	public void setNoTemporada(int noTemporada) {
		this.noTemporada = noTemporada;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
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
		if(a instanceof Serie) {
			Serie otraSerie = (Serie) a;
			return Integer.compare(this.noTemporada,otraSerie.getNoTemporada() );
		}
		return 0;
		
	}


	@Override
	public String toString() {
		return "Serie [titulo= " + titulo + ", noTemporada= " + noTemporada + ", entregado= " + entregado + ", genero= "
				+ genero + ", creador= " + creador + "]\n";
	}
	
	
	
	
	
	
	
}
