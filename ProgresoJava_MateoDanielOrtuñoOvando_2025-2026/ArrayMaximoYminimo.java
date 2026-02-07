import java.util.Arrays;
import java.util.Scanner;
public class ArrayMaximoYminimo{
	public static void main(String[]args){
		//escribre un programa que pida 10 numeros por teclado
		//luego muestra los numeros introducidos junto
		// maximo y minimo
		//variables e inicializar
		Scanner scanner =new Scanner(System.in);
		int [] numero;
		numero = new int [10];
		int posicion=0;
		int minimo=0,maximo=0;
		//resolver
		for(int i=0;i<numero.length;i++)
		{
			System.out.println("Ingresa los numeros del array ");
			posicion=scanner.nextInt();
			numero[i]=posicion;
			maximo=numero[0];
			minimo=numero[0];
		}
		System.out.println(Arrays.toString(numero));
		for(int i=0;i<numero.length;i++)
		{
			if(numero[i]>maximo)
			{
				maximo=numero[i];
			}
			if(numero[i]<minimo)
			{
				minimo=numero[i];
			}
		}
		System.out.println(("maximo: ")+maximo+(" y el minimo: ") +minimo);
	}
}