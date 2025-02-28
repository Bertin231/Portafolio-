package Entidades;

public class Producto {
    protected String codigo;
    protected String nombre;
    protected double precio;

    // Constructor
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString() para representar el objeto en formato de cadena
    @Override
    public String toString() {
        return "Producto [Código: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio + "]";
    }

    // Método para mostrar detalles del producto
    public void mostrarDetalles() {
        System.out.println(this.toString());
    }
}
