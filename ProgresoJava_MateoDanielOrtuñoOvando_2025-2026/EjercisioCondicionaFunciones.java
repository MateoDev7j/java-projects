import java.util.Scanner;
public class EjercisioCondicionaFunciones{
	public static void main(String[]args){
		//declaramos variables
		String cad1;
		Scanner scanner =new Scanner(System.in);
		//resolvemos
		System.out.println("ingresa una cadena por teclado: ");
		cad1 =  scanner.nextLine();
		if (cad1.equals(cad1.toUpperCase()))
			System.out.println("la cadena tiene una letra mayuscula");
		else 
			System.out.println("la cadena tiene una minuscula");
	}
}