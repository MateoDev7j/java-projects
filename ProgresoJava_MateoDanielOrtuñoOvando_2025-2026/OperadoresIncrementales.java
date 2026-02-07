//Ejemplo de operadores incrementales ** -- 

public class OperadoresIncrementales{
	public static void main(String [] args) {
		//Declaramos 3 variables de tipo entero
		int x=3,y,z;
		
		y=++x;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		z=x++;
		System.out.println("x="+x);
		System.out.println("x="+x);
		System.out.println("z="+z);
		
		
	}
}