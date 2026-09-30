## Ejercicio 7. Venta de entradas CineCampus

Ventas probadas: General 2 x 5.00, Estudiante 3 x 3.50 y VIP 1 x 8.00, con un tipo inválido (`4`), una cantidad inválida (`0`) y una respuesta inválida (`X`).

| Paso | Entrada | Decisión / proceso | numVentas | subtotal | totalEntradas | totalAcumulado | Salida |
| :---: | :--- | :--- | :---: | :---: | :---: | :---: | :--- |
| 1 | - | Inicio: contador y acumuladores en 0 | 0 | - | 0 | 0.00 | - |
| 2 | tipo = 4 | Nueva venta. tipo > 3: verdadero, se repite | 1 | - | 0 | 0.00 | Tipo invalido. Debe ser 1, 2 o 3. |
| 3 | tipo = 1, cantidad = 2, precio = 5.00 | Datos válidos. nombreTipo = General. subtotal = 2 * 5.00 | 1 | 10.00 | 2 | 10.00 | Entrada General \| Subtotal: 10.00 |
| 4 | respuesta = S | respuesta = N: falso, se repite el ciclo | 1 | 10.00 | 2 | 10.00 | - |
| 5 | tipo = 2, cantidad = 0 | Nueva venta. cantidad <= 0: verdadero, se repite | 2 | - | 2 | 10.00 | La cantidad debe ser mayor que cero. |
| 6 | cantidad = 3, precio = 3.50 | Datos válidos. nombreTipo = Estudiante. subtotal = 3 * 3.50 | 2 | 10.50 | 5 | 20.50 | Entrada Estudiante \| Subtotal: 10.50 |
| 7 | respuesta = X | No es S ni N: se vuelve a preguntar | 2 | 10.50 | 5 | 20.50 | Respuesta invalida. Escriba S o N. |
| 8 | respuesta = S | respuesta = N: falso, se repite el ciclo | 2 | 10.50 | 5 | 20.50 | - |
| 9 | tipo = 3, cantidad = 1, precio = 8.00 | Nueva venta. Datos válidos. nombreTipo = VIP. subtotal = 1 * 8.00 | 3 | 8.00 | 6 | 28.50 | Entrada VIP \| Subtotal: 8.00 |
| 10 | respuesta = N | respuesta = N: verdadero, sale del ciclo | 3 | 8.00 | 6 | 28.50 | Numero de ventas: 3, Entradas vendidas: 6, Total recaudado: 28.50 |
