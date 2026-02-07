import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
		//asignamos variavles
		double a;
		double b ;
		double distancia;
		double diferencia ;
		Scanner scanner = new Scanner(System.in);
		//resolvemos problema
		System.out.println("introduce el primer numero");
		a=scanner.nextDouble();
		System.out.println("introduce el segundo numero");
		b=scanner.nextDouble();
		diferencia = a - b ;
		distancia = Math.abs(diferencia);
		System.out.println("la distancia de los numeros" + a + "y" + b + "es: " + diferencia);
		System.out.println("\nel valor absoluto es :" + distancia); 
	}
}
		
		
		