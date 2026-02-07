import java.util.Scanner;
public class Añobiciesto{
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		int año;
		//Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un
		//número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible
		//por 400.
		//resolvemos
		System.out.println("Ingresa un año");
		año = scanner.nextInt();
		if ((año%4 == 0 && año % 100 !=0) || (año % 400 ==0))
			System.out.println("Año biciesto");
		else
			System.out.println("No es año biciesto");
	}
}
		