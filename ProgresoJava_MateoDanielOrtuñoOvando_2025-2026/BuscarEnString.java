import java.util.Scanner;

public class BuscarEnString{
	public static void main(String[]args){
		//variables y objetos
		//6. Algoritmo que indique si una cadena se encuentra dentro de otra. 
		//Ampliación: modifica el algoritmo 
		//para que indique en qué posición empieza la cadena contenida.

		Scanner scanner= new Scanner(System.in);
		String origen, cadbuscar;
		//inicializar cadenas
		System.out.println("Cadena origen: ");
		origen=scanner.nextLine();
		System.out.println("Cadena cadbuscar: ");
		cadbuscar=scanner.nextLine();
		//Buscar cadbuscar en origen
		System.out.println("Esta contenida : " + origen.contains(cadbuscar));
		
		
	}
}