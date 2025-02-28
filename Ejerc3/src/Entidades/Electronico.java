package Entidades;

public class Electronico extends Producto {
    private int garantia; // en meses

    // Constructor
    public Electronico(String codigo, String nombre, double precio, int garantia) {
        super(codigo, nombre, precio);
        this.garantia = garantia;
    }

    // Getters y Setters
    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Garantía: " + garantia + " meses");
    }
}
