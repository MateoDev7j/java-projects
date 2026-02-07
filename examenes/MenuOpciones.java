//Mateo Daniel Ortuño Ovando
import java.util.Scanner;
public class MenuOpciones{
	public static void main(String[]args){
		//Inicializamos variables y scanner
		String palabra="",buscarPalabra, posicionPalabra,palabraReemplazada,reemplazo;
		int i ,numeroElegir=0, contadorPalabra=0, posicionNumeroPalabra=0;
		boolean nuevaPlabra=true;
		char palabraActual;
		Scanner scanner =new Scanner(System.in);
		//Resolvemos el problema
		try{
			System.out.printf("-- MENU DE OPCIONES --\n(1) Cargar texto\n(2) Contar palabras\n(3) Buscar texto\n(4) Posicion de una palabra\n(5) Reemplazar una palabra\n(s) Salir y finalizar\n---------------------------");
			System.out.println("\nsi quieres iniciar pulsa cualquier numero del 1 al 5  : ");
			numeroElegir=Integer.parseInt(scanner.nextLine());
		}
		catch(NumberFormatException e){
			System.out.println("Valor no valido para iniciar sigue las intrucciones");
		}
		
		// con el try controlamos que cuando el valor introducido sea s, el programa finalize
			try{
				while(numeroElegir<=5 && numeroElegir>=1){
				System.out.printf("-- MENU DE OPCIONES --\n(1) Cargar texto\n(2) Contar palabras\n(3) Buscar texto\n(4) Posicion de una palabra\n(5) Reemplazar una palabra\n(s) Salir y finalizar\n---------------------------");
				System.out.println(" : \nRecuerda que para usar las demas opciones es obligatorio cargar la opcion 1");
				numeroElegir=Integer.parseInt(scanner.nextLine());
				if(numeroElegir>5){
				System.out.println("la opcion no es correcta\nsolo numeros permitidos");
				}
				switch(numeroElegir){
					case(1):
					System.out.println("Has elegido la opcion 1 carga la palabra: ");
					palabra=scanner.nextLine().toLowerCase();
					
					break;
					case(2):
					if(palabra!=""){
					for(i=0;i<palabra.length();i++){
						palabraActual= palabra.charAt(i);
						if(nuevaPlabra==true && palabraActual==' '){
							contadorPalabra++;

						}
						
					}
					contadorPalabra++;
					System.out.println(" el numero de palabras es: "+contadorPalabra);
					}
					else
						System.out.println("no se ha cargado palabra");
					break;
					case(3):
					System.out.println("Haz elegido la opcion numero 3, cual es la palabra que deseas buscar(OJO solo admitimos minusculas): ");
					buscarPalabra=scanner.nextLine().toLowerCase();
					if(palabra.contains(buscarPalabra)==true){
						System.out.println("La palabra que introduciste SI esta en nuestro texto");
					}
					else
						System.out.println("La palabra no esta en el texto ");
					break;
					

					case(4):
					System.out.println("Haz elegido la opcion numero 4, de que palabra deseas saber la posicion: ");
					posicionPalabra=scanner.nextLine().toLowerCase();
					posicionNumeroPalabra=palabra.indexOf(posicionPalabra);
					System.out.println("la posicion es "+ posicionNumeroPalabra);
					break;
					case(5):
					System.out.println("Haz elegido la opcion numero 5, tendras que reemplazar una palabra del texto por otra:\ningresa la palabra que quieres reemplazar del texto:");
					palabraReemplazada=scanner.nextLine().toLowerCase();
					System.out.println("Ahora ingresa la palabra por la que lo reemplazaras:");
					reemplazo=scanner.nextLine().toLowerCase();
					palabra=palabra.replace(palabraReemplazada,reemplazo);
					System.out.println(palabra);
					break;
					
					case('s'):
					break;
				}
				}
			}

			
		catch (NumberFormatException e){
			System.out.println("Has salido del prgrama");
		}
		}
}
