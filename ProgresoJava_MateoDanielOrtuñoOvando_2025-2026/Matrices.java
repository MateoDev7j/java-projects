import java.util.Scanner;
import java.util.Arrays;
public class Matrices{
	public static void main(String[]args){
		//variables
		Scanner scanner=new Scanner (System.in);
		int [][] numeros =new int [4][5];
		//numeros[0][0] = ;
		int numeroAleatorio;
		int sumar,sumaTotal=0;
		//solucionamos
		// con arrays se podria suma filas[i]+=numeros[i][i]
		// luego suma columnas[j]+=ny
		for(int i=0;i<numeros.length;i++){
			
			for(int j=0;j<numeros[i].length;j++){
				numeros[i][j]=numeroAleatorio = (int) (Math.random()*101);
			}
		}
		for(int i=0;i < numeros.length;i++){
			sumar=0;
			for(int j=0; j<numeros[i].length;j++){
				System.out.printf("%5d ",numeros[i][j]);
				sumar+=numeros[i][j];
			}
			System.out.printf("%5d\n",sumar);
		}
		for(int j=0;j < numeros[0].length;j++){
			sumar=0;
			for(int i=0; i<numeros.length;i++){
				sumar+=numeros[i][j];
			}
			System.out.printf("%5d ",sumar);
			sumaTotal+=sumar;
		}
		System.out.printf("%5d\n",sumaTotal);
	}
}