import java.util.Scanner;

public class CalcularTriangulo {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double base;
        double altura;
        
        System.out.print("Ingresa los lados de la altura: ");
        altura = scanner.nextDouble();
        
        System.out.print("Ingresa los lados de la base: ");
        base = scanner.nextDouble();
        
        // Calcular el perímetro del rectángulo: 2*(base + altura)
        double perimetro = 2 * (base + altura);
        
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
}