## Ejercicio 2. Control de edades con centinela

Edades probadas: `15`, `30`, `70`, `150` (no válida), `65` y el centinela `-1`.

| Paso | Entrada | Decisión / proceso | menores | adultos | mayores65 | cantidad | sumaEdades | Salida |
| :---: | :--- | :--- | :---: | :---: | :---: | :---: | :---: | :--- |
| 1 | - | Inicio: contadores y acumulador en 0 | 0 | 0 | 0 | 0 | 0 | - |
| 2 | edad = 15 | edad <> -1: verdadero. Válida. 15 < 18: menor | 1 | 0 | 0 | 1 | 15 | - |
| 3 | edad = 30 | Válida. 30 <= 65: adulto | 1 | 1 | 0 | 2 | 45 | - |
| 4 | edad = 70 | Válida. 70 > 65: mayor de 65 | 1 | 1 | 1 | 3 | 115 | - |
| 5 | edad = 150 | edad > 120: verdadero, no se cuenta | 1 | 1 | 1 | 3 | 115 | Edad no valida. Debe estar entre 0 y 120. |
| 6 | edad = 65 | Válida. 65 <= 65: adulto | 1 | 2 | 1 | 4 | 180 | - |
| 7 | edad = -1 | edad <> -1: falso, sale del ciclo. promedio = 180 / 4 | 1 | 2 | 1 | 4 | 180 | Menores: 1, Adultos: 2, Mayores de 65: 1, Promedio: 45.00 |
