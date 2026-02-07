import java.util.Scanner;
public class EjercisioCondicional{
	public static void main(String[]args){
		//declaramos variables
		
		int numero1,numero2;
		Scanner scanner = new Scanner(System.in);
		//sacamos en pantalla y resolvemos el problema
		System.out.println("introduce dos numeros");
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();
		if (numero1>=numero2)
		System.out.println(" "+ numero1 +" es mayor que " + numero2);
		else 
		System.out.println(" "+ numero1 + " es menor que" + numero2);
		
		
		
		
	}
}