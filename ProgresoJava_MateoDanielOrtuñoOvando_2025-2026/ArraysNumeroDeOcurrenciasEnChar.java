import java.util.Arrays;
import java.util.Scanner;
public class ArraysNumeroDeOcurrenciasEnChar {
    public static void main(String[] args) {
		//variables 
		Scanner scanner = new Scanner (System.in);
		String cad;
		String abecedario="abcdefghijklmnopqrstuvwxyz";
		char[] letras = abecedario.toCharArray();
		int [] contador = new int [26]; // Guardar el  numero de veces que aparece cada letra
		int posicion=0;
		//solucion
		//pedimos frase
		System.out.print("Frase: ");
		cad=scanner.nextLine().toLowerCase();
		//recorremos frase y contamos el numero de ocurrencias de cada letra
		for(int i=0;i<cad.length();i++){
			posicion=0;
			for(char letra : letras){
				if(cad.charAt(i)==letra)
					contador[posicion]++;
				posicion++;
			}
		}
		posicion=0;
		for(char letra : letras){
			System.out.printf("\n%c -> %d veces ", letra, contador[posicion]);
			posicion++;
		}
	}
}