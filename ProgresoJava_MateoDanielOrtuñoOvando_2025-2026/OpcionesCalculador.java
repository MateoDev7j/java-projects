import java.util.Scanner;

public class OpcionesCalculador{
    public static void main(String[] args) {
        // declaramos variables
        int numero, opcion1, opcion2;
        double opcion3, opcion4;
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("1.sumar\n2.restar\n3.multiplicar\n4.dividir");
        System.out.println("Introduce un numero del 1 al 4: ");
        numero = scanner.nextInt();
        
        
        switch (numero) {
            case 1:
                System.out.println("Sumar");
                System.out.println("Introduce dos numeros para sumar: ");
                opcion1 = scanner.nextInt();
                opcion2 = scanner.nextInt();
                System.out.println("El resultado es: " + (opcion1 + opcion2));
                break;
            case 2:
                System.out.println("Restar"); 
                System.out.println("Introduce dos numeros para restar: ");
                opcion1 = scanner.nextInt();
                opcion2 = scanner.nextInt();
                System.out.println("El resultado es: " + (opcion1 - opcion2));
                break;
            case 3:
                System.out.println("Multiplicar");
                System.out.println("Introduce dos numeros para multiplicar: ");
                opcion1 = scanner.nextInt();
                opcion2 = scanner.nextInt();
                System.out.println("El resultado es: " + (opcion1 * opcion2));
                break;
            case 4:
                System.out.println("Dividir");
                System.out.println("Introduce dos numeros para dividir: ");
                opcion3 = scanner.nextDouble();
                opcion4 = scanner.nextDouble();
                System.out.println("El resultado es: " + (opcion3 / opcion4));
                break;
            default: 
                System.out.println("Numero invalido");
        }
        
    }
}