import java.util.Scanner;   

public class CalcularMedia {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        
        // Variables
        double numero1;  
        double numero2;
        double numero3;
        
       
        System.out.print("Ingresa el primer número: ");
        numero1 = sc.nextDouble();  
        
        System.out.print("Ingresa el segundo número: ");
        numero2 = sc.nextDouble();
        
        System.out.print("Ingresa el tercer número: ");
        numero3 = sc.nextDouble();
        
        // Resolución 
        double resultado = (numero1 + numero2 + numero3) / 3;
        
        System.out.println("La media de los tres números es: " + resultado);  
    }
}

