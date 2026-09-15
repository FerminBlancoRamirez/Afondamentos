package biblioteca;

public class basicasTest {
    public static void main(String[] args) {

    //basicas.print2DArray(basicas.fillFromKeyboard(2, 3));
    
    //Primero llenamos el array despues lo trasponemos y despues lo mostramos
    basicas.print2DArray(basicas.transpuesta(basicas.fillFromKeyboard(2, 3)));

    }
}
