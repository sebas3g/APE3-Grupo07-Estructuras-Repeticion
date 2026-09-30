# Ejercicio 10. Sistema integrado de ventas

## ALGORITMO

**Paso 1:** Inicio del programa.

**Paso 2:** Inicializar el contador de ventas en cero (`numVentas = 0`).

**Paso 3:** Mostrar el menú de opciones y leer la `opcion` elegida.

- **Paso 3.1:** Si la `opcion` no está entre `1` y `3`, mostrar un aviso y volver a pedirla.

**Paso 4:** Si la `opcion` es `1` (Registrar venta):

- **Paso 4.1:** Solicitar y leer el nombre del `producto`. Si está vacío, avisar y volver a pedirlo.
- **Paso 4.2:** Solicitar y leer la `cantidad`. Si es `<= 0`, avisar y volver a pedirla.
- **Paso 4.3:** Solicitar y leer el `precio` unitario. Si es `<= 0`, avisar y volver a pedirlo.
- **Paso 4.4:** Incrementar el contador (`numVentas = numVentas + 1`).
- **Paso 4.5:** Calcular el subtotal (`subtotal = cantidad * precio`).
- **Paso 4.6:** Guardar `producto`, `cantidad`, `precio` y `subtotal` en los arreglos.
- **Paso 4.7:** Mostrar el `subtotal` de la venta.

**Paso 5:** Si la `opcion` es `2` (Mostrar estadísticas):

- **Paso 5.1:** Si `numVentas = 0`, mostrar "No hay ventas registradas".
- **Paso 5.2:** Si hay ventas, inicializar acumuladores en cero (`unidades = 0`, `total = 0`).
- **Paso 5.3:** Tomar la primera venta como la mayor (`mayor = subtotal[0]`).
- **Paso 5.4:** Recorrer todas las ventas desde `i = 0` hasta `numVentas - 1`:
  - Sumar la cantidad a las unidades (`unidades = unidades + cantidad[i]`).
  - Sumar el subtotal al total (`total = total + subtotal[i]`).
  - Si `subtotal[i] > mayor`, actualizar `mayor = subtotal[i]`.
- **Paso 5.5:** Calcular el promedio (`promedio = total / numVentas`).
- **Paso 5.6:** Mostrar `numVentas`, `unidades`, `total`, `mayor` y `promedio`.

**Paso 6:** Si la `opcion` es `3` (Salir), mostrar un mensaje de despedida.

**Paso 7:** Mientras `opcion != 3`, volver al **Paso 3**.

**Paso 8:** Fin del programa.

## PSEUDOCODIGO

```
Algoritmo SistemaIntegradoVentas
    Definir opcion, numVentas, c, i, unidades, posMayor Como Entero
    Definir pr, total, promedio Como Real
    Definir p Como Caracter
    Definir producto Como Caracter
    Definir cantidad Como Entero
    Definir precio, subtotal Como Real
    Dimension producto[100], cantidad[100], precio[100], subtotal[100]

    numVentas <- 0

    Repetir
        MostrarMenu()

        // Validar opcion del menu
        Repetir
            Escribir "Elija una opcion: "
            Leer opcion
            Si opcion < 1 O opcion > 3 Entonces
                Escribir "Opcion no valida. Debe estar entre 1 y 3."
            FinSi
        Hasta Que opcion >= 1 Y opcion <= 3

        Segun opcion Hacer
            1:
                // Registrar venta
                Repetir
                    Escribir "Producto: "
                    Leer p
                    Si p = "" Entonces
                        Escribir "El nombre del producto no puede estar vacio."
                    FinSi
                Hasta Que p <> ""

                Repetir
                    Escribir "Cantidad: "
                    Leer c
                    Si c <= 0 Entonces
                        Escribir "La cantidad debe ser mayor que cero."
                    FinSi
                Hasta Que c > 0

                Repetir
                    Escribir "Precio unitario: "
                    Leer pr
                    Si pr <= 0 Entonces
                        Escribir "El precio debe ser mayor que cero."
                    FinSi
                Hasta Que pr > 0

                numVentas <- numVentas + 1
                producto[numVentas] <- p
                cantidad[numVentas] <- c
                precio[numVentas] <- pr
                subtotal[numVentas] <- c * pr
                Escribir "Venta registrada. Subtotal: ", subtotal[numVentas]
            2:
                // Mostrar estadisticas
                Si numVentas = 0 Entonces
                    Escribir "No hay ventas registradas."
                SiNo
                    unidades <- 0
                    total <- 0
                    posMayor <- 1
                    Para i <- 1 Hasta numVentas Con Paso 1 Hacer
                        unidades <- unidades + cantidad[i]
                        total <- total + subtotal[i]
                        Si subtotal[i] > subtotal[posMayor] Entonces
                            posMayor <- i
                        FinSi
                    FinPara
                    promedio <- total / numVentas
                    Escribir "Numero de ventas: ", numVentas
                    Escribir "Unidades vendidas: ", unidades
                    Escribir "Total recaudado: ", total
                    Escribir "Venta mayor: ", producto[posMayor], " (", subtotal[posMayor], ")"
                    Escribir "Promedio por venta: ", promedio
                FinSi
            3:
                Escribir "Gracias por usar el sistema."
        FinSegun
    Hasta Que opcion = 3
FinAlgoritmo

SubProceso MostrarMenu()
    Escribir "1. Registrar venta"
    Escribir "2. Mostrar estadisticas"
    Escribir "3. Salir"
FinSubProceso
```
