import java.util.Scanner;
public class PromedioCalificaciones {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        double calificacion;
        double suma = 0;
        double mayor = 0;
        double menor = 10;
        int aprobados = 0;
        int reprobados = 0;

        // Solicitar cantidad de estudiantes
        do {
            System.out.print("Ingrese la cantidad de estudiantes: ");
            n = entrada.nextInt();

            if (n <= 0) {
                System.out.println("La cantidad debe ser mayor que 0.");
            }

        } while (n <= 0);

        // Registrar las calificaciones
        for (int i = 1; i <= n; i++) {

            // Validar que la calificación esté entre 0 y 10
            do {
                System.out.print("Ingrese la calificacion del estudiante " + i + ": ");
                calificacion = entrada.nextDouble();

                if (calificacion < 0 || calificacion > 10) {
                    System.out.println("Calificacion invalida. Debe estar entre 0 y 10.");
                }

            } while (calificacion < 0 || calificacion > 10);

            // Acumulador
            suma += calificacion;

            // Buscar la calificación mayor
            if (calificacion > mayor) {
                mayor = calificacion;
            }

            // Buscar la calificación menor
            if (calificacion < menor) {
                menor = calificacion;
            }

            // Contar aprobados y reprobados
            if (calificacion >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Calcular promedio
        double promedio = suma / n;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Promedio general: " + promedio);
        System.out.println("Calificacion mayor: " + mayor);
        System.out.println("Calificacion menor: " + menor);
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de reprobados: " + reprobados);

 }
    
}
