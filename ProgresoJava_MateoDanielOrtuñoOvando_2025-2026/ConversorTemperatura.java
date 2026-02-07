import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir la temperatura en Fahrenheit
        System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Aplicar la fórmula de conversión
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // Mostrar el resultado
        System.out.println(fahrenheit + "°F equivalen a " + celsius + "°C");
    }
}