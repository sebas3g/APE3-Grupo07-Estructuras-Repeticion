## Ejercicio 4. Tabla de multiplicar validada

Números probados: `0` y `15` (rechazados) y luego `7` (aceptado).

| Paso | Entrada | Decisión / proceso | numero | i | resultado | Salida |
| :---: | :--- | :--- | :---: | :---: | :---: | :--- |
| 1 | numero = 0 | numero < 1: verdadero, se repite | 0 | - | - | Numero incorrecto. Debe estar entre 1 y 12. |
| 2 | numero = 15 | numero > 12: verdadero, se repite | 15 | - | - | Numero incorrecto. Debe estar entre 1 y 12. |
| 3 | numero = 7 | Fuera de rango: falso, sale de la validación | 7 | - | - | TABLA DEL 7 |
| 4 | - | i <= 12: verdadero | 7 | 1 | 7 | 7 x 1 = 7 |
| 5 | - | i <= 12: verdadero | 7 | 2 | 14 | 7 x 2 = 14 |
| 6 | - | i <= 12: verdadero | 7 | 3 | 21 | 7 x 3 = 21 |
| 7 | - | i <= 12: verdadero | 7 | 4 | 28 | 7 x 4 = 28 |
| 8 | - | i <= 12: verdadero | 7 | 5 | 35 | 7 x 5 = 35 |
| 9 | - | i <= 12: verdadero | 7 | 6 | 42 | 7 x 6 = 42 |
| 10 | - | i <= 12: verdadero | 7 | 7 | 49 | 7 x 7 = 49 |
| 11 | - | i <= 12: verdadero | 7 | 8 | 56 | 7 x 8 = 56 |
| 12 | - | i <= 12: verdadero | 7 | 9 | 63 | 7 x 9 = 63 |
| 13 | - | i <= 12: verdadero | 7 | 10 | 70 | 7 x 10 = 70 |
| 14 | - | i <= 12: verdadero | 7 | 11 | 77 | 7 x 11 = 77 |
| 15 | - | i <= 12: verdadero | 7 | 12 | 84 | 7 x 12 = 84 |
| 16 | - | i = 13, i <= 12: falso, fin del ciclo | 7 | 13 | - | - |

