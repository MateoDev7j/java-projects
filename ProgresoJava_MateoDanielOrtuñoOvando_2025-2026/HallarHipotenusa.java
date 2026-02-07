import java.util.Scanner;

public class HallarHipotenusa {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int cateto1;
		int cateto2;
        
        
        System.out.print("Ingresa el numero del primer cateto: ");
        cateto1 = scanner.nextInt();
        
        System.out.print("Ingresa el numero del segundo cateto: ");
        cateto2 = scanner.nextInt();
        

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        System.out.printf("la hipotenusa de el triangulo es: %3f.", hipotenusa);
    }
}