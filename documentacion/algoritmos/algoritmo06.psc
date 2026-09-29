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
