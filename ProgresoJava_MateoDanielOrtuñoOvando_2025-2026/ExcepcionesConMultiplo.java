import java.util.Scanner;
public class ExcepcionesConMultiplo {
    public static void main(String[] args) {
		//declaramos variables
        Scanner scanner = new Scanner(System.in);
		int numero1, numero2,mcm=1, i=1;
		//resolvemos
		System.out.println(" Ingresa dos numeros por pantalla y te mostrare su multiplo: ");
		numero1=scanner.nextInt();
		numero2=scanner.nextInt();
		if (numero1<0 && numero2 <0){
			System.out.println(" Tienes que ingresar numeros que sean positivos ");
		}
		else{
			do{
				i++;
				numero1=numero1/2;
				numero2=numero2/2;
				mcm=(numero1*numero2);
			}
			while((mcm%numero1)!=0||(mcm%numero2)!=0)
			

			
		if(numero1>numero2)
			mcm*=numero1;
		else
			mcm*=numero2;
		}
		System.out.println("El multiplo es:  "+mcm);
			
		
	}
}
		