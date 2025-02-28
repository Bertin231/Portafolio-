package Principal;

import Entidades.Abogado;
import Entidades.Medico;

public class Principal {

	public static void main(String[] args) {
		// Instanciar abogado
		
		Abogado abogado = new Abogado("Raul","Mendoza",28,866666,"UNAM",5,"Fiscal","Bufete hermanos Mendoza",1550);
		System.out.println(abogado);
		abogado.trabajar();
		abogado.cobrar(abogado.getTipo(),abogado.getHonorarios());
		
		
		//medico
		
		Medico medico = new Medico("Ricardo","Martinez",32,54641,"UNAM",10,"Medico Familiar","IMSS",25632);
		System.out.println(medico);
		medico.trabajar();
		medico.cobrar(medico.getEspecialidad(),medico.getCostoConsulta());

		
	}

}
