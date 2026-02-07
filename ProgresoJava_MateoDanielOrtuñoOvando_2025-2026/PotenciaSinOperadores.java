import java.util.Scanner;
public class PotenciaSinOperadores {
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		int numero=1;
		double numeroBase=1;
		int resultado=1;
		/*Escribe un programa que dados dos números, uno real (base) y un entero positivo
		(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador
		de potencia*/
		//resolvemos
		System.out.println("Ingresa el numero base y potencia");
		numeroBase=scanner.nextDouble();
		numero=scanner.nextInt();
		for(int i=0;i<=numero;i++)
			{
				resultado= (int)(numeroBase*numero); //Realizamos un cast para que la operacion sea limpia
			}
		System.out.println("el resultado es: "+resultado);
		
		
		
		
		
		
		
		
		
	}
}