import java.util.Scanner;
public class NumerosParesEntreSi {
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		int pares, a,b, i=0;
		/* Escribir un programa que imprima todos los números pares entre dos números que se le
		pidan al usuario.*/
		//resolvemos
		System.out.println("Ingresa dos numeros b mayor que a: ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		while(b > i){
			i++;
			if (i%2==0){
			System.out.println(a+" --> " +b  +" = "+ i );
			}

		}
	}
}
		
		
		