import java.util.Scanner;

public class InicioDePlabraMayusVersion2{
	public static void main(String[]args){
		//variables y objetos
		//7. Lee una cadena, convierte a mayúscula el primer carácter de cada palabra 
		//y el resto a minúsculas.
		Scanner scanner =new Scanner(System.in);
		String cad, numeroEspacio;
		int i;
		char a=' ';
		
		//resolver
		
		System.out.println("Ingresa la cadena: ");
		cad= scanner.nextLine();
		for(i=0;i<cad.length();i++){
			if(cad.charAt(i)== ' '){
			mayuscula+=cad.charAt(i);
			mayuscula+=cad.toUpperCase.charAt(i+1);
			
			}
		}
		System.out.println(cad);
	}
}
		
		