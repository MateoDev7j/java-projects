import java.util.Scanner;
public class AlrevezConFunciones{
	public static void main(String[]args){
		//resolvemos problema
		Scanner scanner = new Scanner(System.in);
		String hola;
		//resolvemos
		System.out.println("ingresa la cadena hola");
		hola=scanner.nextLine();
		System.out.println("hola alrevez es: "+ hola.charAt(3)+ hola.substring(2,3) +hola.substring(1,2) + hola.substring(0,1));
	}
}