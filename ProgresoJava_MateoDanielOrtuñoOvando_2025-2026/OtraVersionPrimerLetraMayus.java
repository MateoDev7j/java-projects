import java.util.Scanner;
public class OtraVersionPrimerLetraMayus{
	public static void main(String[]args){
		//decclaramos variables
		//que una palabra tenga primer letra mayus la demas minus
		Scanner scanner = new Scanner(System.in);
		String palabra, resultado="";
		int i;
		char palabraActual;
		boolean nuevaPalabra=true;
		//resolvemos 
		System.out.println("Ingresa una palabra");
		palabra= scanner.nextLine();
		for(i=0;i<palabra.length();i++){
			palabraActual= palabra.charAt(i);
			if(nuevaPalabra==true && Character.isLetter(palabraActual)){
				palabraActual=Character.toUpperCase(palabraActual);
				resultado= resultado + palabraActual;
				nuevaPalabra=false;
			}
			else{
				palabraActual=Character.toLowerCase(palabraActual);
				resultado= resultado+ palabraActual;
			}
			if(palabraActual==' '){
				nuevaPalabra=true;
			}
		}
		System.out.println(resultado);
	
	}
}