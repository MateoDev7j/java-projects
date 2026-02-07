import java.util.Scanner;
import java.util.Arrays;

public class ArraysUtilizandoEnum {
    public static void main(String[] args) {
		//varialbes y objetos 
		Scanner scanner= new Scanner(System.in);
		int []temperaturas= new int [12];
		enum Mes{Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre,Octubre, Noviembre, Diciembre}
		int i=0;
		//solucionamos 
		for (Mes mes : Mes.values()){
			System.out.printf("\nTemperatura de %s: ", mes);
			temperaturas[i] = scanner.nextInt();
			i++;
		}
		//Mostramos diagrama de barras 
		i =0;
		for (Mes meses: Mes.values()){
			System.out.printf("\n%s %s", meses, temperaturas[i]);
			i++;
			for(int x=0;x<temperaturas[i];x++){
				System.out.print("\n*");
			}
		}	
	
	}
}