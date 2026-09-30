## Ejercicio 10. Sistema integrado de ventas

Ventas probadas: Cuaderno 3 x 1.50, Esfero 10 x 0.40 y Mochila 1 x 25.00, con estadísticas sin ventas, una opción inválida (`4`) y una cantidad inválida (`0`).

| Paso | Entrada | Decisión / proceso | numVentas | subtotal | unidades | total | posMayor | Salida |
| :---: | :--- | :--- | :---: | :---: | :---: | :---: | :---: | :--- |
| 1 | opcion = 2 | numVentas = 0: verdadero | 0 | - | - | - | - | No hay ventas registradas. |
| 2 | opcion = 4 | opcion > 3: verdadero, se repite | 0 | - | - | - | - | Opcion no valida. Debe estar entre 1 y 3. |
| 3 | opcion = 1, Cuaderno, 3, 1.50 | Datos válidos. subtotal = 3 * 1.50, se guarda en la posición 1 | 1 | 4.50 | - | - | - | Venta registrada. Subtotal: 4.50 |
| 4 | opcion = 1, Esfero, cantidad = 0 | cantidad <= 0: verdadero, se repite | 1 | - | - | - | - | La cantidad debe ser mayor que cero. |
| 5 | cantidad = 10, precio = 0.40 | Datos válidos. subtotal = 10 * 0.40, se guarda en la posición 2 | 2 | 4.00 | - | - | - | Venta registrada. Subtotal: 4.00 |
| 6 | opcion = 1, Mochila, 1, 25.00 | Datos válidos. subtotal = 1 * 25.00, se guarda en la posición 3 | 3 | 25.00 | - | - | - | Venta registrada. Subtotal: 25.00 |
| 7 | opcion = 2 | numVentas = 0: falso. Se inicializa unidades = 0, total = 0, posMayor = 1 | 3 | - | 0 | 0.00 | 1 | - |
| 8 | - | i = 1: suma 3 unidades y 4.50. 4.50 > 4.50: falso | 3 | 4.50 | 3 | 4.50 | 1 | - |
| 9 | - | i = 2: suma 10 unidades y 4.00. 4.00 > 4.50: falso | 3 | 4.00 | 13 | 8.50 | 1 | - |
| 10 | - | i = 3: suma 1 unidad y 25.00. 25.00 > 4.50: verdadero, posMayor = 3 | 3 | 25.00 | 14 | 33.50 | 3 | - |
| 11 | - | Fin del ciclo. promedio = 33.50 / 3 | 3 | - | 14 | 33.50 | 3 | Numero de ventas: 3, Unidades vendidas: 14, Total recaudado: 33.50, Venta mayor: Mochila (25.00), Promedio por venta: 11.17 |
| 12 | opcion = 3 | opcion = 3: verdadero, sale del ciclo | 3 | - | 14 | 33.50 | 3 | Gracias por usar el sistema. |
