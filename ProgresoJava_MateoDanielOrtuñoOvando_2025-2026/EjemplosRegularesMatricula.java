import java.util.regex.*;
import java.util.Scanner;

public class EjemplosRegularesMatricula{
	public static void main(String[]args){
		//variables 
		Scanner scanner = new Scanner(System.in);
		String matricula;
		String expRegular= "[1-9]{4}[BCDFGHJKLMNPRSTWXYZbcdfghjklmnqrstwxyz]{3}";
		//Resolvemos 
		System.out.println("Ingresa la matricula");
		matricula= scanner.nextLine().toUpperCase();
		Pattern p = Pattern.compile(expRegular);
		Matcher m = p.matcher(matricula);
		if(m.matches()){
			System.out.println("La matricula es correcta ");
		}
		else 
			System.out.println("La matricula es incorrecta");
	}
}