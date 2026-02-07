import java.util.Scanner;
public class HoraSalida {
	public static void main(String[]args){
	//declaramos variables
        int hhSalida;
        int mmSalida;
        int ssSalida;
        int tSegundos;
        int segundosTotalesSalida;
        int segundosTotalesLlegada; 
        int segundosEnUnDia;
        int segundosFinal;
        int hhLlegada; 
        int resto ;
        int mmLlegada;
        int ssLlegada;


	Scanner scanner = new Scanner(System.in);
	//Leer hora de salida
        System.out.print("Hora de salida (HH): ");
        hhSalida = scanner.nextInt();
        
        System.out.print("Minutos de salida (MM): ");
        mmSalida = scanner.nextInt();
        
        System.out.print("Segundos de salida (SS): ");
        ssSalida = scanner.nextInt();
        
        // Leer tiempo de viaje
        System.out.print("Tiempo de viaje en segundos (T): ");
        tSegundos = scanner.nextInt();
        
        //Convertir hora de salida a segundos
        segundosTotalesSalida = hhSalida * 3600 + mmSalida * 60 + ssSalida;
        
        //Sumar tiempo de viaje
        segundosTotalesLlegada = segundosTotalesSalida + tSegundos;
        
        //Convertir segundos totales a HH:MM:SS
        //Ajustar si pasa de 24 horas (usamos módulo)
        segundosEnUnDia = 24 * 3600;
        segundosFinal = segundosTotalesLlegada % segundosEnUnDia;
        
        hhLlegada = segundosFinal / 3600;
        resto = segundosFinal % 3600;
        mmLlegada = resto / 60;
        ssLlegada = resto % 60;
        
        // Mostrar resultados
        System.out.println("\nHora de salida: " + 
                          String.format("%02d:%02d:%02d", hhSalida, mmSalida, ssSalida));
        System.out.println("Tiempo de viaje: " + tSegundos + " segundos");
        System.out.println("Hora de llegada: " + 
                          String.format("%02d:%02d:%02d", hhLlegada, mmLlegada, ssLlegada));
        
        
}
}
	