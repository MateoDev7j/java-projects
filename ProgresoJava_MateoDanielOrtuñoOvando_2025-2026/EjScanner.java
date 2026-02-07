//importamos el paquete con la clase scanner
import java.util.Scanner;

public class EjScanner{
	public static void main(String [] args) {
		//Variables
		float valor;
		
		//Creamos un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedir un valor entero al usuario
		System.out.print("Introduce un valor entero: ");
		
		//Coger el valor que ha introducido al usuario
		valor = sc.nextFloat();
		
		//Ver ese valor por pantalla 
		System.out.println("Se ha introducido el valor " + valor) ;
		
		
		
		
		
	}
}