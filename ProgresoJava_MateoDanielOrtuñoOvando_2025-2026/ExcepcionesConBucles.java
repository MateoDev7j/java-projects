import java.util.Scanner;
public class ExcepcionesConBucles {
    public static void main(String[] args) {
		//declaramos variables
        Scanner scanner = new Scanner(System.in);
		/*Calcula la nota de un resultado de aprendizaje de la asignatura Programación. 
		El programa pedirá tres calificaciones y calculará la media ponderada:*/
		double odYec=0, pr=0, pe=0,calificacionFinal;
		//resolvemos
		try{
			while(odYec<10 || pr<10 || pe<10){
				System.out.println("introduce la calificacion de ODyEC (0-10): ");
				odYec=scanner.nextDouble();
				System.out.println("introduce la calificacion de PR (0-10): ");
				pr=scanner.nextDouble();
				System.out.println("introduce la calificacion de PE (0-10): ");
				pe=scanner.nextDouble();
				odYec=odYec*0.10;
				pr=pr*0.30;
				pe=pe*0.60;
				calificacionFinal= (odYec+pr+pe)/3;
				if(pe<5*0.6){
					if(calificacionFinal>4){
						calificacionFinal=4;
					}
				}
				System.out.printf("la calificacion Final es %.2f\n",calificacionFinal);
			}
		}
		catch(Exception e){
			System.out.println("|Error|");
		}
	}
}