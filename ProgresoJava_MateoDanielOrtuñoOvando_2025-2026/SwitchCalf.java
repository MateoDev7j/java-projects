import java.util.Scanner;

public class SwitchCalf{
    public static void main(String[] args) {
        // declaramos variables
        char calificacion;
        
        Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una letra A,B,C,D o F");
		calificacion = scanner.nextLine().toLowerCase().charAt(0);
		switch (calificacion){
		case 'a': 
			System.out.println("Excelente");
			break;
		case 'b': 
			System.out.println("Notable");
			break;
		case 'c': 
			System.out.println("Aprobado");
			break;
		case 'd': 
			System.out.println("Insuficiente");
			break;
		case 'f': 
			System.out.println("Reprobado");
			break;
		default:
			System.out.println("letra invalida");
		}
	}
}