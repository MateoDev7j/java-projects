import java.util.Scanner;
public class TablaMultiplicando{
    public static void main(String[] args) {
        // declaramos variables
        int numero;
		int contador;
		int resultado;
		Scanner scanner = new Scanner(System.in);
		//resolvemos
		System.out.print("Valor: ");
		numero = scanner.nextInt();
		
		System.out.println("tabla de multiplicar del numero " + numero);
		
	
		for (contador=0; contador<=10; contador++)
		{
			resultado = contador * numero;
			System.out.println(numero+ " x "+ contador + " = " + resultado);
		}
	}
}