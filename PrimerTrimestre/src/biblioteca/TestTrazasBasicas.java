package biblioteca;

public class TestTrazasBasicas {
    public static void main(String[] args) {
        int[][] prueba = basicas.fillFromKeyboard(3, 3);
        int traza = basicas.trace(prueba);
        System.out.println("La traza es " + traza);
        boolean simetrica = basicas.esSimetrica(prueba);
        if (simetrica==true) {
            System.out.println("Es una matriz simetrica");
        }else{
            System.out.println("no es una matriz simetrica");
        }
        
    }

}
