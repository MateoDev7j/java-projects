import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
		//declaramos variables y creamos scanner
		int numero;
		Scanner scanner = new Scanner(System.in);
		//resolvemos problemas
		System.out.println("Ingresa el numero par o impar: ");
		numero = scanner.nextInt();
		if (numero % 2 == 0) {
		System.out.println("el numero " + numero +"es par");
		} else {
		System.out.println(" el numero " + numero + " es impar");
		}
		
		
		
		
	}
}