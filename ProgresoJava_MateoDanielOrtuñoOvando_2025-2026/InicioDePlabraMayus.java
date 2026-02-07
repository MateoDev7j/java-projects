import java.util.Scanner;

public class InicioDePlabraMayus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String cad = scanner.nextLine();
        
        // Convertir la cadena original a minúsculas primero para asegurar consistencia
        cad = cad.toLowerCase();

        // Usamos StringBuilder para poder modificar la cadena eficientemente
        StringBuilder resultado = new StringBuilder(cad);
        
        boolean capitalizarSiguiente = true; // Empezamos asumiendo que el primer caracter es el inicio de una palabra

        for (int i = 0; i < resultado.length(); i++) {
            char caracterActual = resultado.charAt(i);

            if (Character.isWhitespace(caracterActual)) {
                // Si encontramos un espacio, el siguiente carácter debe capitalizarse
                capitalizarSiguiente = true;
            } else if (capitalizarSiguiente) {
                // Si es el inicio de una palabra, lo convertimos a mayúscula
                resultado.setCharAt(i, Character.toUpperCase(caracterActual));
                capitalizarSiguiente = false; // El siguiente carácter ya no es el inicio de palabra
            }
        }
        
        System.out.println("Cadena resultante: " + resultado.toString());
        
    }
}
