import java.util.Scanner;

public class EjemplosFunciones1{
	public static void main(String[]args){
		//variables y objetos
		//Inicializa dos cadenas de caracteres y concatena en una tercera.
		Scanner scanner= new Scanner(System.in);
		String cad1,cad2,cad3;
		//inicializar cadenas
		System.out.println("Cadena-1: ");
		cad1=scanner.nextLine();
		System.out.println("Cadena-2: ");
		cad2=scanner.nextLine();
		
		//concatenar en una tercera
		cad3=cad1.concat(cad2);
		System.out.println(cad3);
		
		
		
	}
}