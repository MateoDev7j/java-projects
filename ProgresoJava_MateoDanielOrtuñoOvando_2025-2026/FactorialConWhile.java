import java.util.Scanner;
public class FactorialConWhile{
    public static void main(String[] args) {
        // declaramos variables
        int num;
		int i;
		int resultado=1;
		Scanner scanner = new Scanner(System.in);
		//resolvemos
		System.out.print("Numero: ");
		num = scanner.nextInt();
		
		System.out.print(num + " ! = ");
		i = 1;
		while (i<=num)
		{
			
			resultado *= i;
			i++;
		}
		/*for (i=1; i<=num; i++)
		{
			System.out.print(i);
			resultado *= i;
		
		if (i > num) {
			System.out.print("x");
		}
		}
		*/
		System.out.println(" = " + resultado);
	}
}