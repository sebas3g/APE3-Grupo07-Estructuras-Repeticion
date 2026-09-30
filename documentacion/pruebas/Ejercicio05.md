# Pruebas de escritorio

## Ejercicio 5. Cajero universitario

Saldo inicial probado: `-50` (rechazado) y luego `100` (aceptado).

| Paso | Entrada | Decisión / proceso | saldo | totalDep | totalRet | trans. | Salida |
|---|---|---|---|---|---|---|---|
| 1 | saldo = -50 | saldo < 0: verdadero, se repite | - | - | - | - | El saldo inicial no puede ser negativo. |
| 2 | saldo = 100 | saldo < 0: falso, se inicializa | 100.00 | 0.00 | 0.00 | 0 | - |
| 3 | opción 1 | Consulta de saldo | 100.00 | 0.00 | 0.00 | 0 | Saldo actual: $100.00 |
| 4 | opción 2, monto 50 | 50 > 0: se deposita | 150.00 | 50.00 | 0.00 | 1 | Deposito exitoso. Nuevo saldo: $150.00 |
| 5 | opción 3, monto 200 | 200 > 150: retiro rechazado | 150.00 | 50.00 | 0.00 | 1 | Fondos insuficientes para ese retiro. |
| 6 | opción 3, monto 30 | 30 <= 150: se retira | 120.00 | 50.00 | 30.00 | 2 | Retiro exitoso. Nuevo saldo: $120.00 |
| 7 | opción 2, monto -5 | -5 <= 0: depósito rechazado | 120.00 | 50.00 | 30.00 | 2 | El deposito debe ser mayor que cero. |
| 8 | opción 4 | Consulta del contador | 120.00 | 50.00 | 30.00 | 2 | Transacciones realizadas: 2 |
| 9 | opción 9 | Opción fuera de rango | 120.00 | 50.00 | 30.00 | 2 | Opcion no valida. Elija un numero del 1 al 5. |
| 10 | opción 1 | Consulta de saldo | 120.00 | 50.00 | 30.00 | 2 | Saldo actual: $120.00 |
| 11 | opción 5 | opción = 5: termina el ciclo | 120.00 | 50.00 | 30.00 | 2 | Resumen: depositado $50.00, retirado $30.00, saldo final $120.00 |
