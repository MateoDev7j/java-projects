import java.util.Scanner;
import java.util.Arrays;
public class FuncionesDeImportArrays{
	public static void main(String[]args){
		//inicializamos variables
		int [] numeros = {2,5,9,-4,6};
		int [] array2 = new int[10];
		
		Arrays.fill(array2,-1);
		System.out.println("array2: "+ Arrays.toString(array2));
		
		//USar el moetodo toString de la clase de Arrays para mostrar el Array 
		System.out.println(Arrays.toString(numeros));
		// vamos a ordenar el array y lo mostramos
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		// Buscar un elemento en el array numeros 9
		System.out.println("El 9 esta en la posicion: "+ Arrays.binarySearch(numeros,9));
		// Buscar un elemento en el array numeros 10
		System.out.println("El 9 esta en la posicion: "+ Arrays.binarySearch(numeros,10));
		// comparo el array2 con numeros 
		if(Arrays.equals(array2,numeros)){
			System.out.println("Iguales");
		}
		else 
			System.out.println("No iguales");
	}
}