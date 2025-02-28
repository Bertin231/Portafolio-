package Estudiantes;


public interface EstudianteService {

	public void guardar(Estudiante estudiante);
	
	public  Estudiante buscar(int estudiante);
	
	public void editar(int estudi, Estudiante estuidante);
	
	public void eliminar(int estudiante);
	
	public void mostrar();
}
