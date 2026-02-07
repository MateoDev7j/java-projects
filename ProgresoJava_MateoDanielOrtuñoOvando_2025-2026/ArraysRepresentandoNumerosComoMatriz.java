import java.util.Scanner;
public class ArraysRepresentandoNumerosComoMatriz {
    public static void main(String[] args) {
		//variables
		Scanner scanner = new Scanner(System.in);
		int [][] matrizInt = new int [3][6];
		matrizInt[0][0] = 0;
		matrizInt[1][0] = 75;
		matrizInt[0][1] = 30;
		matrizInt[0][2] = 2;
		matrizInt[2][2] = -2;
		matrizInt[2][3] = 9;
		matrizInt[1][4] = 0;
		matrizInt[0][5] = 5;
		matrizInt[2][5] = 11;
		//solucionamos
		for(int fila=0;fila < matrizInt.length;fila++){
			for(int col=0;col < matrizInt[fila].length;col++)
				System.out.printf("|"+"%d "+"|",matrizInt[fila][col]);
				System.out.println();
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		