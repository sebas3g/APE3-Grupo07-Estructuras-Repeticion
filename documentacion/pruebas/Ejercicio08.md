# Pruebas de escritorio

## Ejercicio 8. Estacionamiento universitario

Se registraron cuatro vehículos, uno de cada tipo, incluyendo una opción inválida, una hora inválida y una opción fuera de rango antes de finalizar con el centinela (0).

| Paso | Opción | Horas | Tarifa | Valor | Recaudación | Vehículos | Salida |
|---|---|---|---|---|---|---|---|
| Inicio | - | - | - | - | 0.00 | 0 | - |
| 1 | 2 | 3 | 1.00 | 3.00 | 3.00 | 1 | Automovil \| 3 h x $1.00 = $3.00 |
| 2 | 1 | 5 | 0.50 | 2.50 | 5.50 | 2 | Motocicleta \| 5 h x $0.50 = $2.50 |
| 3 | 5 | - | - | - | 5.50 | 2 | Opcion no valida. Elija 1, 2, 3, 4 o 0 para terminar. |
| 4a | 3 | 0 | 1.50 | - | 5.50 | 2 | Las horas deben estar entre 1 y 24. |
| 4b | 3 | 4 | 1.50 | 6.00 | 11.50 | 3 | Camioneta \| 4 h x $1.50 = $6.00 |
| 5 | 4 | 2 | 2.50 | 5.00 | 16.50 | 4 | Camion / Bus \| 2 h x $2.50 = $5.00 |
| 6 | 7 | - | - | - | 16.50 | 4 | Opcion no valida. Elija 1, 2, 3, 4 o 0 para terminar. |
| 7 | 0 | - | - | - | 16.50 | 4 | Centinela: sale del ciclo. Reporte: 1 moto, 1 auto, 1 camioneta, 1 camion/bus; 4 vehiculos; recaudacion $16.50 |
