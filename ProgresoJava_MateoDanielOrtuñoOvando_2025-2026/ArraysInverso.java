import java.util.Arrays;
import java.util.regex.*;
import java.util.Scanner;
public class ArraysInverso{
	public static void main (String[]args){
		//variables
		Scanner scanner = new Scanner(System.in);
		int[] arrayPrueba = new int [10];
		
		int [] arrayPruebaInverso = new int [10];
		//Solucion 
		for(int i=0;i<arrayPrueba.length;i++){
			int numeroAleatorio = (int) (Math.random()*25+1);
			arrayPrueba[i]=numeroAleatorio;
			System.out.println(arrayPrueba[i]);
		}
		System.out.println(Arrays.toString(arrayPrueba));
		for(int contador=10;contador<arrayPrueba.length;contador--){
			arrayPruebaInverso[contador]= arrayPrueba[contador];
		}
		System.out.println(Arrays.toString(arrayPruebaInverso));
		System.out.println(Arrays.toString(arrayPrueba));
	}
}

















