import java.util.Scanner;
public class PararBuclesWhile{
	public static void main(String[]args){
		//variables
		Scanner scanner = new Scanner(System.in);
		int a, suma, b,i=0;
		char letra=' ';
		//resolver
		System.out.println("Ingresa un numero y otro para sumar y incrementaremos la suma uno a uno ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		while (letra!='o'){
			i++;
			
			a+=1;
			b+=1;
			suma =a+b;
			System.out.println(a+" + "+b+" = "+ suma);
			System.out.println("Quieres terminar el programa? presiona o: ");
			scanner.nextLine();
			letra=scanner.nextLine().charAt(0);
			
		}
	}
}