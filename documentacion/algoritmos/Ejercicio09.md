## Algoritmo

**Paso 1:** Inicio del programa.

**Paso 2:** Inicializar en cero los contadores globales del curso (`totalP = 0`, `totalA = 0`).

**Paso 3:** Solicitar y leer la cantidad de estudiantes (`N`) y la cantidad de días a evaluar (`D`).

**Paso 4:** Iniciar un ciclo externo para recorrer cada estudiante, desde `i = 1` hasta `N`.
*   **Paso 4.1:** Inicializar en cero los contadores individuales del estudiante actual (`estP = 0`, `estA = 0`).
*   **Paso 4.2:** Iniciar un ciclo interno para recorrer cada día del estudiante actual, desde `j = 1` hasta `D`.
    *   **Paso 4.2.1:** Solicitar y leer el `estado` de asistencia del día.
    *   **Paso 4.2.2:** Validar la entrada. Si `estado` es distinto de 'P' y distinto de 'A', mostrar mensaje de error y regresar al Paso 4.2.1 hasta que sea válido.
    *   **Paso 4.2.3:** Evaluar asistencia: si `estado` es igual a 'P', incrementar el contador individual (`estP`) y el global (`totalP`).
    *   **Paso 4.2.4:** Evaluar ausencia: si `estado` es igual a 'A', incrementar el contador individual (`estA`) y el global (`totalA`).
*   **Paso 4.3:** Finalizado el ciclo interno (días), imprimir el resumen individual mostrando las asistencias (`estP`) y ausencias (`estA`) del estudiante actual.

**Paso 5:** Finalizado el ciclo externo (estudiantes), imprimir el resumen global mostrando el total de asistencias (`totalP`) y el total de ausencias (`totalA`) de todo el curso.

**Paso 6:** Fin del programa.


## Pseudocódigo

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
