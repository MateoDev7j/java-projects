import java.util.Arrays;
import java.util.Scanner;
public class ArraysCifrarFrase {
    public static void main(String[] args) {
		//variables
		Scanner scanner = new Scanner(System.in);
		String abecedario="abcdefghijklmnopqrstuvwxyz";
		char[] letras = abecedario.toCharArray();
		String frase;
		int posicion=0;
		String fraseCifrada="";
		int posicionOriginal;
		int nuevaPosicion;
		char letraCifrada;
		char caracterActual;
		int i=0;
		//solucionamos 
		System.out.println("ingresa la frase: ");
		frase=scanner.nextLine().toLowerCase();
		for(i=0;i<frase.length();i++)
		{
			caracterActual = frase.charAt(i);
			if(Character.isLetter(caracterActual))
			{
				posicionOriginal = abecedario.indexOf(caracterActual);
				nuevaPosicion = (posicionOriginal+3)%26;
				letraCifrada = letras[nuevaPosicion];
				fraseCifrada += letraCifrada;
			}
			else
			{
				fraseCifrada+=caracterActual;
			}
		}
			System.out.println("frase original: "+ frase);
			System.out.println("Frase cifrada: "+ fraseCifrada);
		
		
	}
}