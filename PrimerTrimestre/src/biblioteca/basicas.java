package biblioteca;

import java.util.Scanner;

public class basicas {
    // metodo que se usa para llenar matriz
    public static int[][] fillFromKeyboard(int rows, int cols) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] array = new int[rows][cols];
        System.out.println("Añade " + (rows * cols) + " numeros: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        //sc.close();
        return array;
    }

    // funcion que imprime matriz de enteros
    public static void print2DArray(int[][] array) {
        for (int[] rows : array) {
            for (int elem : rows) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    // funcion que traspone una matriz de enteros
    public static int[][] transpuesta(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] transpuesta = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpuesta[j][i] = array[i][j];
            }
        }
        return transpuesta;
    }

    public static int trace(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows != cols) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular la traza");
        }

        int trace = 0;
        for (int i = 0; i < rows; i++) {
            trace += array[i][i];
        }
        return trace;
    }

    public static boolean esSimetrica(int[][] array) {
        // Validar si la matriz no es nula ni está vacía
        if (array == null || array.length == 0) {
            return false;
        }

        int n = array.length;

        // 1. Comprobar si es cuadrada
        for (int i = 0; i < n; i++) {
            if (array[i] == null || array[i].length != n) {
                return false; // Si alguna fila no coincide con 'n', no es cuadrada
            }
        }

        // 2. Comprobar la simetría (solo recorremos los elementos por encima de la
        // diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i][j] != array[j][i]) {
                    return false; // Al encontrar la primera diferencia, sabemos que no es simétrica
                }
            }
        }

        return true; // Pasó todas las comprobaciones correctamente
    }

    // metodo que calcule la matriz SUMA de dos matrices enteros
    public static int[][] sum(int[][] array1, int[][] array2) {
        // Validar que ninguna de las matrices sea nula
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Las matrices no pueden ser nulas.");
        }

        // Validar que tengan el mismo número de filas
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones.");
        }

        int filas = array1.length;
        int columnas = array1[0].length;

        // Crear la matriz resultado con el mismo tamaño
        int[][] resultado = new int[filas][columnas];

        // Sumar elemento por elemento
        for (int i = 0; i < filas; i++) {
            // Validar que cada fila tenga la misma cantidad de columnas
            if (array1[i].length != columnas || array2[i].length != columnas) {
                throw new IllegalArgumentException("Las matrices deben ser rectangulares y de iguales dimensiones.");
            }
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = array1[i][j] + array2[i][j];
            }
        }

        return resultado;
    }

    // metodo que calcule la matriz RESTA de dos matrices enteros
    public static int[][] resta(int[][] array1, int[][] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Las matrices no pueden ser nulas.");
        }

        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo número de filas.");
        }

        int filas = array1.length;
        int columnas = array1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            if (array1[i].length != columnas || array2[i].length != columnas) {
                throw new IllegalArgumentException(
                        "Las matrices deben tener dimensiones coincidentes en todas sus filas.");
            }
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = array1[i][j] - array2[i][j];
            }
        }

        return resultado;
    }

    //Metodo que multiplique dos matrices de enteros
    //Solo producto si el numero de cols de la primera es el numero de rows de la segunda
    // y el resultado es un array de mismas rows de la primera y cols de la segunda

    public static int[][] multiplicar(int [][] array1, int[][]array2){
        if (array1 == null || array2 == null || array1.length == 0 || array2.length == 0) {
            throw new IllegalArgumentException("Las matrices no pueden ser nulas o estar vacías.");
        }

        int filas1 = array1.length;
        int columnas1 = array1[0].length;
        int filas2 = array2.length;
        int columnas2 = array2[0].length;

        if (columnas1 != filas2) {
            throw new IllegalArgumentException(
                "No se pueden multiplicar: el número de columnas de la primera matriz (" 
                + columnas1 + ") debe ser igual al número de filas de la segunda (" + filas2 + ")."
            );
        }

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        return resultado;
    }
}
