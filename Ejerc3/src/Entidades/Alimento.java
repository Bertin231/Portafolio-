package Entidades;

public class Alimento extends Producto {
	
    private String fechaExpiracion;

    // Constructor
    public Alimento(String codigo, String nombre, double precio, String fechaExpiracion) {
        super(codigo, nombre, precio);
        this.fechaExpiracion = fechaExpiracion;
    }

    // Getters y Setters
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Fecha de expiración: " + fechaExpiracion);
    }
}
