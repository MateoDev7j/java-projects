import java.util.Scanner;
public class EjercisioCondicionalNumPosONeg{
	public static void main(String[]args){
		//declaramos variables
		double numero;
		Scanner scanner = new Scanner(System.in);
		//resolvemos problema
		System.out.println("Ingresa un numero : ");
		numero = scanner.nextDouble();
		if (numero > 0)
			System.out.println(" el numero es positivo "+ numero);
		
		else if (numero < 0)
			System.out.println(" el numero es negativo "+ numero);
		
		else    (numero == 0 ) {
			System.out.println(" el numero es igual a cero "+ numero);
		}
		
	}
}