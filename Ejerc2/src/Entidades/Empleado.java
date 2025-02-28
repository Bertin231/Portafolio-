package Entidades;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstracto para calcular el salario
    public abstract void calcularSalario();

    // Método toString para mostrar información del empleado
    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Salario: " + salario;
    }
}