import java.util.Scanner;
public class ContadorParesImpares{
	public static void main(String[]args){
	//variables
	Scanner scanner=new Scanner(System.in);
	int numero=1, par=1, impar=1,total,i=-1, contadorPar=0, contadorImpar=0;
	//resolvemos
	for(;numero>=0;i++){
			System.out.println(" Ingresa numeros y el programa para cuando ingreses un numero negativo");
			numero=scanner.nextInt();
			if(numero%2==0 && numero>=0){
				par= numero;
				contadorPar++;
			}
			else if (numero%2!=0 && numero>=0){
				impar= numero;
				contadorImpar++;
			}
			
		}
		System.out.println("el numero de pares es: "+contadorPar+" El numero de impares " + contadorImpar + " total de numeros "+i);
		
	}
}