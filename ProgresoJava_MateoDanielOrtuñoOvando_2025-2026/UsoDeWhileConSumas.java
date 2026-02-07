import java.util.Scanner;

public class UsoDeWhileConSumas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numero, suma = 0, contador = 0, media;
        System.out.println("Introduce números (0 para terminar):");
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            if (numero != 0) {
                suma += numero;  
                contador++;      
            }
        } while (numero != 0);  
        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Cantidad de números: " + contador);
        
        // Calcular y mostrar la media (evitando división por cero)
        if (contador > 0) {
            media = (double) suma / contador;
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se introdujeron números para calcular la media");
        }
        
        
    }
}