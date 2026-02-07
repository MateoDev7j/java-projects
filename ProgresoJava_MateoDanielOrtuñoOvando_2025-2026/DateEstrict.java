import java.util.Scanner;
public class DateEstrict{
    public static void main(String[] args) {
        // declaramos variables
        Scanner scanner = new Scanner(System.in);
		int dia, mes, año;
		String fecha = "";
		//resolvemos
		System.out.println("ingresa un dia: 7 un mes: 7 y un año: 2000 ");
		dia = scanner.nextInt();
		mes = scanner.nextInt();
		año = scanner.nextInt();
		fecha = dia + "/" + mes + "/" + año; 
		System.out.println("el numero que ingresaste es: " + fecha);
		if ((dia == 7 && mes==7) && año==2000)
			System.out.println("CORRECTO");
		else
			System.out.println("INCORRECTO");
	}
}