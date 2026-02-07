import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número de 3 dígitos: ");
        int numero = scanner.nextInt();
        
        //Descomponer en dígitos
        int centenas = numero / 100;          
        int decenas = (numero % 100) / 10;    
        int unidades = numero % 10;           
        
        //Reconstruir invertido con multiplicaciones
        int invertido = unidades * 100 + decenas * 10 + centenas;
        
        System.out.println("Número original: " + numero);
        System.out.println("Número invertido: " + invertido);
    }
}