import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de estudiantes: ");
        int n = sc.nextInt();
        
        System.out.print("Ingrese el numero de dias: ");
        int d = sc.nextInt();
        
        // Contadores globales del curso (se inicializan una sola vez)
        int totalP = 0;
        int totalA = 0;
        
        // Ciclo externo: Recorre cada estudiante
        for (int i = 1; i <= n; i++) {
            // Contadores individuales (se reinician por cada estudiante)
            int estP = 0;
            int estA = 0;
            
            System.out.println("\n--- Registro del Estudiante " + i + " ---");
            
            // Ciclo interno: Recorre cada día para el estudiante actual
            for (int j = 1; j <= d; j++) {
                char estado;
                
                // Validación de entrada para asegurar que sea 'P' o 'A'
                do {
                    System.out.print("Dia " + j + " - Asistencia (P para Presente, A para Ausente): ");
                    // Captura la letra, la convierte a mayúscula y toma el primer carácter
                    estado = sc.next().toUpperCase().charAt(0);
                    
                    if (estado != 'P' && estado != 'A') {
                        System.out.println("Error: Entrada no valida. Ingrese unicamente 'P' o 'A'.");
                    }
                } while (estado != 'P' && estado != 'A');
                
                // Aumentar los contadores dependiendo del estado
                if (estado == 'P') {
                    estP++;
                    totalP++;
                } else { // Si no es P, obligatoriamente es A gracias a la validación
                    estA++;
                    totalA++;
                }
            }
            
            // Salida de resultados individuales (al terminar los días del estudiante)
            System.out.println(">> Resumen Estudiante " + i + ": Asistencias = " + estP + " | Ausencias = " + estA);
        }
        
        // Salida de resultados globales (al terminar el registro de todos los estudiantes)
        System.out.println("\n=== TOTALES GLOBALES DEL CURSO ===");
        System.out.println("Asistencias totales: " + totalP);
        System.out.println("Ausencias totales: " + totalA);
        
        sc.close();
    }
}
