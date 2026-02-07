import java.util.Arrays;
import java.util.Scanner;
public class ArrayMatrices {
    public static void main(String[] args) {
		//variables
		Scanner scanner = new Scanner(System.in);
		double [][] matrizDouble = new double [2][2];
		matrizDouble[0][0] = 4;
		matrizDouble[1][1] = 5;
		matrizDouble[1][0] = 7;
		matrizDouble[0][1] = 3;
		// mostrar los valores por pantalla
		for(int fila=0;fila < matrizDouble.length;fila++){
			for(int col=0;col < matrizDouble[fila].length;col++)
				System.out.printf("%.2f ",matrizDouble[fila][col]);
				System.out.println();	
		}
		double suma = matrizDouble[0][0] + matrizDouble[1][1];
		System.out.println(suma);
	}
}