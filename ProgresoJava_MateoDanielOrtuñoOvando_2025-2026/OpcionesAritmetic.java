import java.util.Scanner;
public class OpcionesAritmetic{
	public static void main(String[]args){
		//declaramos variables
		int numeros,numero,opcion1,opcion2;
		double opcion3,opcion4;
		Scanner scanner =new Scanner(System.in);
		int opciones = 4;		
		//resolvemos
		System.out.println("Ingresa dos numeros enteros: ");
		numeros = scanner.nextInt();
		if (numeros <=99){
		
		switch (opciones) {
			case 1:
			System.out.println("Sumar");
		break;
			case 2:
			System.out.println("Resar");
		break;
			case 3:
			System.out.println("Multiplicar");
		break;
			case 4:
			System.out.println("dividir");
		break;
		default: 
			System.out.println("numero invalido");
		}
		}
		System.out.println("introduce un numero del 1 al 4: ");
		numero = scanner.nextInt();
		if (numero==1){
			System.out.println("introduce dos numeros para sumar ");
			opcion1 = scanner.nextInt();
			opcion2 = scanner.nextInt();
			System.out.println("el resultado es: " + (opcion1+opcion2));
		}
		else if (numero==2){
			System.out.println("Introduce dos numeros para restar: ");
			opcion1 = scanner.nextInt();
			opcion2 = scanner.nextInt();
			System.out.println("el resultado es: "+(opcion1-opcion2));
		}
		else if (numero==3){
			System.out.println("Introduce dos numeros para multiplicar:");
			opcion1 = scanner.nextInt();
			opcion2 = scanner.nextInt();
			System.out.println("el resultado es: "+(opcion1*opcion2));
		}
		else if (numero==4){
			System.out.println("Introduce dos numeros para dividir: ");
			opcion3 = scanner.nextDouble();
			opcion4 = scanner.nextDouble();
			System.out.println("el resultado es: "+(opcion3/opcion4));
		}
		else 
			System.out.println("el numero es invalido");
	}
}
		