import java.util.Scanner;

public class ContarMayoresMenoresCero {
    public static void main(String[] args) {
        // declaramos variables
        int nValores, numValoresMayoresCero = 0, numValoresMenoresCero = 0, numeroValoresIgualesCero = 0;
        double valor;
        
        Scanner scanner = new Scanner(System.in);
        
        // resolvemos
        System.out.print("Ingresa la cantidad de números: ");
        nValores = scanner.nextInt();
        
        // Bucle para pedir los números
        for (int i = 1; i <= nValores; i++) {
            System.out.print("Número " + i + ": ");
            valor = scanner.nextDouble();
            
            // Contar según el tipo de número
            if (valor > 0) {
                numValoresMayoresCero++;
            } else if (valor < 0) {
                numValoresMenoresCero++;
            } else {
                numeroValoresIgualesCero++;
            }
        }
        
        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Números mayores que 0: " + numValoresMayoresCero);
        System.out.println("Números menores que 0: " + numValoresMenoresCero);
        System.out.println("Números iguales a 0: " + numeroValoresIgualesCero);
    }
}