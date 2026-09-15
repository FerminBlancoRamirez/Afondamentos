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

    

}
