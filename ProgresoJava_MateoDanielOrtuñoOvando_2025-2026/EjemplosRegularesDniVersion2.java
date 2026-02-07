import java.util.regex.*;
import java.util.Scanner;

public class EjemplosRegularesDniVersion2{
	public static void main(String[]args){
		//variables 
		
		String dni;
	
		String expRegular = "[1-9]{8}[a-zA-Z]{1}";
		Scanner scanner = new Scanner(System.in);
		//resolucion del problema
		System.out.println("Introduce el dni");
		dni=scanner.nextLine();
		Pattern p = Pattern.compile(expRegular);
		Matcher m = p.matcher(dni);
		
		
		
		if(m.matches())
			System.out.println("Numero dni correcto ");
		else 
			System.out.println("Numero dni incorrecto ");
	}
}