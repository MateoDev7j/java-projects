import java.util.Scanner;
	public class Sueldo {
		public static void main(String []args){
				//declaramos variables
				int venta1, venta2, venta3, sueldoBase;
				double totalComision, sueldoFinal;
				final double COMISION =0.1;
				Scanner sc = new Scanner(System.in);
				//resolucion del problema
				System.out.println("introduce el sueldo base");
				sueldoBase = sc.nextInt();
				System.out.println("introduce la primera venta");
				venta1 = sc.nextInt();
				System.out.println("Introduce la segunda venta");
				venta2 = sc.nextInt();
				System.out.println ("introduce la tercera venta");
				venta3 = sc.nextInt();
				totalComision = (venta1 + venta2 + venta3)*COMISION;
				sueldoFinal = totalComision + sueldoBase ;
				System.out.println("Tu sueldo base es: " + sueldoBase);
				System.out.println("tus comisiones son: " + totalComision);
				System.out.println("el sueldo final es: " + sueldoFinal);
		}
	}
				
				