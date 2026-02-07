import java.util.Scanner;

public class EPrimoNoPrimoConFor{
	public static void main(String[]args){
		//variables y objetos
		Scanner scanner =new Scanner(System.in);
		//numero si es primo o no verifica hasta su raiz cuadrada
		int i,numero;
		boolean esPrimo=true;
		//resolvemos
		System.out.println("Ingreas el numero te dire si es primo o no");
		numero= scanner.nextInt();
		if(numero<=1){
			esPrimo=false;
		}
		else{
			for(i=2;i*i<numero;i++){
				if(numero%i==0){
					esPrimo=false;
				}
			}
		}
		if(esPrimo==true){
			System.out.println("El numero es primo");
		}
		else
			System.out.println("No es primo;");
	}
}
			
		
		