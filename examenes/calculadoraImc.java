import java.util.Scanner;
public class calculadoraImc{
	public static void main(String[]args){
		//declaramos variables
		String nombre, letraDni;
		int dni, imac;
		char letraDni1;
		
		double peso;
		double metros;
		Scanner scanner=new Scanner(System.in);
		//resolvemos
		System.out.println("ingresa tu nombre: ");
		nombre = scanner.nextLine();
		System.out.println("ingresa el numero de DNI: ");
		dni = scanner.nextInt();
		scanner.nextLine();
		System.out.println("letra del dni: ");
		letraDni = scanner.nextLine();
		
		System.out.println("ingresa tu peso en kilogramos(ej. 75,5): ");
		peso = scanner.nextDouble();
		System.out.println("ingresa tu altura en metros(ej. 1,75): ");
		metros = scanner.nextDouble();
		//resolvemos aritmeticamente
		imac = (int)(peso/(Math.pow(metros, 2)));
		System.out.println("Calculadora de indice de Masa Corporal (IMC) ");
		System.out.println("****************************************************");
		System.out.println("*Nombre: "+ nombre + "      *       NIF: "+ dni + letraDni+"***");
		System.out.println("****************************************************");
		
		System.out.println("*IMAC: "+ imac + "             \nESTADO:");
		if (imac<18)
		System.out.print("bajo de peso");
		else if (imac>18 && imac<25)
		System.out.print("normal");
		else 
		System.out.print("Sobrepeso");
		System.out.println("***********************************************");
		
			
			
		
		
		
		
		
	}
}