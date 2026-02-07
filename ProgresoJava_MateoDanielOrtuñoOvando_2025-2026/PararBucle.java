import java.util.Scanner;

public class PararBucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        
        System.out.println("Ingresa letras (ESPACIO para terminar):");
        
        while (true) {
            System.out.print("Ingresa una letra: ");
            entrada = scanner.nextLine();
            
            // Salir si es espacio o vacío
            if (entrada.equals(" ") || entrada.isEmpty()) {
                break;
            }
            
            char letra = entrada.charAt(0);
            
        }
        
        System.out.println("Programa finalizado.");
    }
}