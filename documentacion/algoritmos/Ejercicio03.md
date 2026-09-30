# Ejercicio 3. Calculadora con menú repetitivo

## ALGORITMO

1. **Inicio.**

2. **Mostrar el menú de opciones:**

   * 1. Sumar
   * 2. Restar
   * 3. Multiplicar
   * 4. Dividir
   * 5. Salir

3. **Solicitar la opción** que desea realizar el usuario.

4. **Verificar la opción ingresada.**

   * Si la opción está entre 1 y 4, solicitar dos números: `a` y `b`.
   * Si la opción es 5, finalizar el programa.
   * Si la opción es diferente de 1 a 5, mostrar un mensaje indicando que la opción no es válida.

5. **Realizar la operación seleccionada.**

   * Si la opción es 1, sumar `a + b`.
   * Si la opción es 2, restar `a - b`.
   * Si la opción es 3, multiplicar `a * b`.
   * Si la opción es 4, dividir `a / b`.

6. **Validar la división.**

   * Si `b` es igual a 0, mostrar que no se puede dividir entre cero.
   * Si `b` es diferente de 0, realizar y mostrar la división.

7. **Mostrar el resultado** de la operación realizada.

8. **Si la opción es 5**, mostrar un mensaje de despedida.

9. **Repetir el menú** mientras la opción sea diferente de 5.

10. **Fin.**

---

## PSEUDOCÓDIGO

```text
Algoritmo CalculadoraMenu

    Definir opcion Como Entero
    Definir a, b Como Real

    // 1. Repetir el menu hasta seleccionar salir
    Repetir

        // 2. Mostrar menu
        MostrarMenu()

        Escribir "Elija una opcion: "
        Leer opcion

        // 3. Solicitar numeros para las operaciones
        Si opcion >= 1 Y opcion <= 4 Entonces

            Escribir "Ingrese el primer numero: "
            Leer a

            Escribir "Ingrese el segundo numero: "
            Leer b

        FinSi

        // 4. Realizar la operacion seleccionada
        Segun opcion Hacer

            1:
                Escribir "Resultado: ", a + b

            2:
                Escribir "Resultado: ", a - b

            3:
                Escribir "Resultado: ", a * b

            4:

                // 5. Validar division entre cero
                Si b = 0 Entonces
                    Escribir "No se puede dividir entre cero."

                SiNo
                    Escribir "Resultado: ", a / b
                FinSi

            5:
                Escribir "Gracias por usar la calculadora."

            De Otro Modo:
                Escribir "Opcion no valida."

        FinSegun

    Hasta Que opcion = 5

FinAlgoritmo


SubProceso MostrarMenu()

    Escribir "1. Sumar"
    Escribir "2. Restar"
    Escribir "3. Multiplicar"
    Escribir "4. Dividir"
    Escribir "5. Salir"

FinSubProceso
```
