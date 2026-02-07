import java.util.Scanner;
public class Ecuaciones2GradoExcepciones {
    public static void main(String[] args) {
		//declaramos variables
        Scanner scanner = new Scanner(System.in);
		int a=4,b,c;
		double x, resultado;
		//resolver
		try{
			while(a==4){
				System.out.printf("vamos a resolver una ecuacion de segundo grado ax2 + bx + c = ?\nIngresa los numeros de a,b,c\n");
				a=scanner.nextInt();
				b=scanner.nextInt();
				c=scanner.nextInt();
				
				x = (-b + Math.sqrt((int)Math.pow(b,2)-4*a*c))/(2*a);
				resultado = (-b - Math.sqrt((int)Math.pow(b,2)-4*a*c))/(2*a);
				if (a==0){
					System.out.println("a no puede ser 0 porque division entre 0 no es posible");
				}
				else 
					System.out.printf( "x1= %.2f  |  x2= %.2f ",x,resultado);
			}
		}
			catch(Exception e){
				System.out.println("No es valido ERROR");
		}
	}
}