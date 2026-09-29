## Ejercicio 6: Estadísticas de un curso

**Condiciones iniciales de prueba:**
* **N (Cantidad de estudiantes):** 3
* **Datos ingresados (Notas):** `8`, `12` (error intencional), `5`, `9`.

| Iteración (i) | Entrada (`nota`) | Validación (`0 <= nota <= 10`) | Acumulador (`suma`) | Cont. Aprobados (`aprobados`) | Cont. Reprobados (`reprobados`) | `mayor` | `menor` |
| :---: | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| **Inicio** | - | - | `0` | `0` | `0` | `-1` | `11` |
| **1** | 8 | ✅ Pasa (8 está en rango) | `0 + 8 = 8` | `0 + 1 = 1` | `0` | `8` | `8` |
| **2** | 12 | ❌ Falla (Pide reingreso) | `8` (Sin cambios) | `1` (Sin cambios)| `0` (Sin cambios)| `8` | `8` |
| **2** | 5 | ✅ Pasa (5 está en rango) | `8 + 5 = 13` | `1` | `0 + 1 = 1` | `8` | `5` |
| **3** | 9 | ✅ Pasa (9 está en rango) | `13 + 9 = 22` | `1 + 1 = 2` | `1` | `9` | `5` |

**Cálculos fuera del ciclo (Resultados Finales):**
* **Promedio:** `suma / N` -> `22 / 3` = **7.33**
* **% Aprobados:** `(aprobados * 100) / N` -> `(2 * 100) / 3` = **66.67%**
* **% Reprobados:** `(reprobados * 100) / N` -> `(1 * 100) / 3` = **33.33%**
