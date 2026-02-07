import java.util.Scanner;
public class PedirDatos{
	public static void main(String[]args){
		//declaramos variables
		String nombre;
		int telefono;
		double estatura;
		char genero;
		Scanner scanner = new Scanner(System.in);
		//resolvemos
		System.out.println("ingresa tu nombre, tu numero de telefono, tu estatura, y genero M/F: ");
		nombre =  scanner.nextLine();
		telefono = scanner.nextInt();
		estatura = scanner.nextDouble();
		scanner.nextLine();
		genero = scanner.nextLine().charAt(0);
		
		System.out.printf("\nnombre: %s\ntelefono: %d\nestatura: %.2f\nGenero: %c", nombre, telefono, estatura, genero);
		
		
	}
}
