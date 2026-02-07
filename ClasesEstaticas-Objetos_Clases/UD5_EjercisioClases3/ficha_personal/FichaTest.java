package ficha_personal;
import fecha.Fecha;
import fecha.EnumMes;
import java.util.Scanner;
public class FichaTest
{
	public static void main(String[]args)
	{
		//inicializamos scanner y variables
		String nombre, fecha;
		Scanner scanner= new Scanner(System.in);
		//Creo una FichaPersonal y la muestro
		Fecha fNac = new Fecha(2,EnumMes.Mar,2010);
		FichaPersonal ficha1 = new FichaPersonal("Ana",fNac);
		System.out.println(ficha1);
		//pedimos valores al usuario
		System.out.println("Nombre:");
		nombre=scanner.nextLine();

		// prueba
		Fecha fechaNacimiento = null;
        
        // Pedimos la fecha hasta que tenga el formato correcto
        while (true) {
            System.out.println("Fecha de nacimiento (dd/mm/aaaa):");
            fecha = scanner.nextLine();
            
            // Verificamos que tenga el formato básico con 2 barras
            if (fecha.length() == 10 && 
                fecha.charAt(2) == '/' && 
                fecha.charAt(5) == '/') {
                
                try {
                    // Extraemos día, mes y año manualmente
                    String diaStr = fecha.substring(0, 2);
                    String mesStr = fecha.substring(3, 5);
                    String añoStr = fecha.substring(6, 10);
                    
                    int dia = Integer.parseInt(diaStr);
                    int mes = Integer.parseInt(mesStr);
                    int año = Integer.parseInt(añoStr);
                    
                    // Convertimos mes numérico a EnumMes
                    EnumMes mesEnum;
                    
                    if (mes == 1) mesEnum = EnumMes.Ene;
                    else if (mes == 2) mesEnum = EnumMes.Feb;
                    else if (mes == 3) mesEnum = EnumMes.Mar;
                    else if (mes == 4) mesEnum = EnumMes.Abr;
                    else if (mes == 5) mesEnum = EnumMes.May;
                    else if (mes == 6) mesEnum = EnumMes.Jun;
                    else if (mes == 7) mesEnum = EnumMes.Jul;
                    else if (mes == 8) mesEnum = EnumMes.Ago;
                    else if (mes == 9) mesEnum = EnumMes.Sep;
                    else if (mes == 10) mesEnum = EnumMes.Oct;
                    else if (mes == 11) mesEnum = EnumMes.Nov;
                    else if (mes == 12) mesEnum = EnumMes.Dic;
                    else {
                        System.out.println("Error: Mes debe ser del 1 al 12");
                        continue;
                    }
                    
                    // Creamos la fecha
                    fechaNacimiento = new Fecha(dia, mesEnum, año);
                    break; // Salimos del bucle si todo está bien
                    
                } catch (Exception e) {
                    System.out.println("Error: La fecha debe contener solo números");
                }
            } else {
                System.out.println("Error: Formato debe ser dd/mm/aaaa (con ceros)");
            }
        }
        
        // Creamos la nueva ficha personal
        FichaPersonal nueva = new FichaPersonal(nombre, fechaNacimiento);
        System.out.println("\nNueva ficha creada:");
        System.out.println(nueva);
        
        
	}
}