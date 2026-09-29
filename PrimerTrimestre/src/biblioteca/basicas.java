package biblioteca;

import java.util.Scanner;

public class basicas {
    //metodo que se usa para llenar matriz
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
        sc.close();
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
        int cols=array[0].length;
        int[][] transpuesta=new int[cols][rows];
        for (int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpuesta[j][i]=array[i][j];
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

        // 2. Comprobar la simetría (solo recorremos los elementos por encima de la diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i][j] != array[j][i]) {
                    return false; // Al encontrar la primera diferencia, sabemos que no es simétrica
                }
            }
        }

        return true; // Pasó todas las comprobaciones correctamente
    }

}
