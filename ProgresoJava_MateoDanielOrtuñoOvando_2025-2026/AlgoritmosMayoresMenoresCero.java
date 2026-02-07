import java.util.Scanner;
public class AlgoritmosMayoresMenoresCero{
    public static void main(String[] args) {
        // declaramos variables
		/*Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
		introducir). El programa debe informar de cuantos números introducidos son mayores que 0,
		menores que 0 e iguales a 0.*/
        int nValores, numValoresMayoresCero = 0 , numValoresMenoresCero = 0, numeroValoresIgualesCero = 0;
		double valor;
		int i;
		
		
		Scanner scanner = new Scanner(System.in);
		//resolvemos
		System.out.println("Ingresa la candidad de numeros: ");
		nValores = scanner.nextInt();
		 for (i = 1; i <= nValores; i++) {
            System.out.print("Número " + i + ": ");
            valor = scanner.nextDouble(); 
            
            
            if (valor > 0) {
                numValoresMayoresCero++;
            } else if (valor < 0) {
                numValoresMenoresCero++;
            } else {
                numeroValoresIgualesCero++;
			}
		 }
			System.out.printf("el numero de numeros mayores que cero es %d el numero de numeros menores que cero es %d y el numero iguales a 0 es %d" , numValoresMayoresCero, numValoresMenoresCero, numeroValoresIgualesCero);
			
        }
	}
		

