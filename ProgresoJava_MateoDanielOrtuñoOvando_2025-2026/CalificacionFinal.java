import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args) {
		//declaracion de variables
		
		
        Scanner scanner = new Scanner(System.in);
		
        double calificacionParcial1,calificacionParcial2, calificacionParcial3, calificacionTrabajoFinal, calificacionExamenFinal;
        // Variables para almacenar los cálculos intermedios
        double promedioParciales,porcentajeParciales,porcentajeExamen,porcentajeTrabajo,calificacionFinal;

		//resolvemos 
        System.out.println("SISTEMA DE CÁLCULO DE CALIFICACIÓN FINAL");
        System.out.println("Por favor, ingresa las siguientes calificaciones:");
        System.out.println();
        
        // Solicitamos y leemos la primera calificación parcial
        System.out.print("Ingresa la calificación del primer parcial: ");
        calificacionParcial1 = scanner.nextDouble();
        
        System.out.print("Ingresa la calificación del segundo parcial: ");
        calificacionParcial2 = scanner.nextDouble();
        
        
        System.out.print("Ingresa la calificación del tercer parcial: ");
        calificacionParcial3 = scanner.nextDouble();
        
      
        System.out.print("Ingresa la calificación del examen final: ");
        calificacionExamenFinal = scanner.nextDouble();
        
        System.out.print("Ingresa la calificación del trabajo final: ");
        calificacionTrabajoFinal = scanner.nextDouble();
        
        
        
        promedioParciales = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3;
        
        // Calculamos el 55% correspondiente al promedio de parciales
        porcentajeParciales = promedioParciales * 0.55;
        
        // Calculamos el 30% correspondiente al examen final
        porcentajeExamen = calificacionExamenFinal * 0.30;
        
        // Calculamos el 15% correspondiente al trabajo final
        porcentajeTrabajo = calificacionTrabajoFinal * 0.15;
        
        // Calculamos la calificación final sumando todos los porcentajes
        calificacionFinal = porcentajeParciales + porcentajeExamen + porcentajeTrabajo;
        //resultados obtenidos
       
        System.out.println("\nRESULTADOS OBTENIDOS\n");
       
        
        // Mostramos los cálculos intermedios
        System.out.println("Cálculos intermedios:");
        System.out.printf("Promedio de parciales: %.2f\n", promedioParciales);
        System.out.printf("55%% del promedio de parciales: %.2f\n", porcentajeParciales);
        System.out.printf("30%% del examen final: %.2f\n", porcentajeExamen);
        System.out.printf("15%% del trabajo final: %.2f\n", porcentajeTrabajo);
 
        
        // Mostramos el resultado final
        System.out.println("\nRESULTADO FINAL:");
        System.out.printf("CALIFICACIÓN FINAL EN ALGORITMOS: %.2f\n", calificacionFinal);
        System.out.println();
        
    }
}