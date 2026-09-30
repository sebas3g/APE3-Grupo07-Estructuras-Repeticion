## Ejercicio 3. Calculadora con menú repetitivo

Opciones probadas: las cuatro operaciones, una división entre cero, una opción inválida (`7`) y salir (`5`).

| Paso | Entrada | Decisión / proceso | opcion | a | b | Salida |
| :---: | :--- | :--- | :---: | :---: | :---: | :--- |
| 1 | opcion = 1, a = 8, b = 2 | Segun opcion: 1, sumar | 1 | 8 | 2 | Resultado: 10 |
| 2 | opcion = 4, a = 8, b = 0 | Segun opcion: 4. b = 0: verdadero | 4 | 8 | 0 | No se puede dividir entre cero. |
| 3 | opcion = 4, a = 9, b = 2 | Segun opcion: 4. b = 0: falso, dividir | 4 | 9 | 2 | Resultado: 4.5 |
| 4 | opcion = 7 | No está entre 1 y 4, no se piden números. De Otro Modo | 7 | 9 | 2 | Opcion no valida. |
| 5 | opcion = 2, a = 5, b = 9 | Segun opcion: 2, restar | 2 | 5 | 9 | Resultado: -4 |
| 6 | opcion = 3, a = 3, b = 4 | Segun opcion: 3, multiplicar | 3 | 3 | 4 | Resultado: 12 |
| 7 | opcion = 5 | Segun opcion: 5. opcion = 5: verdadero, sale del ciclo | 5 | 3 | 4 | Gracias por usar la calculadora. |
