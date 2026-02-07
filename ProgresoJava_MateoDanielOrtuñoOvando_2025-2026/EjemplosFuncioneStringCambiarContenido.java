import java.util.Scanner;

public class EjemplosFuncioneStringCambiarContenido{
	public static void main(String[]args){
		//variables y objetos
		//5. Lee dos variables String por teclado e intercambia sus contenidos.
		Scanner scanner= new Scanner(System.in);
		String cad1, cad2, aux;
		//inicializar cadenas
		System.out.println("Cadena-1: ");
		cad1=scanner.nextLine();
		System.out.println("Cadena-2: ");
		cad2=scanner.nextLine();	
		
		//intercambiar el contenido
		
		aux = cad1;
		cad1 = cad2;
		cad2 = aux;
		
		System.out.println("Cadena-1: " + cad1);
		System.out.println("Cadena-2: "+ cad2);
	}
}	
		
		