package Pruebas;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciamos
		Principal obj1 = new Principal();
		Principal obj2 = new Principal();
		
		
		System.out.println("obj1" + obj1.frase2);//miembro de instnacia 
		System.out.println("obj2" + Principal.frase3);//miembro a traves de una clase 
		System.out.println("obj3" + Principal.frase1);
		
		
		
		
	}

}
