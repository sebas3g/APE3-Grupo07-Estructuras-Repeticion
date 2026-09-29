Algoritmo Ejercicio09

    Definir n, d, i, j, totalP, totalA, estP, estA Como Entero
    Definir estado Como Caracter
    
    // Contadores globales (inician una sola vez)
    totalP <- 0
    totalA <- 0
    
    Escribir "Ingrese el número de estudiantes: "
    Leer n
    Escribir "Ingrese el número de días: "
    Leer d
    
    // Ciclo externo: iteración de estudiantes
    Para i <- 1 Hasta n Con Paso 1 Hacer
        // Contadores individuales (se reinician en 0 por cada estudiante)
        estP <- 0
        estA <- 0
        
        Escribir ""
        Escribir "--- Registro del Estudiante ", i, " ---"
        
        // Ciclo interno: iteración de los días de ese estudiante
        Para j <- 1 Hasta d Con Paso 1 Hacer
            
            // Bucle de validación para aceptar exclusivamente P o A
            Repetir
                Escribir "Día ", j, " - Asistencia (P para Presente, A para Ausente): "
                Leer estado
                
                // Función nativa de PSeInt para evitar problemas con minúsculas
                estado <- Mayusculas(estado)
                
                Si estado <> "P" Y estado <> "A" Entonces
                    Escribir "Error: Entrada no válida. Ingrese únicamente 'P' o 'A'."
                FinSi
            Hasta Que estado = "P" O estado = "A"
            
            // Actualización de contadores dependiendo de la asistencia
            Si estado = "P" Entonces
                estP <- estP + 1
                totalP <- totalP + 1
            SiNo
                estA <- estA + 1
                totalA <- totalA + 1
            FinSi
            
        FinPara
        
        // Reporte individual al finalizar los días del estudiante actual
        Escribir ">> Resumen Estudiante ", i, ": Asistencias = ", estP, " | Ausencias = ", estA
    FinPara
    
    // Reporte global del curso al finalizar los ciclos
    Escribir ""
    Escribir "=== TOTALES GLOBALES DEL CURSO ==="
    Escribir "Asistencias totales: ", totalP
    Escribir "Ausencias totales: ", totalA
FinAlgoritmo
