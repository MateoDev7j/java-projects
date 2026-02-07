import java.util.Scanner;
public class PrimerosMetodos
{
	//metodos estaticos 
	//1. 
	public static void noDevuelveNada(){}
	//2.
	public static int incrementoNumero(int num)
	{
		return num+1;
	}
	//3.
	public static int sumaDosNumeros(double a, double b)
	{
	int y;
	y=(int) (a+b);
	return y;
}
	//4.
	public static void limpiarPantalla()
	{	
		for(int i=0;i<=25;i++)
		{
			System.out.println();
		}
	}
	//5.
	public static void formarCuadrado (int cuadrado)
	{
		for(int fila=0;fila<=cuadrado;fila++)
		{
			for(int colum=0;colum<=cuadrado;colum++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//6.
	public static int asignarSigno(double x){
		int y;
		if(x>0)
			y=1;
		else if(x<0)
			y=-1;
		else 
			y=0;
		return y;
	}
	//7.
	public static int metodoFactorial(int x)
	{
		int resultado=1;
		for(int i=x;i>=1;i--)
		{
			resultado*=i;
		}
		return resultado;
	}
	//8.
	public static boolean esPrimo(int numero)
	{
		if (numero <= 1) {
        return false; 
    }
    

    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    
    return true;  

	}
	//9.
	
	//10.
	public static boolean esNumero(char caracter) 
	{
    
    if (caracter >= '0' && caracter <= '9') {
        return true;
    }
    return false;
}
	// EL MAIN 
	public static void main (String[]args)
	{
		//variables
		int opc;
		int numeroIncrementar;
		double numeroSigno;
		boolean salir=false;
		double a, b;
		int cuadradod;
		int factorial;
		int esPrimon;
		char lol;
		Scanner scanner = new Scanner (System.in);
		//Bucle para ejecutarse y probar los metodos 
		do{
			System.out.print("Numero de metodo: ");
			opc = Integer.parseInt(scanner.nextLine());
			switch(opc)
			{
				case 0: 
					salir=true;
					break;
				case 1:
					noDevuelveNada();
					break;
				case 2:
					System.out.println("Introduce un numero: ");
					numeroIncrementar=Integer.parseInt(scanner.nextLine());
					System.out.println(incrementoNumero(numeroIncrementar));
					break;
				case 3: 
					System.out.println("introduce un numero luego introduce por el que lo quieres sumar: ");
					a=Double.parseDouble(scanner.nextLine());
					b=Double.parseDouble(scanner.nextLine());
					System.out.println("suma: " + sumaDosNumeros(a, b));
					break;
				case 4: 
					limpiarPantalla();
					break;
				case 5:
					System.out.println("Introduce el tamaño del cuadrado ");
					cuadradod=Integer.parseInt(scanner.nextLine());
					formarCuadrado(cuadradod);
					break;
				case 6: 
					System.out.println("ingresa un numero para saber si es positivo negativo o 0");
					numeroSigno=Double.parseDouble(scanner.nextLine());
					System.out.println(asignarSigno(numeroSigno));
					break;
				case 7: 
					System.out.println("Ingresa el numero que quieres factorial ");
					factorial=Integer.parseInt(scanner.nextLine());
					System.out.println(metodoFactorial(factorial));
					break;
				case 8:
					System.out.println("Ingresa un numero");
					esPrimon=Integer.parseInt(scanner.nextLine());
					System.out.println(esPrimo(esPrimon));
					break;
				case 9: 
					System.out.println("");
					break;
				case 10: 
					System.out.println("Ingesa el char: ");
					lol=scanner.nextLine().charAt(0);
					System.out.println(esNumero(lol));
					break;
				default:
					System.out.println("opcion incorrecta ");
					
			}
			
		}while(!salir);
	}
	
	
}