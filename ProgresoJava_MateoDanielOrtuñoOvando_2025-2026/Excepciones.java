import java.util.Scanner;
public class Excepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		/*Crea un programa que solicite un número entero al usuario por teclado. Si el número
		introducido es 1, 2 o 3 debe salir un mensaje con el número escrito. Para cualquier otro
		número, el programa mostrará un mensaje por defecto ("El número introducido no es
		válido"). Usa un switch y control de excepciones.*/
		int num;
		//resvolvemos
		try{
		System.out.println("Introduce un numero ");
		num = scanner.nextInt();
		if (num<=3){
			switch (num) {
				case 1:
			System.out.println(" El numero es UNO ");
			break;
				case 2:
			System.out.println(" El numero es DOS ");
			break;
				case 3:
			System.out.println(" El numero es TRES ");
			}
		}
		}
		catch (Exception e){
			System.out.println("introduce un int no un string ");
	}
}
}
		
		