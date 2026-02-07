import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {
		//variables
		int numero1;
		
		Scanner scanner = new Scanner(System.in);
		//resolvemos 
		
		System.out.println(" ingresa el primer numero positivo o negativo o 0 .  ");
		numero1 = scanner.nextInt();
		if (numero1>0){
		System.out.println("el numero es postivio");
		}
		else if (numero1<0){
		System.out.println("el numero es negativo");
		}
		else {
		System.out.println("el numero es 0");
		}
		//else if se utiliza si if es falso else if es true y else si todas las anteriores son false esta es true
	}
}