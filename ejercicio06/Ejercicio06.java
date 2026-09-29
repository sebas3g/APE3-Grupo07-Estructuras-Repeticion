import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();
        
        // Inicialización de variables
        double suma = 0;
        double mayor = -1; // Se inicia por debajo del rango mínimo
        double menor = 11; // Se inicia por encima del rango máximo
        int aprobados = 0;
        int reprobados = 0;
        
        // Ciclo para registrar calificaciones
        for (int i = 1; i <= n; i++) {
            double nota;
            
            // Validación para asegurar que la nota esté entre 0 y 10
            do {
                System.out.print("Ingrese la nota del estudiante " + i + " (entre 0 y 10): ");
                nota = sc.nextDouble();
                
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: La nota debe estar en el rango de 0 a 10.");
                }
            } while (nota < 0 || nota > 10);
            
            // Acumular la suma de las notas
            suma += nota;
            
            // Contar aprobados y reprobados
            if (nota >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
            
            // Evaluar nota mayor y menor
            if (nota > mayor) {
                mayor = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }
        
        // Procesamiento de promedios y porcentajes
        double promedio = suma / n;
        double porcApr = (aprobados * 100.0) / n;
        double porcRep = (reprobados * 100.0) / n;
        
        // Impresión de resultados
        System.out.println("\n--- RESULTADOS DEL CURSO ---");
        System.out.printf("Promedio general: %.2f\n", promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.printf("Aprobados: %d (%.2f%%)\n", aprobados, porcApr);
        System.out.printf("Reprobados: %d (%.2f%%)\n", reprobados, porcRep);
        
        sc.close();
    }
}
