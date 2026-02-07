import java.util.regex.*;

public class EjemplosRegulares{
	public static void main(String[]args){
		//variables 
		String numBinario1 = "00010100";
		String numBinario2 = "10111120";
		String expRegular = "[01]+";
		//resolucion del problema
		Pattern p = Pattern.compile(expRegular);
		Matcher m = p.matcher(numBinario2);
		
		if(m.matches())
			System.out.println("Numero binario correcto ");
		else 
			System.out.println("Numero binario incorrecto ");
		
		
		
	
	}
}
	