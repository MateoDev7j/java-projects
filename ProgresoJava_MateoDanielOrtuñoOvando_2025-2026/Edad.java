import java.util.Scanner;
public class Edad{
	public static void main(String[]args){
		//declaramos variables
		int edad;
		String estado;
		Scanner scanner = new Scanner(System.in);
		
		//resolvemos
		System.out.println("Ingresa la edad ");
		edad = scanner.nextInt();
		estado=  edad>= 18 ? "mayor de edad":"menor de edad";
		System.out.println(" usted es " + estado );	
	}
}