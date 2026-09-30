## ALGORITMO

Inicio.

Pedir el saldo inicial. 

Si es negativo, avisar y volver a pedirlo hasta que sea cero o mayor.

Poner en cero los acumuladores totalDepositado y totalRetirado, y el contador de transacciones.
Mostrar el menú y leer la opción elegida.
Si la opción es 1, mostrar el saldo actual.
Si la opción es 2, pedir el monto. Si es cero o negativo, avisar; si no, sumarlo al saldo y a totalDepositado, y sumar 1 a las transacciones.
Si la opción es 3, pedir el monto. Si es cero o negativo, avisar. Si es mayor que el saldo, indicar fondos insuficientes. Si no, restarlo del saldo, sumarlo a totalRetirado y sumar 1 a las transacciones.
Si la opción es 4, mostrar el número de transacciones.
Si la opción es 5, mostrar el resumen de la sesión y despedirse.
Si es cualquier otro valor, avisar que la opción no es válida.
Mientras la opción sea distinta de 5, volver al paso 4.
Fin.

## PSEUDOCODIGO


    Algoritmo CajeroUniversitario
    Definir saldo, monto, totalDep, totalRet Como Real
    Definir opcion, transacciones Como Entero

    // Validar saldo inicial
    Repetir
        Escribir "Ingrese el saldo inicial: "
        Leer saldo
        Si saldo < 0 Entonces
            Escribir "El saldo inicial no puede ser negativo."
        FinSi
    Hasta Que saldo >= 0
 
    totalDep <- 0
    totalRet <- 0
    transacciones <- 0
 
    Repetir
        MostrarMenu()
        Escribir "Elija una opcion: "
        Leer opcion
 
        Segun opcion Hacer
            1:
                Escribir "Saldo actual: ", saldo
            2:
                Escribir "Monto a depositar: "
                Leer monto
                Si monto <= 0 Entonces
                    Escribir "El deposito debe ser mayor que cero."
                SiNo
                    saldo <- saldo + monto
                    totalDep <- totalDep + monto
                    transacciones <- transacciones + 1
                    Escribir "Deposito exitoso. Nuevo saldo: ", saldo
                FinSi
            3:
                Escribir "Monto a retirar: "
                Leer monto
                Si monto <= 0 Entonces
                    Escribir "El retiro debe ser mayor que cero."
                SiNo
                    Si monto > saldo Entonces
                        Escribir "Fondos insuficientes."
                    SiNo
                        saldo <- saldo - monto
                        totalRet <- totalRet + monto
                        transacciones <- transacciones + 1
                        Escribir "Retiro exitoso. Nuevo saldo: ", saldo
                    FinSi
                FinSi
            4:
                Escribir "Transacciones realizadas: ", transacciones
            5:
                Escribir "Total depositado: ", totalDep
                Escribir "Total retirado: ", totalRet
                Escribir "Saldo final: ", saldo
            De Otro Modo:
                Escribir "Opcion no valida."
        FinSegun
    Hasta Que opcion = 5
    
FinAlgoritmo
 
SubProceso MostrarMenu()

    Escribir "1. Consultar saldo"
    Escribir "2. Depositar"
    Escribir "3. Retirar"
    Escribir "4. Ver numero de transacciones"
    Escribir "5. Salir"
FinSubProceso
