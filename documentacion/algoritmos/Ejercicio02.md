# Ejercicio 2. Control de edades con centinela

## ALGORITMO

1. **Inicio.**

2. **Inicializar las variables.**

   * `menores = 0`
   * `adultos = 0`
   * `mayores65 = 0`
   * `cantidad = 0`
   * `sumaEdades = 0`

3. **Solicitar una edad** al usuario, indicando que `-1` se utilizará para terminar el ingreso.

4. **Verificar la edad ingresada.**

   * Si la edad es diferente de `-1`, continuar con el proceso.
   * Si la edad es `-1`, finalizar el ingreso de datos.

5. **Validar la edad.**

   * Si la edad es menor que 0 o mayor que 120, mostrar un mensaje indicando que la edad no es válida.
   * Si la edad está entre 0 y 120, continuar con el proceso.

6. **Acumular la edad válida.**

   * Sumar la edad a `sumaEdades`.
   * Aumentar `cantidad` en 1.

7. **Clasificar la edad.**

   * Si es menor que 18, aumentar `menores` en 1.
   * Si está entre 18 y 65, aumentar `adultos` en 1.
   * Si es mayor que 65, aumentar `mayores65` en 1.

8. **Solicitar una nueva edad** y repetir el proceso hasta que el usuario ingrese `-1`.

9. **Verificar si se ingresaron edades.**

   * Si `cantidad` es igual a 0, mostrar que no se ingresaron edades.
   * Si `cantidad` es mayor que 0, continuar con el cálculo.

10. **Calcular el promedio de edades** dividiendo `sumaEdades` para `cantidad`.

11. **Mostrar los resultados:**

    * Cantidad de menores de edad.
    * Cantidad de adultos.
    * Cantidad de mayores de 65 años.
    * Promedio de edades.

12. **Fin.**

---

## PSEUDOCÓDIGO

```text
Algoritmo ControlEdades

    Definir edad, menores, adultos, mayores65, cantidad, sumaEdades Como Entero
    Definir promedio Como Real

    // 1. Inicializar variables
    menores <- 0
    adultos <- 0
    mayores65 <- 0
    cantidad <- 0
    sumaEdades <- 0

    // 2. Solicitar la primera edad
    Escribir "Ingrese una edad (-1 para terminar): "
    Leer edad

    // 3. Repetir mientras no se ingrese -1
    Mientras edad <> -1 Hacer

        // 4. Validar la edad
        Si edad < 0 O edad > 120 Entonces
            Escribir "Edad no valida. Debe estar entre 0 y 120."

        SiNo

            // 5. Acumular edad valida
            sumaEdades <- sumaEdades + edad
            cantidad <- cantidad + 1

            // 6. Clasificar la edad
            Si edad < 18 Entonces
                menores <- menores + 1

            SiNo

                Si edad <= 65 Entonces
                    adultos <- adultos + 1

                SiNo
                    mayores65 <- mayores65 + 1
                FinSi

            FinSi

        FinSi

        // 7. Solicitar siguiente edad
        Escribir "Ingrese una edad (-1 para terminar): "
        Leer edad

    FinMientras

    // 8. Verificar si se ingresaron edades
    Si cantidad = 0 Entonces
        Escribir "No se ingresaron edades."

    SiNo

        // 9. Calcular promedio
        promedio <- sumaEdades / cantidad

        // 10. Mostrar resultados
        Escribir "Menores de edad: ", menores
        Escribir "Adultos (18 a 65): ", adultos
        Escribir "Mayores de 65: ", mayores65
        Escribir "Promedio de edades: ", promedio

    FinSi

FinAlgoritmo
```
