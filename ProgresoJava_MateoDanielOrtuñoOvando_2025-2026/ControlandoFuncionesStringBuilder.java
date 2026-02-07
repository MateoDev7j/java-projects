import java.util.Scanner;

public class Ej11StringBuilder{
	public static void main(String [] args)
	{
		//Variables y objetos
		String cadena = "Siempre se puede aprender java";
		Scanner sc = new Scanner(System.in);
		char opcion;
		StringBuilder sB = new StringBuilder(cadena.trim());
		int i,numPalabras=0,numA=0;
		String resultado="";
				
		//Resolucion del problema
		//Crear un menu con las opciones
		do{
			System.out.println("a) Contar el numero de letras que tiene");
			System.out.println("b) Contar el numero de palabras");
			System.out.println("c) Contar el numero de 'a'");
			System.out.println("d) Presentarla en consola invertida palabra a palabra");
			System.out.println("e) Presentarla en consola invertida letra a letra");
			System.out.println("s) Salir");
			System.out.print("Opcion: ");
			opcion = sc.nextLine().toLowerCase().charAt(0);
			
			switch(opcion){
				//Contar el numero de letras que tiene
				case 'a':
					System.out.println("a) Numero de letras: "+ cadena.replace(" ","").length());
					break;
				//Contar el numero de palabras
				case 'b':
					for(i=0;i<cadena.trim().length()-1;i++)
					{
						//busco palabras detectando (caracter+espacio)
						if(cadena.charAt(i)!=' ' && cadena.charAt(i+1)==' ')
							numPalabras++;
					}
					if(cadena.equals("") == false)
						numPalabras++;
					System.out.println("b) Numero de palabras: " + numPalabras);
					numPalabras=0;
					break;
				//Contar el numero de 'a'
				case 'c':
					for(i=0;i<cadena.length();i++)
					{
						if(cadena.charAt(i) == 'a')
							numA++;
					}
					System.out.println("c) Numero de 'a': " + numA);
					numA=0;
					break;
				//Presentarla en consola invertida palabra a palabra
				case 'd':
				for(i=0;i<cadena.length();i++){
					if(cadena.charAt(i)!=' ' && cadena.charAt(i+1)==' ')
						
						
				}
					break;
				//Presentarla en consola invertida letra a letra
				case 'e':
					System.out.println("e) Cadena invertida: "+ sB.reverse());
					break;
				case 's':
					break;
				default:
					System.out.println("Opcion incorrecta");
				
			}
		}while(opcion!='s');
		
		// a) Contar el numero de letras que tiene
		
	}
}