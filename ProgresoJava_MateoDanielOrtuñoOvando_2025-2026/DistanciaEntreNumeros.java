import java.util.Scanner;

public class DistanciaEntreNumeros {
    public static void main(String[] args) {
        
		//declaracion de variables
        
        Scanner scanner = new Scanner(System.in);
        double numero1;
        double numero2;
        double diferencia;
        double distancia;
        
        //resolvemos problema
		
        System.out.println("CÁLCULO DE DISTANCIA ENTRE DOS NÚMEROS ");
        System.out.println();
        
        System.out.print("Ingresa el primer número: ");
        numero1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        numero2 = scanner.nextDouble();
        
        //realizamos calculos
        diferencia = numero1 - numero2;
        
        distancia = Math.abs(diferencia);
		System.out.println("\nRESULTADOS OBTENIDOS\n");

        System.out.println("Números ingresados:");
        System.out.println(" - Primer número: " + numero1);
        System.out.println(" - Segundo número: " + numero2);
        System.out.println("\nCálculos realizados:");
        System.out.printf("Diferencia: %.2f - %.2f = %.2f\n", numero1, numero2, diferencia);
        System.out.printf("\nValor absoluto de la diferencia: |%.2f| = %.2f\n", diferencia, distancia);
        
        
        // Mostramos el resultado final
        System.out.println("RESULTADO FINAL:");
        System.out.printf("La distancia entre %.2f y %.2f es: %.2f\n", numero1, numero2, distancia);
        
        
    }
}