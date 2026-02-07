import java.util.Scanner;
public class SimplePrimoNoPrimo {
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		int num, primo, noPrimo,i=0;
		
		//resolvemos
		System.out.println("introduce un numero y te dire si es primo o no primo: ");
		num=scanner.nextInt();
		while(i<=Math.sqrt(num)){
			i++;
			if(num <= i && num%2!=0 ){
				System.out.println("el numero es no primo ");
			}
			else{
				System.out.println("es un numero primo ");
			}
		}
	}
}