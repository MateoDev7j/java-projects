import java.util.Scanner;
public class EjercisioCondicionaManejoElse{
	public static void main(String[]args){
		//declaramos variables
		double a, b;
		Scanner scanner =new Scanner(System.in);
		//resolvemos
		System.out.println ("introduce dos numeros");
		a= scanner.nextDouble();
		b=scanner.nextDouble();
		if (b!=0) {
			System.out.println("en la division no hay un cero");
			System.out.println("la division es: "+a/b);
		}
		else 
			System.out.println("Aviso: el segundo numero ingresado es cero");
	}
}