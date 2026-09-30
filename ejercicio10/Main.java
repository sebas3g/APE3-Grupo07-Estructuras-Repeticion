```
import java.util.Scanner;

public class Main {
    static final int MAX = 100;
    static String[] producto = new String[MAX];
    static int[] cantidad = new int[MAX];
    static double[] precio = new double[MAX];
    static double[] subtotal = new double[MAX];
    static int numVentas = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println();
            System.out.println("===================================");
            System.out.println("    SISTEMA INTEGRADO DE VENTAS");
            System.out.println("===================================");
            System.out.println("1. Registrar venta");
            System.out.println("2. Mostrar estadisticas");
            System.out.println("3. Salir");
            System.out.println("===================================");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("Opcion invalida. Debe estar entre 1 y 3");
                System.out.print("Seleccione una opcion: ");
                opcion = sc.nextInt();
            }
            sc.nextLine(); // limpiar el salto de linea

            switch (opcion) {
                case 1: registrarVenta(); break;
                case 2: mostrarEstadisticas(); break;
                case 3: System.out.println("Gracias por usar el sistema."); break;
            }
        } while (opcion != 3);
    }

    static void registrarVenta() {
        if (numVentas == MAX) {
            System.out.println("Se alcanzo el maximo de ventas.");
            return;
        }
        System.out.print("Producto: ");
        String p = sc.nextLine().trim();
        while (p.isEmpty()) {
            System.out.println("El nombre del producto no puede estar vacio");
            System.out.print("Producto: ");
            p = sc.nextLine().trim();
        }

        System.out.print("Cantidad: ");
        int c = sc.nextInt();
        while (c <= 0) {
            System.out.println("La cantidad debe ser mayor que cero");
            System.out.print("Cantidad: ");
            c = sc.nextInt();
        }

        System.out.print("Precio unitario: ");
        double pr = sc.nextDouble();
        while (pr <= 0) {
            System.out.println("El precio debe ser mayor que cero");
            System.out.print("Precio unitario: ");
            pr = sc.nextDouble();
        }

        producto[numVentas] = p;
        cantidad[numVentas] = c;
        precio[numVentas] = pr;
        subtotal[numVentas] = c * pr;
        System.out.printf("Venta registrada: %s | %d x $%.2f = $%.2f%n", p, c, pr, subtotal[numVentas]);
        numVentas++;
    }

    static void mostrarEstadisticas() {
        System.out.println();
        System.out.println("--- ESTADISTICAS ---");
        if (numVentas == 0) {
            System.out.println("No hay ventas registradas.");
            return;
        }
        int unidades = 0;
        double total = 0;
        int posMayor = 0;

        // Recorrido de todas las ventas con for
        for (int i = 0; i < numVentas; i++) {
            unidades += cantidad[i];
            total += subtotal[i];
            if (subtotal[i] > subtotal[posMayor]) {
                posMayor = i;
            }
        }

        System.out.println("Numero de ventas: " + numVentas);
        System.out.println("Unidades vendidas: " + unidades);
        System.out.printf("Total recaudado: $%.2f%n", total);
        System.out.printf("Venta mayor: %s ($%.2f)%n", producto[posMayor], subtotal[posMayor]);
        System.out.printf("Promedio por venta: $%.2f%n", total / numVentas);
    }
}
