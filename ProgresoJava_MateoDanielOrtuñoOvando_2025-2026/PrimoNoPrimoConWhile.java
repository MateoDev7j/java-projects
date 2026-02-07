import java.util.Scanner;

public class PrimoNoPrimoConWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i = 2;
        
        System.out.println("Introduce un numero y te dire si es primo o no primo: ");
        num = scanner.nextInt();
        
        // Casos especiales
        if (num <= 1) {
            System.out.println(num + " NO es un número primo");
        } else {
            // Buscamos divisores desde 2 hasta la raíz cuadrada del número
            while (i <= Math.sqrt(num) && num % i != 0) {
                i++;
            }
            
            // Si salimos del bucle y i es mayor que la raíz cuadrada, es primo
            if (i > Math.sqrt(num)) {
                System.out.println(num + " es un número PRIMO");
            } else {
                System.out.println(num + " NO es un número primo");
            }
        }
    }
}