import java.util.Scanner;
public class ControlExcepciones {
    public static void main(String[] args) {
		//declaramos variables
        Scanner scanner = new Scanner(System.in);
		double a,b, i=0, resultado;
		String no="no", si="si", respuesta="si";
		char letra;
		//resolvemos

		while(respuesta.equals("si")  ){			
			try{
				System.out.println(" Por favor, introduzca el valor de a: ");
				a=scanner.nextDouble();
				System.out.println(" Ahora introduzca el valor de b: ");
				b=scanner.nextDouble();
				resultado=(-b/a);
				if(a!=0)
					System.out.println(" este es el resultado x="+ resultado);
				else
					System.out.println(" No se puede dividir entre 0 ");
				System.out.println(" quieres continuar? si o no ");
				scanner.nextLine();
				respuesta = scanner.nextLine();
			}
			catch(Exception e){
				System.out.println("Ingresaste un numero donde no es o vicebersa ");
			}
		}
	}
}