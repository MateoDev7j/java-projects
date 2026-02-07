import java.util.Scanner;
public class CostoTotal{
	public static void main(String[]args){
	//declaramos variables
	double distanciakm, litros, kmcarro, peaje, hotel, litrosNes, costoGas, costototal, costoPersona, personas;
	Scanner scanner = new Scanner(System.in);
	//resolvemoss
	 System.out.println("Ingresa la distancia en km: ");
	 distanciakm = scanner.nextDouble();
	 System.out.println("¿Cuántos km por litro hace tu carro?: ");
	 kmcarro = scanner.nextDouble();
	 System.out.print("Precio por litro de gasolina: ");
	 litros = scanner.nextDouble();
	 System.out.print("Costo de peajes: ");
	 peaje = scanner.nextDouble();
	 System.out.println("Costo total del hotel: ");
	 hotel = scanner.nextDouble();
	 
	 //operamos
	 litrosNes = (distanciakm / kmcarro);
	 costoGas = (litrosNes * litros);
	 costototal = (costoGas + peaje + hotel);
	 personas = 5;
	 costoPersona = (costototal / personas);
	 System.out.printf("el costo total de gasolina es : %.2f ", costoGas);
	 System.out.printf("el costo total de una persona es: %.2f", costototal);
	 System.out.printf("el costo total entre 5 personas es: %.2f", costoPersona);	
	
	}
}
