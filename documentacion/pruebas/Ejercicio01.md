## Ejercicio 1. Promedio de calificaciones

Cantidad probada: `-2` (rechazada) y luego `3` (aceptada). Notas probadas: `0`, `11` (rechazada), `7` y `10`.

| Paso | Entrada | Decisión / proceso | i | suma | aprob. | reprob. | mayor | menor | Salida |
| :---: | :--- | :--- | :---: | :---: | :---: | :---: | :---: | :---: | :--- |
| 1 | n = -2 | n <= 0: verdadero, se repite | - | - | - | - | - | - | La cantidad debe ser mayor que cero. |
| 2 | n = 3 | n <= 0: falso, se inicializa | - | 0.00 | 0 | 0 | 0 | 0 | - |
| 3 | nota = 0 | Válida. 0 >= 7: falso, reprobado. i = 1: mayor = menor = 0 | 1 | 0.00 | 0 | 1 | 0 | 0 | - |
| 4 | nota = 11 | nota > 10: verdadero, se repite | 2 | 0.00 | 0 | 1 | 0 | 0 | La calificacion debe estar entre 0 y 10. |
| 5 | nota = 7 | Válida. 7 >= 7: verdadero, aprobado. 7 > mayor: mayor = 7 | 2 | 7.00 | 1 | 1 | 7 | 0 | - |
| 6 | nota = 10 | Válida. 10 >= 7: verdadero, aprobado. 10 > mayor: mayor = 10 | 3 | 17.00 | 2 | 1 | 10 | 0 | - |
| 7 | - | i > n: fin del ciclo. promedio = 17 / 3 | - | 17.00 | 2 | 1 | 10 | 0 | Promedio: 5.67, Mayor: 10, Menor: 0, Aprobados: 2, Reprobados: 1 |
