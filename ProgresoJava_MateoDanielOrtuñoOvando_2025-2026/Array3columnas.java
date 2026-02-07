import java.util.Scanner;
import java.util.Arrays;
public class Array3columnas{
	public static void main(String[]args){
		//variables
		//2. Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es
		//decir, el primero que se introduce es el último en mostrarse y viceversa
		Scanner scanner=new Scanner (System.in);
		int [] numero =new int [20];
		int [] cuadrado =new int [20];
		int [] cubo =new int [20];
		int numeroAleatorio;
		//solucionamos 
		for(int i=0;i<numero.length;i++)
		{
			numero[i]=numeroAleatorio=(int)(Math.random()*101);
		}
		for(int i=0;i<numero.length;i++)
		{
			cuadrado[i]=(int)Math.pow(numero[i],2);
		}
		for(int i=0;i<numero.length;i++)
		{
			cubo[i]=(int)Math.pow(numero[i],3);
		}
		System.out.printf("-----------------------\n|Numero|Cuadrado|Cubo|\n-----------------------");
		for(int i=0;i<numero.length;i++)
		{
			System.out.printf("\n|%5d|  %5d   |%5d|",numero[i],cuadrado[i],cubo[i]);
			System.out.println();
		}
	}
}