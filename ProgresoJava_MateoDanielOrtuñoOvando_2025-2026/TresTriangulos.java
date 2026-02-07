import java.util.Scanner;
public class TresTriangulos{
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		//Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los
		//lados de un triángulo. El programa debe determinar que tipo de triángulo es, teniendo en
		//cuenta:
		//a) Si se cumple Pitágoras entonces es triángulo rectángulo
		//b) Si sólo dos lados del triángulo son iguales entonces es isósceles.
		//c) Si los 3 lados son iguales entonces es equilátero.
		int a, b, c;
		System.out.println("Ingresa el valor de el lado a= lado b= lado c=: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if (a*a + b*b == c*c){
			System.out.println("LEY DE PITAGORAS");
		}
		else if ((a==b) && (a!=c) && (b!=c)){
			System.out.println("ISOCELES");
		}
		else if ((a==b) && (b==c) && (a==c)){
			System.out.println("EQUILATERO");
		}
		else {
			System.out.println("ESCALENO");
		}
	}
}
