package Herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Escudero escu1 = new Escudero("Jose","Escudero",25,1.25,"Nordica","Notergam","La horden de Thor");
		
		System.out.println(escu1);
		
		escu1.setOrden("LA ORDEN DE LOKI");
		escu1.setRango("REY");
		System.out.println(escu1);
		
		System.out.println("-----------------------------------------------");
		escu1.Entrenar(); 
		System.out.println("-----------------------------------------------");

	}

}
