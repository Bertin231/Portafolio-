package Entidades;

public class MedioTiempo extends Empleado {
    private double salarioBase;
    private double horasTrabajadas;

    // Constructor
    public MedioTiempo(String nombre, double salarioBase, double horasTrabajadas) {
        super(nombre);  // Llamar al constructor de la clase base
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Getter y Setter para salarioBase
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Getter y Setter para horasTrabajadas
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método abstracto para calcular el salario
    @Override
    public void calcularSalario() {
        // El salario se calcula multiplicando el salario base por las horas trabajadas
        setSalario(salarioBase * horasTrabajadas);
    }

    // Sobreescribir el método toString para esta subclase
    @Override
    public String toString() {
        return "Empleado a Medio Tiempo: " + getNombre() + ", Salario: " + getSalario();
    }
}