# Ejercicio 4. Tabla de multiplicar validada

## ALGORITMO

1. **Inicio.**

2. **Solicitar un número** al usuario, indicando que debe estar entre 1 y 12.

3. **Validar el número ingresado.**

   * Si el número es menor que 1 o mayor que 12, mostrar un mensaje de error.
   * Volver a solicitar el número hasta que esté dentro del rango permitido.

4. **Mostrar el título de la tabla**, indicando el número ingresado.

5. **Repetir el proceso de multiplicación** desde 1 hasta 12.

6. **Calcular el resultado** multiplicando el número ingresado por el multiplicador `i`.

7. **Mostrar cada operación** en el formato:

   * `numero x i = resultado`

8. **Repetir el proceso** hasta llegar al multiplicador 12.

9. **Fin.**

---

## PSEUDOCÓDIGO

```text id="m8k2xp"
Algoritmo TablaMultiplicarValidada

    Definir numero, i, resultado Como Entero

    // 1. Solicitar el numero
    Escribir "Ingrese un numero entre 1 y 12: "
    Leer numero

    // 2. Validar el numero
    Mientras numero < 1 O numero > 12 Hacer

        Escribir "Numero incorrecto. Debe estar entre 1 y 12."

        Escribir "Ingrese un numero entre 1 y 12: "
        Leer numero

    FinMientras

    // 3. Mostrar titulo
    Escribir "TABLA DEL ", numero

    // 4. Generar la tabla
    Para i <- 1 Hasta 12 Con Paso 1 Hacer

        resultado <- numero * i

        Escribir numero, " x ", i, " = ", resultado

    FinPara

FinAlgoritmo
```
