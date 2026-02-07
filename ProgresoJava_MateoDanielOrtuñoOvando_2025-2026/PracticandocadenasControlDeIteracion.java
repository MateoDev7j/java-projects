import java.util.Scanner;


public class PracticandocadenasControlDeIteracion{
	public static void main (String[] args){
		//variables
		Scanner scanner=new Scanner(System.in);
		char caracterActual;
		String cad1;
		String resultado="";
		boolean bandera= true;
		//solucion
		System.out.println("Ingresa una frase: ");
		cad1= scanner.nextLine();
		for(int i=0;i<cad1.length();i++){
			caracterActual=cad1.charAt(i);
			if(bandera){
				resultado = resultado + Character.toUpperCase(caracterActual);
                bandera = false;
			}
			else if(caracterActual==' '){
				resultado = resultado + caracterActual;
                bandera = true;
			}
			else{
				resultado = resultado + Character.toLowerCase(caracterActual);
			}
			System.out.println(resultado);
		}
	}
}