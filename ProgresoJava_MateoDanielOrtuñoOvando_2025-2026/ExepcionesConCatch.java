import java.util.Scanner;
public class ExepcionesConCatch{
	public static void main (String[]args){
		//variables
		int a,b;
		Scanner scanner =new Scanner(System.in);
		//resolucion del problema
		System.out.print("Valor 1:");
		a=scanner.nextInt();
		System.out.print("\nValor 2:");
		b=scanner.nextInt();
		
		//muestro  la divison de los dos valores
		try{
		System.out.printf("\n%d / %d = %d", a,b,a/b);
		}
		catch(ArithmeticException e){
			System.out.println("No se puede dividir entre 0");
		}
		
	}
}