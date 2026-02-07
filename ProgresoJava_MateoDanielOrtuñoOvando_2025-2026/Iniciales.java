import java.util.Scanner;

public class Iniciales {
    public static void main(String[] args) {
		//declaramos variables
		String nombre, apellido, apellido2;
		Scanner scanner = new Scanner(System.in);
		
		//resolvemos problema
		System.out.println("ingresa tu nombre: ");
		nombre = scanner.nextLine();
		System.out.println("ingresa tu apellido: ");
		apellido = scanner.nextLine();
		System.out.println("ingresa tu apellido2: ");
		apellido2 = scanner.nextLine();
		//ponemos en pantalla las iniciales
		System.out.print("tus iniciales son ");
		System.out.print(" " + nombre.substring(0,1).toUpperCase());
		System.out.print(" " + apellido.substring(0,1).toUpperCase());
		System.out.print(" " + apellido2.substring(0,1).toUpperCase());

	}
}
