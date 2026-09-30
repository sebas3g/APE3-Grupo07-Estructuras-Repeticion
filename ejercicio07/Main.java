```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numVentas = 0;        
        int totalEntradas = 0;     
        double totalAcumulado = 0; 
        String respuesta;

        System.out.println("===================================");
        System.out.println("   VENTA DE ENTRADAS CINECAMPUS");
        System.out.println("===================================");

        do {
            numVentas++;
            System.out.println();
            System.out.println("--- Venta " + numVentas + " ---");

            System.out.print("Tipo de entrada (1=General, 2=Estudiante, 3=VIP): ");
            int tipo = sc.nextInt();
            while (tipo < 1 || tipo > 3) {
                System.out.println("Tipo invalido. Debe ser 1, 2 o 3");
                System.out.print("Tipo de entrada (1=General, 2=Estudiante, 3=VIP): ");
                tipo = sc.nextInt();
            }

            System.out.print("Cantidad de entradas: ");
            int cantidad = sc.nextInt();
            while (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero");
                System.out.print("Cantidad de entradas: ");
                cantidad = sc.nextInt();
            }

            System.out.print("Precio por entrada: ");
            double precio = sc.nextDouble();
            while (precio <= 0) {
                System.out.println("El precio debe ser mayor que cero");
                System.out.print("Precio por entrada: ");
                precio = sc.nextDouble();
            }

            String nombreTipo;
            switch (tipo) {
                case 1: nombreTipo = "General"; break;
                case 2: nombreTipo = "Estudiante"; break;
                default: nombreTipo = "VIP"; break;
            }

            double subtotal = cantidad * precio;
            totalAcumulado += subtotal;
            totalEntradas += cantidad;

            System.out.printf("Entrada %s | %d x $%.2f | Subtotal: $%.2f%n", nombreTipo, cantidad, precio, subtotal);
            System.out.printf("Total acumulado: $%.2f%n", totalAcumulado);

            System.out.print("Desea realizar otra venta? (S/N): ");
            respuesta = sc.next().toUpperCase();
            while (!respuesta.equals("S") && !respuesta.equals("N")) {
                System.out.println("Respuesta invalida. Escriba S o N");
                System.out.print("Desea realizar otra venta? (S/N): ");
                respuesta = sc.next().toUpperCase();
            }
        } while (respuesta.equals("S"));

        System.out.println();
        System.out.println("===================================");
        System.out.println("          RESUMEN DE VENTAS");
        System.out.println("===================================");
        System.out.println("Numero de ventas: " + numVentas);
        System.out.println("Entradas vendidas: " + totalEntradas);
        System.out.printf("Total recaudado: $%.2f%n", totalAcumulado);
        sc.close();
    }
}
