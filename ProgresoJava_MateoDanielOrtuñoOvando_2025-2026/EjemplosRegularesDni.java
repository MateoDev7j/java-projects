import java.util.regex.*;
import java.util.Scanner;

public class EjemplosRegularesDni{
	public static void main(String[]args){
		//variables 
		int numero;
		String dni;
		char letraDni;
		char letra;
		int posicion;
		String letras ="TRWAGMYFPDXBNJZSQVHLCKE";
		String expRegular = "[1-9]{8}[a-zA-Z]{1}";
		Scanner scanner = new Scanner(System.in);
		//resolucion del problema
		System.out.println("Introduce el dni");
		dni=scanner.nextLine();
		Pattern p = Pattern.compile(expRegular);
		Matcher m = p.matcher(dni);
		// resultado 
		if(m.matches()){
			System.out.println("Numero dni correcto ");
			numero=Integer.parseInt(dni.substring(0,8));
			System.out.println(numero);
			letra= dni.charAt(8);
			System.out.println(letra);
			posicion = numero%23;
			
			if(letra == letras.charAt(posicion)){
				System.out.println("La letra coincide ");
			}
			else{
				System.out.println("La letra no coincide con el numero ");
			}
		}
		else 
			System.out.println("Numero dni incorrecto ");
	}
}