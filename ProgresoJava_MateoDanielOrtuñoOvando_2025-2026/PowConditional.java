import java.util.Scanner;
public class PowConditional{
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		int base, exponente;
		//resolvemos 
		System.out.println("Ingresa la base y luego el exponente: ");
		base = scanner.nextInt();
		exponente = scanner.nextInt();
		if (exponente>0)
			System.out.println("imprimimos potencia: "+ Math.pow(base, exponente));
		else if (exponente ==0)
			System.out.println("el exponente es 0 : "+ Math.pow(base, exponente));
		else 
			System.out.println("Ingresaste un numero exponente negativo: "+ 1/Math.pow(base, exponente));
	}
}
		