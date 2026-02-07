import java.util.Scanner;
public class EjercisioCondicionaUsuarioContra{
	public static void main(String[]args){
		//declaramos variables
		String usuario, contraseña;
		Scanner scanner =new Scanner(System.in);
		//resolvemos
		System.out.println("ingresa tu usuario y contraseña: ");
		usuario = scanner.nextLine();
		
		contraseña = scanner.nextLine();
		//if
		if (usuario.equals("pepe") && contraseña.equals("asdasd"))
			System.out.println("Has entrado al sistema");
		else 
			System.out.println("ERROR");
	}
}