# Ejercicio 10. Sistema integrado de ventas

## ALGORITMO

Inicio. Poner en cero el contador numVentas. Mostrar el menú y leer la opción elegida; si no está entre 1 y 3, avisar y volver a pedirla. Si la opción es 1, pedir el nombre del producto (si está vacío, avisar y volver a pedirlo), la cantidad (si es cero o negativa, avisar y volver a pedirla) y el precio unitario (si es cero o negativo, avisar y volver a pedirlo); luego sumar 1 a numVentas, guardar el producto, la cantidad, el precio y el subtotal en los arreglos y mostrar el subtotal. Si la opción es 2 y no hay ventas, indicar que no hay ventas registradas; si hay ventas, poner en cero unidades y total, tomar la primera venta como la mayor y recorrer todas las ventas sumando la cantidad a unidades y el subtotal a total, actualizando la venta mayor cuando un subtotal sea más alto; después calcular el promedio dividiendo total para numVentas y mostrar el número de ventas, las unidades vendidas, el total recaudado, la venta mayor y el promedio por venta. Si la opción es 3, despedirse. Mientras la opción sea distinta de 3, volver a mostrar el menú. Fin.

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
