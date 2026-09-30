# Ejercicio 7. Venta de entradas CineCampus

## ALGORITMO

**Paso 1:** Inicio del programa.

**Paso 2:** Inicializar el contador y los acumuladores en cero (`numVentas = 0`, `totalEntradas = 0`, `totalAcumulado = 0`).

**Paso 3:** Iniciar el registro de una venta.

- **Paso 3.1:** Incrementar el contador (`numVentas = numVentas + 1`).
- **Paso 3.2:** Solicitar y leer el `tipo` de entrada (`1` = General, `2` = Estudiante, `3` = VIP). Si no está entre `1` y `3`, avisar y volver a pedirlo.
- **Paso 3.3:** Solicitar y leer la `cantidad` de entradas. Si es `<= 0`, avisar y volver a pedirla.
- **Paso 3.4:** Solicitar y leer el `precio` por entrada. Si es `<= 0`, avisar y volver a pedirlo.
- **Paso 3.5:** Según el `tipo`, asignar el `nombre` (`General`, `Estudiante` o `VIP`).
- **Paso 3.6:** Calcular el subtotal (`subtotal = cantidad * precio`).
- **Paso 3.7:** Actualizar los acumuladores (`totalAcumulado = totalAcumulado + subtotal`, `totalEntradas = totalEntradas + cantidad`).
- **Paso 3.8:** Mostrar el `subtotal` de la venta y el `totalAcumulado`.

**Paso 4:** Preguntar si desea realizar otra venta y leer la `respuesta` (`S/N`).

- **Paso 4.1:** Si la `respuesta` no es `S` ni `N`, avisar y volver a preguntar.

**Paso 5:** Mientras `respuesta = 'S'`, volver al **Paso 3**.

**Paso 6:** Mostrar el resumen final: `numVentas`, `totalEntradas` y `totalAcumulado`.

**Paso 7:** Fin del programa.

## PSEUDOCODIGO

```
Algoritmo VentaEntradasCineCampus
    Definir tipo, cantidad, numVentas, totalEntradas Como Entero
    Definir precio, subtotal, totalAcumulado Como Real
    Definir respuesta, nombreTipo Como Caracter

    numVentas <- 0
    totalEntradas <- 0
    totalAcumulado <- 0

    Repetir
        numVentas <- numVentas + 1
        Escribir "--- Venta ", numVentas, " ---"

        // Validar tipo de entrada
        Repetir
            Escribir "Tipo de entrada (1=General, 2=Estudiante, 3=VIP): "
            Leer tipo
            Si tipo < 1 O tipo > 3 Entonces
                Escribir "Tipo invalido. Debe ser 1, 2 o 3."
            FinSi
        Hasta Que tipo >= 1 Y tipo <= 3

        // Validar cantidad
        Repetir
            Escribir "Cantidad de entradas: "
            Leer cantidad
            Si cantidad <= 0 Entonces
                Escribir "La cantidad debe ser mayor que cero."
            FinSi
        Hasta Que cantidad > 0

        // Validar precio
        Repetir
            Escribir "Precio por entrada: "
            Leer precio
            Si precio <= 0 Entonces
                Escribir "El precio debe ser mayor que cero."
            FinSi
        Hasta Que precio > 0

        Segun tipo Hacer
            1:
                nombreTipo <- "General"
            2:
                nombreTipo <- "Estudiante"
            3:
                nombreTipo <- "VIP"
        FinSegun

        subtotal <- cantidad * precio
        totalAcumulado <- totalAcumulado + subtotal
        totalEntradas <- totalEntradas + cantidad

        Escribir "Entrada ", nombreTipo, " | Subtotal: ", subtotal
        Escribir "Total acumulado: ", totalAcumulado

        // Validar respuesta
        Repetir
            Escribir "Desea realizar otra venta? (S/N): "
            Leer respuesta
            respuesta <- Mayusculas(respuesta)
            Si respuesta <> "S" Y respuesta <> "N" Entonces
                Escribir "Respuesta invalida. Escriba S o N."
            FinSi
        Hasta Que respuesta = "S" O respuesta = "N"
    Hasta Que respuesta = "N"

    Escribir "Numero de ventas: ", numVentas
    Escribir "Entradas vendidas: ", totalEntradas
    Escribir "Total recaudado: ", totalAcumulado
FinAlgoritmo
```
