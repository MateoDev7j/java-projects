import java.util.Scanner;

public class NumberRandom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Generar número aleatorio entre 1 y 100 usando Math.random()
        int numeroAdivinar = (int)(Math.random() * 100) + 1;
        int intentosRestantes = 10;
        int intentosRealizados = 0;
        boolean adivinado = false;
        
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número entre 1 y 100.");
        System.out.println("Tienes " + intentosRestantes + " intentos para adivinarlo.");
        
        // Bucle principal del juego
        while (intentosRestantes > 0 && !adivinado) {
            System.out.print("\nIntroduce tu número: ");
            int numeroUsuario = scanner.nextInt();
            intentosRealizados++;
            intentosRestantes--;
            
            if (numeroUsuario == numeroAdivinar) {
                adivinado = true;
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                System.out.println("Lo has conseguido en " + intentosRealizados + " intentos.");
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es MAYOR que " + numeroUsuario);
                System.out.println("Te quedan " + intentosRestantes + " intentos.");
            } else {
                System.out.println("El número a adivinar es MENOR que " + numeroUsuario);
                System.out.println("Te quedan " + intentosRestantes + " intentos.");
            }
        }
        
        
        if (!adivinado) {
            System.out.println("\n¡Se te han agotado los intentos!");
            System.out.println("El número era: " + numeroAdivinar);
        }
        
        
    }
}