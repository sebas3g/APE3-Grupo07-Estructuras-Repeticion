## ALGORITMO 

Inicio.

Poner en cero la recaudación total, el contador total de vehículos y los contadores por tipo. 

El centinela es 0.

Mostrar el menú y leer el tipo de vehículo.

Mientras la opción sea distinta de 0, repetir los pasos 5 a 10.

Si la opción no está entre 1 y 4, avisar que no es válida y pasar al paso 10.

Según la opción, asignar el nombre del tipo y su tarifa por hora.

Pedir el número de horas. 

Si es menor que 1 o mayor que 24, avisar y volver a pedirlo.

Calcular el valor individual: horas por tarifa.

Sumar el valor a la recaudación total, sumar 1 al total de vehículos y al contador de su tipo, y mostrar el detalle.

Mostrar el menú y leer la siguiente opción; volver al paso 4.

Cuando se ingrese 0, mostrar el reporte: cantidad por tipo, total de vehículos y recaudación total.

Fin.

## PSEUDOCODIGO

Algoritmo EstacionamientoUniversitario

    Definir opcion, horas, totalVehiculos, i Como Entero
    Definir tarifa, valor, recaudacionTotal Como Real
    Definir tipo Como Cadena
    Dimension cantidad[4]
 
    recaudacionTotal <- 0
    totalVehiculos <- 0
    Para i <- 1 Hasta 4 Hacer
        cantidad[i] <- 0
    FinPara
 
    // Lectura anticipada: primer dato antes del ciclo
    MostrarMenu()
    Escribir "Tipo de vehiculo (0 para terminar): "
    Leer opcion
 
    Mientras opcion <> 0 Hacer
        Si opcion >= 1 Y opcion <= 4 Entonces
            Segun opcion Hacer
                1:
                    tipo <- "Motocicleta"
                    tarifa <- 0.50
                2:
                    tipo <- "Automovil"
                    tarifa <- 1.00
                3:
                    tipo <- "Camioneta"
                    tarifa <- 1.50
                De Otro Modo:
                    tipo <- "Camion / Bus"
                    tarifa <- 2.50
            FinSegun
 
            Repetir
                Escribir "Numero de horas (1 a 24): "
                Leer horas
                Si horas < 1 O horas > 24 Entonces
                    Escribir "Las horas deben estar entre 1 y 24."
                FinSi
            Hasta Que horas >= 1 Y horas <= 24
 
            valor <- horas * tarifa
            recaudacionTotal <- recaudacionTotal + valor
            totalVehiculos <- totalVehiculos + 1
            cantidad[opcion] <- cantidad[opcion] + 1
            Escribir tipo, " | ", horas, " h x $", tarifa, " = $", valor
        SiNo
            Escribir "Opcion no valida."
        FinSi
 
        MostrarMenu()
        Escribir "Tipo de vehiculo (0 para terminar): "
        Leer opcion
    FinMientras
 
    Escribir "Motocicletas: ", cantidad[1]
    Escribir "Automoviles: ", cantidad[2]
    Escribir "Camionetas: ", cantidad[3]
    Escribir "Camiones/Bus: ", cantidad[4]
    Escribir "Vehiculos registrados: ", totalVehiculos
    Escribir "Recaudacion total: $", recaudacionTotal
FinAlgoritmo

SubProceso MostrarMenu()

    Escribir "1. Motocicleta   ($0.50 por hora)"
    Escribir "2. Automovil     ($1.00 por hora)"
    Escribir "3. Camioneta     ($1.50 por hora)"
    Escribir "4. Camion / Bus  ($2.50 por hora)"
    Escribir "0. Finalizar (centinela)"
FinSubProceso
