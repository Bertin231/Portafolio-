package Estudiantes;

import java.util.ArrayList;
import java.util.List;

public class EstudianteServiceImpl implements EstudianteService {

	List<Estudiante> listE = new ArrayList<Estudiante>();
	
	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		listE.add(estudiante);
	}

	@Override
	public Estudiante buscar(int estudiante) {
		// TODO Auto-generated method stub
		return listE.get(estudiante);
	}


	@Override
	public void eliminar(int estudiante) {
		// TODO Auto-generated method stub
		listE.remove(estudiante);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(listE);
	}

	@Override
	public void editar(int estudi, Estudiante estuidante) {
		// TODO Auto-generated method stub
		listE.set(estudi, estuidante);
		
	}

	public void contar() {
		int cont = listE.size();
		System.out.println("hay tantos" + cont + "alumnos");
	}
	
	
	
}
