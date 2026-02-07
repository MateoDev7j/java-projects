import java.util.Scanner;
public class EjercisioCondicionaParOImpar{
	public static void main(String[]args){
		//declaramos variables
		int numero;
		Scanner scanner = new Scanner(System.in);
		//resolvemos
		System.out.println("ingresa el numero y vemos si es par o impar: ");
		numero = scanner.nextInt();
		//resolvemos
		if (numero%2 ==0)
			System.out.println ("el numero es par");
		else
		System.out.println("el numero es impar");
	}
}
		