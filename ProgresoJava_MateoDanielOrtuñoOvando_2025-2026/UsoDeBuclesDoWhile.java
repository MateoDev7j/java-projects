import java.util.Scanner;
public class UsoDeBuclesDoWhile {
    public static void main(String[] args) {
		//declaramos variables
		Scanner scanner = new Scanner(System.in);
		int numero, decenas, unidades,  centenas, i=10;
		boolean sumaDigitos, multiplo, multiplo2;
		//resolver
		System.out.println("Ingresa un numero y verificare si es multiplo de 2 y tres al mismo tiempo: ");
		numero=scanner.nextInt();
		do{
			i++;
			multiplo=numero%2==0;
			if(numero>=0 && numero<=9){
			multiplo2= numero%3==0;
			}
			else if(numero>=10 && numero<=99){
				decenas=numero /10;
				unidades= numero%10;
				sumaDigitos=decenas+unidades%3==0;
				multiplo= numero%2==0;
				multiplo2= sumaDigitos;
			}
			else{ 
				centenas= (numero /100)/10 ;
				decenas=numero /10;
				unidades= numero%10;
				sumaDigitos=centenas+decenas+unidades%3==0;
				multiplo= numero%2==0;
				multiplo2=sumaDigitos;
			}
			
		
		
		}
		while(numero%2!=0);
		if(multiplo && multiplo2)
		System.out.println("el numero: "+numero+"es multiplo de 2 y 3");
		else 
			System.out.println("NO es multiplo de 2 y 3 ");
		
       
	}
}
		
		