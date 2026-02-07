//Mateo Daniel Ortuño Ovando
import java.util.Scanner;
public class PruebaExamen{
	public static void main(String []args){
	//declaramos variables
	int numero1, invertido, unidades, centenas, decenas;
	Scanner scanner = new Scanner(System.in);
	//ponemos en pantalla numeros
	System.out.println("ingresa los numeros: ");
	numero1 = scanner.nextInt();
	
	System.out.println("numero entero: "+numero1 );
	centenas = numero1 / 100;
	decenas = (numero1  % 100) / 10;
	unidades = numero1 % 10;
	invertido = unidades *100 + decenas *10 + centenas;
	System.out.println("numero invertido: " + invertido);
	}

}
