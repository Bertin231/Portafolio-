package Estudiantes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante est1 = new Estudiante("B231232","Bertin", 26);
		
		
		
		Estudiante est = null;
		
		EstudianteServiceImpl imp = new EstudianteServiceImpl();
		
		imp.guardar(est1);
		
		imp.mostrar();
		
		est = imp.buscar(0);
		System.out.println("El alumno  es: " +est);
		
		est = imp.buscar(0);
		est.setNombre("Raul");
		est.setEdad(30);
		imp.mostrar();
		
		imp.eliminar(0);
		imp.mostrar();
		
		imp.contar();
		
				
		
		
		
		
		
	}

}
