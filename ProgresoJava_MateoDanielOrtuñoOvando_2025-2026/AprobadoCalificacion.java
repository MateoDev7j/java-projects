import java.util.Scanner;

public class AprobadoCalificacion {
	public static void main(String[]args) {
		//declaramos variables en el problema
		double nota1;
		double nota2;
		double nota3;
		double trabajoFinal;
		double notaFinal;
		Scanner scanner = new Scanner(System.in);
		//resolvemos problema
		System.out.println("ingresa la primera calificacion 30%: ");
		nota1 = scanner.nextDouble();
		System.out.println("Ingresa la segunda caldificacion 30%: ");
		nota2 = scanner.nextDouble();
		System.out.println("ingresa la tercera calificacion 30%: ");
		nota3 = scanner.nextDouble();
		System.out.println("ingresa su trabajo final 10%: ");
		trabajoFinal = scanner.nextDouble();
		notaFinal = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.30) + (trabajoFinal * 0.10);
		if (notaFinal >= 6) {
		System.out.println("estado: APROBADO");
		}
		else {
		System.out.println("estado Reprobado");
		}
		System.out.printf("tu calificacion total fue de: %.2f ", notaFinal);
	}
}
		