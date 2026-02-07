import java.util.Scanner;
	public class Minutos {
		public static void main(String []args){
				//declaramos variables
				Scanner cs = new Scanner(System.in);
				int x;
				
				//resolucion del problema
				System.out.println("introducimos una cantidad en minutos: ");
				x = cs.nextInt();
				
				System.out.println("Minutos: " + x);
				System.out.println("serian: " + (x/60) + "Horas con " + (x%60) + "Minutos");
		}
	}