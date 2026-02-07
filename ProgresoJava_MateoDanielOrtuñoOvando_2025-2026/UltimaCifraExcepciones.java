import java.util.Scanner;
public class UltimaCifraExcepciones {
    public static void main(String[] args) {
		//declaramos variables
        Scanner scanner = new Scanner(System.in);
		/*. Escribe un programa que diga cuál es la última cifra de un número entero 
		introducido por teclado. Tienes que hacerlo sin convertir el número a String. */
		int numero=0,unidad;
		//resolvemos
		try {
			System.out.println("Ingresa un numero entero te mostrare su ultima cifra: ");
			numero= scanner.nextInt();
			unidad= numero % 10;
			if(numero<0){
				unidad =Math.abs(unidad);
				System.out.println("La ultima cifra es : "+unidad);
			}
			else
				System.out.println("La ultima cifra es : "+unidad);
		}
		catch(Exception e){
			System.out.println(" error en el scanner, ingresaste un numero que no es un o no cabe en un int  ");
			
		}


	}
}