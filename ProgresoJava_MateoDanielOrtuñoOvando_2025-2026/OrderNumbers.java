import java.util.Scanner;
public class OrderNumbers{
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		int numero1, numero2, numero3, mayor;
		//resolvemos
		System.out.println("Ingresa tres numeros enteros se ordenaran de mayor a menor: ");
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();
		numero3 = scanner.nextInt();
		if ((numero1>=numero2) && (numero1>=numero3)){
			System.out.println("el mayor es: " + numero1);
		}
		else if ((numero2>=numero1) && (numero2>=numero3)){
			System.out.println("el mayor es: " + numero2);
		}			
		else
			System.out.println("el mayor es: " + numero3);
	}
}