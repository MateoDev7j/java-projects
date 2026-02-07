import java.util.regex.*;
import java.util.Scanner;

public class EjemplosRegularesNie{
	public static void main(String[]args){
		//variables 
		
		String nie;
	
		String expRegular = "[xyzXYZ]?[1-9]{8}[a-zA-Z]{1}";
		Scanner scanner = new Scanner(System.in);
		//resolucion del problema
		System.out.println("Introduce el nie ");
		dni=scanner.nextLine();
		Pattern p = Pattern.compile(expRegular);
		Matcher m = p.matcher(nie);
		
		
		
		if(m.matches())
			System.out.println("Numero nie correcto ");
		else 
			System.out.println("Numero nie incorrecto ");
	}
}