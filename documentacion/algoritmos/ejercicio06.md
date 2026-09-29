## Algoritmo

**Paso 1:** Inicio del programa.
**Paso 2:** Inicializar acumuladores y contadores en cero (`suma = 0`, `aprobados = 0`, `reprobados = 0`).
**Paso 3:** Inicializar variables de extremos con valores fuera de rango (`mayor = -1`, `menor = 11`).
**Paso 4:** Solicitar y leer la cantidad total de estudiantes (`N`).
**Paso 5:** Iniciar un ciclo principal que se repita desde `i = 1` hasta `N`.
*   **Paso 5.1:** Solicitar y leer la `nota` del estudiante actual.
*   **Paso 5.2:** Validar la nota. Si `nota < 0` o `nota > 10`, mostrar un mensaje de error y regresar al Paso 5.1 hasta que el valor sea válido.
*   **Paso 5.3:** Acumular el valor sumándolo al total (`suma = suma + nota`).
*   **Paso 5.4:** Evaluar la nota: si `nota >= 7`, incrementar el contador `aprobados`. De lo contrario, incrementar `reprobados`.
*   **Paso 5.5:** Evaluar extremos: si `nota > mayor`, actualizar `mayor = nota`. Si `nota < menor`, actualizar `menor = nota`.
**Paso 6:** Finalizado el ciclo, calcular el `promedio` general (`suma / N`).
**Paso 7:** Calcular los porcentajes aplicando regla de tres para aprobados `(aprobados * 100) / N` y reprobados `(reprobados * 100) / N`.
**Paso 8:** Imprimir en pantalla el promedio general, nota mayor, nota menor, y las cantidades/porcentajes de aprobados y reprobados.
**Paso 9:** Fin del programa.

---

## Pseudocódigo

Algoritmo Ejercicio06
	
    Definir n, i, aprobados, reprobados Como Entero
    Definir nota, suma, mayor, menor, promedio, porcApr, porcRep Como Real
    
    // Inicialización de variables
    suma <- 0
    aprobados <- 0
    reprobados <- 0
    mayor <- -1
    menor <- 11
    
    Escribir "Ingrese la cantidad de estudiantes: "
    Leer n
    
    // Ciclo principal para procesar N estudiantes
    Para i <- 1 Hasta n Con Paso 1 Hacer
        
        // Bucle de validación para asegurar que la nota esté entre 0 y 10
        Repetir
            Escribir "Ingrese la nota del estudiante ", i, " (entre 0 y 10): "
            Leer nota
            
            Si nota < 0 O nota > 10 Entonces
                Escribir "Error: La nota debe estar en el rango de 0 a 10."
            FinSi
        Hasta Que nota >= 0 Y nota <= 10
        
        // Acumulador de notas
        suma <- suma + nota
        
        // Contadores de aprobados y reprobados
        Si nota >= 7 Entonces
            aprobados <- aprobados + 1
        SiNo
            reprobados <- reprobados + 1
        FinSi
        
        // Evaluación de máximos y mínimos
        Si nota > mayor Entonces
            mayor <- nota
        FinSi
        
        Si nota < menor Entonces
            menor <- nota
        FinSi
        
    FinPara
    
    // Cálculos finales de promedios y porcentajes
    promedio <- suma / n
    porcApr <- (aprobados * 100) / n
    porcRep <- (reprobados * 100) / n
    
    // Impresión de resultados
    Escribir ""
    Escribir "--- RESULTADOS DEL CURSO ---"
    Escribir "Promedio general: ", promedio
    Escribir "Nota mayor: ", mayor
    Escribir "Nota menor: ", menor
    Escribir "Aprobados: ", aprobados, " (", porcApr, "%)"
    Escribir "Reprobados: ", reprobados, " (", porcRep, "%)"
FinAlgoritmo
