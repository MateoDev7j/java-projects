import java.util.Scanner;
public class TablaMultiplicarConFor {
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		/*. Realizar una algoritmo que muestre la tabla de multiplicar de un número introducido por
		teclado.*/
		int numero,i = 0, resultado, multiplicar=10;
		
		//resolver
			System.out.println("Ingresa un numero y veras su tabla de multiplicar: ");
			numero = scanner.nextInt();
		for ( ; i<=multiplicar ; i++){
			resultado = i*numero;
			System.out.println( i +" x " +  numero + " = " + resultado);
		}
	}
}