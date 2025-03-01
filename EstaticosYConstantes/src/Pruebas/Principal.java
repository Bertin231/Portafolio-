package Pruebas;

public class Principal {

	//los miembros estaticos : metodos o atributos que se asocian a una clase en lugar de una instancia 
	//miembros constantes: son variables mediante la ejecucion no cambian 
	
	//miebro estatico: variable que se asocia a una clase 
	public static String frase1 = "Miembro estatico";
	
	// una constante o variable final: No cambian despues de la inicializacion
	public final String frase2 = "Variable final cconstante";
	
	//constante estatico: variable final asociada a una clase 
	public static final String frase3 = "Variable Final estatica";
	
	
	public static void main(String[]args) {
		
		//acceso a miebros estaticos directamente desde mi clase 
		System.out.println(frase1);
		System.out.println(frase3);
		
		
		
		//ejemplo de el area de un circulo
		float radio = 5;
		double area = calcularAreaCirculo(radio);
		System.out.println("El area del circulo con radio: "+ radio + " es: " + area);
	}//terminar main 
	
	public static double calcularAreaCirculo(float radio) {
		return Math.PI * (radio*radio);
	}
	
}
