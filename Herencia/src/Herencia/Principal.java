package Herencia;

public class Principal {

	public static void main(String[] args) {
		//instanciar
		Hijo hijo1 = new Hijo("Juan","Martinez",20,1.75,"Colombia","Azules","Robusta");
		
		
		System.out.println(hijo1);
		
		hijo1.setEdad(35);
		hijo1.setAltura(1.95);
		System.out.println(hijo1);
		
		hijo1.trabajar();
		
		
		
		

	}

}
