import java.util.Scanner;
import java.util.Arrays;
public class PruebaBibliotecaArrays{
	//metodo para llamar al caso 
		public static void ejecutarEjercicio(int n)
		{
			//variables y objetos
			Scanner scanner = new Scanner (System.in);
			int tamaño,min,max;
			int [] miArray;
			switch(n)
			{
				case 1: //generaArrayInt1
					System.out.println("Tam: ");
					tamaño=Integer.parseInt(scanner.nextLine());
					System.out.println("Max: ");
					tamaño=Integer.parseInt(scanner.nextLine());
					System.out.println("Min: ");
					tamaño=Integer.parseInt(scanner.nextLine());
					//llamo al metodo 
					miArray = BibliotecaArrays.generaArrayInt1(tamaño,min,max);
					System.out.println(Arrays.toString(miArray));
				break;
				case 2:
				break;
				default:
					System.out.println("Opcion incorrecta ");
			}
		}
	}
	//MAIN
	public static void main (String[]args){
		//variables
		int opc;
		Scanner scanner = new Scanner (System.in);
		//Pedir la opcion a ejecutar
		System.out.println("Ejecuta el numero de opcion ");
		opc=Integer.parseInt(scanner.nextLine());
		//llamar al metodo con la opcion correcta
		ejecutarEjercicio(opc);
}