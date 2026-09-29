## Ejercicio 9: Matriz lógica de asistencia

**Condiciones iniciales de prueba:**
* **Estudiantes (N):** 2
* **Días (D):** 2
* **Datos E1:** Día 1=`P`, Día 2=`X` (error intencional), Día 2=`A`
* **Datos E2:** Día 1=`P`, Día 2=`P`

| Ciclo Ext. (`i`) | Ciclo Int. (`j`) | Entrada (`estado`) | Validación (`P` o `A`) | `estP` (Indiv.) | `estA` (Indiv.) | `totalP` (Global) | `totalA` (Global) |
| :---: | :---: | :---: | :--- | :---: | :---: | :---: | :---: |
| **Inicio Prog.** | - | - | - | - | - | `0` | `0` |
| **1** *(Inicia E1)*| - | - | Reinicio contadores E1 | `0` | `0` | `0` | `0` |
| 1 | **1** | P | ✅ Pasa | `0 + 1 = 1` | `0` | `0 + 1 = 1` | `0` |
| 1 | **2** | X | ❌ Falla (Pide reingreso) | `1` | `0` | `1` | `0` |
| 1 | **2** | A | ✅ Pasa | `1` | `0 + 1 = 1` | `1` | `0 + 1 = 1` |
| **Imprime E1** | - | - | *Asistencias: 1 \| Ausencias: 1* | - | - | - | - |
| **2** *(Inicia E2)*| - | - | Reinicio contadores E2 | `0` | `0` | `1` | `1` |
| 2 | **1** | P | ✅ Pasa | `0 + 1 = 1` | `0` | `1 + 1 = 2` | `1` |
| 2 | **2** | P | ✅ Pasa | `1 + 1 = 2` | `0` | `2 + 1 = 3` | `1` |
| **Imprime E2** | - | - | *Asistencias: 2 \| Ausencias: 0* | - | - | - | - |
| **Fin Prog.** | - | - | **Totales Generales** | - | - | **3** | **1** |
