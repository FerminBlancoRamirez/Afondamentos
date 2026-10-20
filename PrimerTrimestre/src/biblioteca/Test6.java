package biblioteca;

public class Test6 {
    public static void main(String[] args) {
        int[][] array1=basicas.fillFromKeyboard(2, 3);
        int[][] array2= basicas.fillFromKeyboard(3, 2);

        System.out.println("Matriz 1: ");
        basicas.print2DArray(array1);

        System.out.println("Matriz 2: ");
        basicas.print2DArray(array2);

        int[][] multiplicar=basicas.multiplicar(array1, array2);
        System.out.println("Suma de las matrices");
        basicas.print2DArray(multiplicar);

    }

}
