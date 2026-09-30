# Ejercicio 1. Promedio de calificaciones

## ALGORITMO

1. **Inicio.**

2. **Solicitar la cantidad de estudiantes (N).**

3. **Validar la cantidad de estudiantes.**

   * Si N es menor o igual a 0, mostrar un mensaje de error.
   * Volver a solicitar N hasta que sea mayor que 0.

4. **Inicializar las variables.**

   * `suma = 0`
   * `aprobados = 0`
   * `reprobados = 0`

5. **Repetir el proceso para cada estudiante**, desde 1 hasta N.

6. **Solicitar la calificación del estudiante.**

7. **Validar la calificación.**

   * Si la calificación es menor que 0 o mayor que 10, mostrar un mensaje de error.
   * Volver a solicitar la calificación hasta que esté entre 0 y 10.

8. **Sumar la calificación** al acumulador `suma`.

9. **Determinar si el estudiante aprobó o reprobó.**

   * Si la calificación es mayor o igual a 7, aumentar `aprobados` en 1.
   * Si la calificación es menor que 7, aumentar `reprobados` en 1.

10. **Determinar la calificación mayor y menor.**

    * Si es el primer estudiante, guardar su calificación como `mayor` y `menor`.
    * Si no es el primero:

      * Si la calificación es mayor que `mayor`, actualizar `mayor`.
      * Si la calificación es menor que `menor`, actualizar `menor`.

11. **Calcular el promedio general** dividiendo la suma de las calificaciones para N.

12. **Mostrar los resultados:**

    * Promedio general.
    * Calificación mayor.
    * Calificación menor.
    * Número de aprobados.
    * Número de reprobados.

13. **Fin.**

---

## PSEUDOCÓDIGO

```text
Algoritmo PromedioCalificaciones

    Definir n, i, aprobados, reprobados Como Entero
    Definir nota, suma, mayor, menor, promedio Como Real

    // 1. Solicitar y validar cantidad de estudiantes
    Repetir
        Escribir "Ingrese la cantidad de estudiantes: "
        Leer n

        Si n <= 0 Entonces
            Escribir "La cantidad debe ser mayor que cero."
        FinSi
    Hasta Que n > 0

    // 2. Inicializar variables
    suma <- 0
    aprobados <- 0
    reprobados <- 0

    // 3. Ingresar calificaciones
    Para i <- 1 Hasta n Con Paso 1 Hacer

        // 4. Validar calificacion
        Repetir
            Escribir "Calificacion del estudiante ", i, ": "
            Leer nota

            Si nota < 0 O nota > 10 Entonces
                Escribir "La calificacion debe estar entre 0 y 10."
            FinSi
        Hasta Que nota >= 0 Y nota <= 10

        // 5. Acumular calificaciones
        suma <- suma + nota

        // 6. Determinar aprobados y reprobados
        Si nota >= 7 Entonces
            aprobados <- aprobados + 1
        SiNo
            reprobados <- reprobados + 1
        FinSi

        // 7. Determinar mayor y menor
        Si i = 1 Entonces
            mayor <- nota
            menor <- nota
        SiNo

            Si nota > mayor Entonces
                mayor <- nota
            FinSi

            Si nota < menor Entonces
                menor <- nota
            FinSi

        FinSi

    FinPara

    // 8. Calcular promedio
    promedio <- suma / n

    // 9. Mostrar resultados
    Escribir "Promedio general: ", promedio
    Escribir "Calificacion mayor: ", mayor
    Escribir "Calificacion menor: ", menor
    Escribir "Aprobados: ", aprobados
    Escribir "Reprobados: ", reprobados

FinAlgoritmo
```
