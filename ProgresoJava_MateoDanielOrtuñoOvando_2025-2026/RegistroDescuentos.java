import java.util.Scanner;

public class RegistroDescuentos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Nuevo Registro ===");

        // Simulación de inicio de sesión (no hace nada complejo)
        System.out.println("Iniciando sesión...");

        // Ingreso de datos
        System.out.println("Introducir datos (Documentos, Identificaciones, etc...)");

        double descuento = 0.0;

        System.out.print("¿Es mayor de 65 años? (si/no): ");
        String mayor65 = sc.nextLine().trim().toLowerCase();

        if (mayor65.equals("si")) {
            descuento += 18;
        } else {
            System.out.print("¿Acreditó su pertenencia al ente? (si/no): ");
            String perteneceEnte = sc.nextLine().trim().toLowerCase();

            if (perteneceEnte.equals("si")) {
                descuento += 15;
            } else {
                System.out.print("¿Es familiar de otro alumno? (si/no): ");
                String familiarAlumno = sc.nextLine().trim().toLowerCase();

                if (familiarAlumno.equals("si")) {
                    descuento += 5;
                }
            }
        }

        System.out.println("Calculando descuento total...");
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Cerrando y guardando registro...");
        
        
    }
}
