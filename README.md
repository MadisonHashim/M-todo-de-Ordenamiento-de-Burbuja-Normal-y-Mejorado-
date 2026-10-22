# Ordenamiento Burbuja en Java

## Descripción
Este proyecto consiste en la implementación de dos métodos de ordenamiento en Java: el método burbuja normal y el método burbuja mejorado. El objetivo es ordenar los elementos de un arreglo de números enteros de menor a mayor y comprobar su funcionamiento con diferentes pruebas.

## Objetivos
- Implementar el algoritmo de burbuja normal.
- Implementar el algoritmo de burbuja mejorado.
- Comparar el funcionamiento de ambos métodos.
- Probar los algoritmos con arreglos desordenados, parcialmente ordenados y completamente ordenados.

## Métodos de ordenamiento

### 1. Burbuja normal
Compara los elementos que están juntos y los intercambia cuando están en el orden incorrecto. Repite el proceso hasta completar las pasadas necesarias para ordenar el arreglo.

### 2. Burbuja mejorado
Funciona de manera similar al método burbuja normal, pero incorpora una mejora para detectar cuando el arreglo ya está ordenado. Si durante una pasada no se realizan intercambios, el algoritmo termina antes, evitando comparaciones innecesarias.

## Pruebas realizadas

### Prueba 1: Burbuja normal

**Arreglo inicial:**
[5, 2, 9, 1, 3]

**Arreglo ordenado:**
[1, 2, 3, 5, 9]

### Prueba 2: Burbuja mejorado

**Arreglo inicial:**
[5, 2, 9, 1, 3]

**Arreglo ordenado:**
[1, 2, 3, 5, 9]

### Prueba 3: Arreglo parcialmente ordenado

**Arreglo inicial:**
[1, 2, 4, 3, 5]

**Arreglo ordenado:**
[1, 2, 3, 4, 5]

### Prueba 4: Arreglo completamente ordenado

**Arreglo inicial:**
[1, 2, 3, 4, 5]

**Arreglo final:**
[1, 2, 3, 4, 5]

## Resultados
Los dos algoritmos lograron ordenar correctamente los arreglos de prueba. El método burbuja mejorado puede terminar antes cuando detecta que no hubo intercambios durante una pasada,
por lo que resulta más eficiente en ciertos casos.

## Conclusión
Con esta práctica aprendí cómo funcionan los algoritmos de ordenamiento burbuja normal y mejorado.
También comprobé sus resultados utilizando diferentes arreglos y entendí que la versión mejorada permite evitar trabajo innecesario cuando los datos ya están ordenados.
