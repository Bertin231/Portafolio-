package Principal;

import java.util.ArrayList;
import java.util.List;

import Entidades.Empleado;
import Entidades.MedioTiempo;
import Entidades.TiempoCompleto;

public class Principal {  // Cambié Main por Principal aquí

    public static void main(String[] args) {
        // Crear objetos de empleados
        TiempoCompleto empleado1 = new TiempoCompleto("Juan Pérez", 3000);  // Salario base mensual
        MedioTiempo empleado2 = new MedioTiempo("Ana García", 15, 120);  // 15 por hora, 120 horas trabajadas

        // Crear la lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        
        // Agregar empleados a la lista
        empleados.add(empleado1);
        empleados.add(empleado2);

        // Calcular los salarios de los empleados
        double nominaTotal = 0;
        for (Empleado empleado : empleados) {
            empleado.calcularSalario();  // Calcula el salario de cada empleado
            nominaTotal += empleado.getSalario(); // Suma al total de la nómina
        }

        // Imprimir la nómina total y la información de cada empleado
        System.out.println("Nómina Total: " + nominaTotal);
        for (Empleado empleado : empleados) {
            System.out.println(empleado);  // Esto llama automáticamente a toString()
        }
    }
}