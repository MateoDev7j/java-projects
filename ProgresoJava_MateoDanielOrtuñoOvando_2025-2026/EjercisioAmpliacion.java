import java.util.Scanner;
public class EjercisioAmpliacion{
	public static void main(String[]args){
		//declaramos variables 
		int a,b;
		boolean resultado1, resultado2, resultado3, resultado4, resultado5, resultado6;
		Scanner scanner = new Scanner(System.in);
		//resolvemos problema
		System.out.println("ingresa los dos numeros enteros: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		// resultados
		resultado1=a==b;
		resultado2=a!=b;
		resultado3=a<b;
		resultado4=a>b;
		resultado5=a<=b;
		resultado6=a>=b;
		//saca por pantalla
		System.out.printf("a) igual : %b\n" , resultado1);
		System.out.printf("b) Distinto : %b\n", resultado2);
		System.out.printf("c) menor: %b\n", resultado3);
		System.out.printf("d) mayor: %b\n", resultado4);
		System.out.printf("e) menor o igual: %b\n", resultado5);
		System.out.printf("f) mayor o igual : %b\n", resultado6);
		
		
		
	}
}