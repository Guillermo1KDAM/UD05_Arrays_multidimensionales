### Ejercicio 1 
1. gradeTable [0][0] = 99
2. gradeTable [1][1] = 91
3. gradeTable [3][4] = 93
4. gradeTable [5][2] = 92
#### Apartados ejercicio 1
a. gradeTable [5][3] = 0

b. int [ ][ ] gradeTable = new int[7][5];

c.

i. Devuelve 94

ii. Guarda el valor 40 en la variable value

iii. Da error porque esa posición no existe

iv. Da error porque esa posición no existe

v.Da error

### Ejercicio 2
El valor sería 4

### Ejercicio 3
El primero print seria un 4

El segundo print seria un 2

El tercero print sale fuera de la matriz por lo que da error

Luego cambia el valor 4 y le da el valor 97 a la posicion [2][4]

La siguiente linea da error porque no existe esa posición

la siguiente linea asigna un valor de la matriz a la variable val

Y la última linea da error porque esa posicion no existe

#### Apartados Ejercicio 3:
a. 

matriz[0][2] = 9

matriz[1][1] = 2

matriz[2][5] = 4

matriz[3][0] = Esta fuera del rango

b. 

Seria tres porque indica la cantidad de filas

c.

La primero fila sería 3

La segunda fila sería 2

La tercera fila sería 5

Se puede averiguar con el .lenght()

d. 

Si que se podría matriz[0] = {0, 1, 2, 3}

e.
```agsl
for(int i = 0; i < m.length; i++){
    	for(int j = 0; j < m[i].length; j++){
    		System.out.print(m[i][j] + " ");    // Imprime elemento
    	}
    	System.out.println();	// Imprime salto de línea
    }
```
### Ejercicio 4

int[][] int2d = new int[5][10]

### Ejercicio 5

```agsl
public int [][] multiplicarPor2(int array[][]){
int[][] matrizMultiplicada = new int[][]
for (int i=0;i<array.length;i++){//total filas
for(int j=0;j<array[0].length;j++){//total columnas
matrizMultiplicada = + matrizMultiplicada +(array[i][j])*2);
}
}
return matrizMultiplicada;
}
```

### Ejercicio 6

```agsl
public void imprimirMatriz(int array[][]){
for (int i=0;i<array.length;i++){//total filas
for(int j=0;j<array[0].length;j++){//total columnas
if (array[i][0] == null){
System.out.println("Fila vacia");
}
else{
System.out.print(array[i][j])
}
}
}
}
```