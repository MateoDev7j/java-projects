import java.util.Scanner;
import java.util.Arrays;

public class RotarArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Inicializamos el array con 15 posiciones
        int[] numeros = new int[15];
        
        //Leemos los datos por teclado
        System.out.println("Introduce 15 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Posición " + i + ": ");
            numeros[i] = s.nextInt();
        }

        System.out.println("\nArray original: " + Arrays.toString(numeros));

        //Resolución del problema: Rotación
        // Guardamos el último en una variable para no perderlo
        int ultimo = numeros[numeros.length - 1];

        //Movemos los elementos: el 13 pasa al 14, el 12 al 13..
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        //El que era el último, lo ponemos en la posición 0
        numeros[0] = ultimo;

        //Mostramos el resultado final
        System.out.println("Array rotado:   " + Arrays.toString(numeros));
    }
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		