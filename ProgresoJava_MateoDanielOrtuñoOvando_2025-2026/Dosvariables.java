import java.util.Scanner;
public class Dosvariables{
	public static void main(String[]args){
		//declaramos variables y scanner
		String cad1, cad2, cad3;
		Scanner scanner = new Scanner(System.in);
		//resolvemos
		System.out.println("ingresa la primer cadena: ");
		cad1 = scanner.nextLine();
		
		System.out.println("Ingresa la segunda cadena: ");
		cad2 = scanner.nextLine();
		cad1 = cad2;
		cad2 = cad1;
		cad3 = cad2;
		System.out.println("cad1 es " + cad1+ "cad2 es " + cad2);
		
		
		
		
	}
}