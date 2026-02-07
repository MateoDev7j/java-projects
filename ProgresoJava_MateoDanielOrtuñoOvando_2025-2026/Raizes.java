import java.util.Scanner;

public class Raizes {
    public static void main(String[] args) {
		//asignamos variavles
		double raiz1;
		double raiz2;
		double resultado1;
		double resultado2;
		Scanner scanner = new Scanner(System.in);
		//resolvemos
		System.out.println("introduce la primera raiz cuadrada");
		raiz1=scanner.nextDouble();
		System.out.println("introduce la segunda raiz cuadrada");
		raiz2=scanner.nextDouble();
		//operaciones
		resultado1= Math.sqrt(raiz1);
		resultado2= Math.pow(raiz2,1/3.0);
		System.out.println("la raiz cuadrada del primer numero es: " + resultado1 + "y la segunda raiz que seria cubica es: " + resultado2 );
	}
}
		