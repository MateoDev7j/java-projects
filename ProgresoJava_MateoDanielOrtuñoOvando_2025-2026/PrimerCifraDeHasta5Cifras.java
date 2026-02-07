import java.util.Scanner;
public class PrimerCifraDeHasta5Cifras {
    public static void main(String[] args) {
		//declaramos variables
        Scanner scanner = new Scanner(System.in);
		/*5. Escribe un programa que diga cuál es la primera cifra de un número entero introducido por
		teclado. Se permiten números de hasta 5 cifras y no se puede convertir el número a String.*/
		int numero=0, primer;
		//resolvemos
		try{
			System.out.println("Ingresa un numero entero Se permiten hasta 5 cifras");
			numero=scanner.nextInt();
			if(numero<=999){
				primer=numero/100;
				System.out.println("El primer numero es este : "+primer);
			}
			else if(numero>999 && numero<=9999){
				primer =(numero/100)/10;
				System.out.println("El primer numero es este : "+primer);
			}
			else if(numero >9999 && numero<=99999){
				primer =((numero /100)/10)/10;
				System.out.println("El primer numero es este : "+primer);
			}
			else {
				System.out.println(" MAXIMO 5 CIFRAS ");
			}
		}
		catch ()
	
	}
}
