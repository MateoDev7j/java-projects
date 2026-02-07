import java.util.Scanner;
public class Estrict{
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		int nota, edad;
		char sexo;
		//resolvemos
		System.out.println("ingresa la nota, la edad, y el sexo M O F: ");
		nota =  scanner.nextInt();
		edad = scanner.nextInt();
		scanner.nextLine();
		sexo = scanner.nextLine().charAt(0);
		if (((nota>=5)&&(edad>=18)) && (sexo == 'f'))
			System.out.println("ACEPTADA");
		else if (((nota>=5)&&(edad>=18)) && (sexo == 'm'))
			System.out.println("POSIBLE");
		else 
			System.out.println("NO ACEPTADA");
	}
}
		