import java.util.Scanner;
import java.util.Arrays;

public class ArraysApartarPrimoNoPrimos {
    public static void main(String[] args) {
		//variables 
		int [] numerosAleatorio = new int [20];
		int [] numerosAleatorioAux = new int [20];
		int contador=0;
		//solucion
		for(int i=0;i<numerosAleatorio.length;i++){
			numerosAleatorio[i]=(int) (Math.random()*20+1);
			if(numerosAleatorio[i]%2==0){
				numerosAleatorioAux[contador]=numerosAleatorio[i];
				contador++;
			}
		}
		System.out.print(Arrays.toString(numerosAleatorio));
		for (int i=0;i<numerosAleatorioAux.length;i++){
			if(numerosAleatorio[i]%2!=0){
				numerosAleatorioAux [contador]= numerosAleatorio[i];
				contador++;
			}
		}
		System.out.print("\n"+Arrays.toString(numerosAleatorioAux));
		
	}
}