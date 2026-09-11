package biblioteca;

public class basicas {
    public static int [][] fillFromKeyboard(int rows, int cols){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int [][] array = new int[rows][cols];
        System.out.println("Añade "+(rows*cols)+" numeros: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    //funcion que imprime matriz de enteros
    public static void print2DArray (int[][] array){
        for(int[] row : array){
            for(int elem : row){
                System.out.println(elem + " ");
            }
            System.out.println();
        }
    }

}
