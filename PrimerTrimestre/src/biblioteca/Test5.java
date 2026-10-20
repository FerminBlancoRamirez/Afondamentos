package biblioteca;
public class Test5 {

    /**
     * Pedir dos arrays de enteros y devolver un array de enteros con la suma de ambos 
     * arrays y con la rsta de dos arrays enteros
     */

    public static void main(String[] args) {
        int[][] array1=basicas.fillFromKeyboard(2, 2);
        int[][] array2= basicas.fillFromKeyboard(2, 2);

        System.out.println("Matriz 1: ");
        basicas.print2DArray(array1);

        System.out.println("Matriz 2: ");
        basicas.print2DArray(array2);

        int[][] suma=basicas.sum(array1, array2);
        System.out.println("Suma de las matrices");
        basicas.print2DArray(suma);

        int[][] resta=basicas.resta(array1, array2);
        System.out.println("Resta de las matrices");
        basicas.print2DArray(resta);
    }

}
