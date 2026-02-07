import java.util.Scanner;
import java.util.Arrays;
public class MatricesInverso{
	public static void main(String[]args){
		//variables
		//2. Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es
		//decir, el primero que se introduce es el último en mostrarse y viceversa
		Scanner scanner=new Scanner (System.in);
		int [] numeros =new int [10];
		int [] numerosInvertido =new int[10];
		//solucionamos 
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println("Inserte 10 numeros: ");
			numeros[i]= scanner.nextInt();
		}
		System.out.println(Arrays.toString(numeros));
		for(int i=0;i < numeros.length ;i++)
		{
			numerosInvertido[i]=numeros[numeros.length-1-i];
		}
		System.out.println(Arrays.toString(numerosInvertido));
	}
}