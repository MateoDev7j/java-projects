import java.util.Scanner;
public class VocaNoVocal {
    public static void main(String[] args) {
        // declaramos variables
		char letra = 'a';
		String entrada;
        Scanner scanner = new Scanner(System.in);
		//resolvemos
		while (letra != ' ')
		{
			System.out.println("Ingresa vocal o no vocal");
			entrada = scanner.nextLine().toLowerCase();
			letra = entrada.charAt(0);
			if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u')
			{
				System.out.println("Las letra no es vocal");
			}
			else
				System.out.println("es es vocal");

		}
	}
}