import java.util.Scanner;
public class CharConcatenarCadena{
	public static void main(String[]args){
		//declaramos variables
		char a;
		String cad1;
		Scanner scanner = new Scanner(System.in);
		//resolvemos
		System.out.println("introduce primero una letra char y luego una cadena: ");
		a = scanner.next().charAt(0);
		scanner.nextLine();
		cad1 = scanner.nextLine();
		System.out.println("lo intruducido es: "+ a + cad1);
		
		
	}
}

