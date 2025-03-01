package Principal;

import java.util.ArrayList;
import java.util.List;

import Entidad.Alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Alumno> lista = new ArrayList<Alumno>();
		
		
		lista.add(new Alumno(23452,"German","Lorenzo","Martinez",23,"Lic. Psicologia","BuAP"));
		lista.add(new Alumno(34452, "Gerardo", "Lorenzo", "Morales", 19, "Lic. Medicina", "BUAP"));
		lista.add(new Alumno(46516,"Uriel","Lara","Guzman",20,"Ing. sistemas ","GtPA"));
		lista.add(new Alumno(84663,"Raziel","Monarca","Herrera",45,"Ing. tics","tuTR"));
		lista.add(new Alumno(13524, "MATIAS", "GALLARDO", "GODINEZ", 53, "LIC.AGRONOMIA", "UPT"));
		lista.add(new Alumno(13201, "MATUS", "GALINDO", "DIAZ", 13, "ING.ARQUITECTURA", "HHU"));
		lista.add(new Alumno(23452, "Alejandra", "Ramirez", "Sotelo", 29, "Lic. Abogada", "UAEM"));
		lista.add(new Alumno(23452, "Ernesto", "Lopez", "aranda", 31, "Ing. Agronomo", "UNAM"));
		lista.add(new Alumno(45113, "Damian", "Gutierrez", "Martinez", 20, "lic. derecho", "unam"));
		lista.add(new Alumno(163451, "Isabel", "Areiza", "Miguel", 22, "lic. administracion", "upaep"));
		
		
		/*Sintaxis lambda 
		 * (arg1, arg1 ...) -> (cuerpo);
		 *                      (tipo, tipo 2, arg2 ...)-> (cuerpo);*/
		 
		 
		 lista.forEach(
				 //exprecion
				 (alumno) -> {System.out.println("Nombre del alumno: "+ alumno.getNombre());} 
				 );
		 //detalle del alumno
		 System.out.println("\nDetalle del alumno\n");
		 //imprimir informacion usando filtros 
		 lista.stream().filter(
				 //imprimir la informacion con filtros
				 arq -> arq.getUniversidad().equalsIgnoreCase("buap")
				 ).forEach(
						 //expresion lambda
						 alumno -> System.out.println("Nombre: "+alumno.getNombre()+ "estudia: "+ alumno.getCarrera()
						 + "en la universidad" + alumno.getUniversidad())
						 );
		 
		 // expresion lambda con interfaz funcional
		 ISaludo mensaje = (saludo, despedida) -> saludo + " y " + despedida;
		 System.out.println("Expresiones lambda con 1 parametro:  \n"
		 + mensaje.saludar("Mensaje con expresion", "\n Hasta luego"));
		 
		 
		 //-----------------------------------------------------------------------------------------
		 
		//filtrar a los alumnos con la edad mayor a 22 años 
		 System.out.println("----------------------------------------------------");
		 System.out.println("EDAD MAYORES DE 22 AÑOS\n");
		 System.out.println("Alumnos que son mayores de 22 Años:");
		 lista.stream()
		         .filter(alumno -> alumno.getEdad()> 22)
		         .forEach(alumno -> System.out.println(alumno.getNombre() + "-  Edad" + alumno.getEdad()));
		 System.out.println("----------------------------------------------------");
		 
		 //filtro letra A alumnos 
		 System.out.println("----------------------------------------------------");
		 System.out.println("ALUMNOS QUE EMPIEZAN CON LA LETRA A\n");
		 lista.stream()
		        .filter(alumno -> alumno.getNombre().startsWith("A"))
		        .forEach(alumno -> System.out.println(alumno.getNombre()));
		 System.out.println("----------------------------------------------------");
		 //para ordenar por nombres 
		 System.out.println("----------------------------------------------------");
		 System.out.println("SE ORDENARON LOS ALUMNOS POR NOMBRE A\n");
		 lista.stream()
		       .sorted((n1, n2) -> n1.getNombre().compareTo(n2.getNombre()))
		       .forEach(alumno -> System.out.println(alumno.getNombre()));
		 System.out.println("----------------------------------------------------");
		 
		 //Contar los alumnos de medicina 
		 System.out.println("----------------------------------------------------");
		 System.out.println("\nLOS ALUMNOS DE MEDICIONA SON");
		 long countMedicina = lista.stream()
		            .filter(alumno -> alumno.getCarrera().toLowerCase().contains("medicina"))
		            .count();
		        System.out.println("\nCantidad de alumnos en la carrera de Medicina: " + countMedicina);
		        System.out.println("----------------------------------------------------");
		        
		  //Nombres en mayusculas
		        System.out.println("----------------------------------------------------");
		        System.out.println("LOS NOMBRES EN MAYUSCULAS SON:");
		        lista.stream()
		             .map(alumno -> alumno.getNombre().toUpperCase())
		             .forEach(nombre -> System.out.println(nombre));
		        System.out.println("----------------------------------------------------");
		 
		   //Promedio de las edades de todos los alumnos
		        System.out.println("----------------------------------------------------");
		        System.out.println("EL PROMEDIO DE LAS EDADES ES:");
		        double promedioEdad = lista.stream()
		        		.mapToInt(Alumno::getEdad)
		        		.average()
		        		.orElse(0.0);
		        System.out.println("\nPromedio: "+ promedioEdad);
		        System.out.println("----------------------------------------------------");
		        
		   //Verificacion de si existe un alumnos de la carrera de aquitetura
		        System.out.println("----------------------------------------------------");
		        System.out.println("EXISTENCIA DE ALGUN ALUMNO EN CARRERA DE ARQUITECTURA");
		        boolean existeArquitectura = lista.stream()
		        		.anyMatch(alumno -> alumno.getCarrera().toLowerCase().contains("arquitectura"));
		        System.out.println("\n¿Exite algun Alumno en la carrera de aquitectura" + (existeArquitectura ? "\nSI" : "\nNO" ));
		        System.out.println("----------------------------------------------------");
		        
		        
		        //Busco la ecual y verifico que este mismo tenga ing
		        System.out.println("----------------------------------------------------");
		        System.out.println("\nALUMNOS DE LA UNIVERSIDAD UNAM Y QUE TINENE CARRERAS ING:");
		        lista.stream()
		            .filter(alumno -> alumno.getUniversidad().equalsIgnoreCase("UNAM") && alumno.getCarrera().toLowerCase().contains("ing. sistemas"))
		            .forEach(alumno -> System.out.println(alumno.getNombre() + " - " + alumno.getCarrera() + " - " + alumno.getUniversidad()));
		        System.out.println("----------------------------------------------------");
		        
		       
	}
	
	

}
