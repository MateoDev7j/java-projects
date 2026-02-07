import java.util.Scanner;
public class GuessNumberRadom {
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		/*2. Crea una aplicación que permita adivinar un número. La aplicación genera un número
		aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a
		adivinar es mayor o menor que el introducido,a demás de los intentos que te quedan (tienes
		10 intentos para acertarlo). El programa termina cuando se acierta el número (además te dice
		en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número
		que había generado.*/
		int prueba, x, intentos=10;
		boolean acertado= false;
		x = (int)(Math.random()*(100-1+1)+1);
		
		//resolvemos
		do
		{
			System.out.print("\nIntrouce un numero");
			prueba = scanner.nextInt();
			if (prueba ==x)
			{
				System.out.print("\n!Has adivinado el numero");
				acertado = true;
			}
			else
			{
				if (prueba > x)
				{
					System.out.print("\nEl numero es menor");
				}
				else
				{
					System.out.print("\nEl numero es mayor");
				}
			}
			intentos = intentos+1;
		}
		while (intentos<10 && acertado == false);
		if (intentos == 10 )
		{
			System.out.print("\nTe has quedado sin intentos");
		}
		else 
		{
			System.out.printf("\nHas acertado en el intento %d", intentos);
		}
		System.out.printf("\nEl numero era %d",x);
			
	}
}
		