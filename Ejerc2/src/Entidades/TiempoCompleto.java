package Entidades;

public class TiempoCompleto extends Empleado {
    private double salarioBase;

    // Constructor
    public TiempoCompleto(String nombre, double salarioBase) {
        super(nombre);  // Llamar al constructor de la clase base
        this.salarioBase = salarioBase;
    }

    // Getter y Setter para salarioBase
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Implementación del método abstracto para calcular el salario
    @Override
    public void calcularSalario() {
        // El salario es igual al salario base
        setSalario(salarioBase);
    }

    // Sobreescribir el método toString para esta subclase
    @Override
    public String toString() {
        return "Empleado a Tiempo Completo: " + getNombre() + ", Salario: " + getSalario();
    }
}