import java.util.Scanner;
public class MostrarCadenaCharConBucle {
    public static void main(String[] args) {
		//declaramos variables
        Scanner scanner = new Scanner(System.in);
		/*.Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
		Este ejercicio es equivalente a otro realizado anteriormente, con la salvedad de que el
		anterior estaba limitado a números de 5 dígitos como máximo. En esta ocasión, hay que
		realizar el ejercicio utilizando bucles; de esta manera, la única limitación en el número de
		dígitos la establece el tipo de dato que se utilice (int o long).*/
		String cad1;
		int i;
		//resolvemos
		System.out.println("Introduce un texto: ");
		cad1=scanner.nextLine();
		for(i=0;cad1.length()>i;i++)
			System.out.println("los digitos de la cadena son "+ cad1.charAt(i));
	}
}