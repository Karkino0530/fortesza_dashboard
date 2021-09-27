package ExecutionScript.Utilidades;

public class CadenaAleatoria {

    public static void main(String[] args) {
        System.out.println(NumeroAletariorMinMax(1,  2));
    }


    public static String NumerosAleatorios(int maximo) {
        int longitud = maximo;
        String[] caracteres = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String cadena = "";

        int max = caracteres.length - 1;

        for (int i = 0; i < longitud; i++) {
            cadena += caracteres[(int) Math.floor(Math.random() * (max + 1))];
        }

        return cadena;
    }

    public static int NumeroAletariorMinMax(int min, int max){
        int numero = (int)(Math.random()*max+min);

        int resultado = numero -1;

        return resultado;
    }

    public static String LetrasAleatoriosMinusculas (int maximo) {
        int longitud = maximo;
        String[] caracteres = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String cadena = "";

        int max = caracteres.length - 1;

        for (int i = 0; i < longitud; i++) {
            cadena += caracteres[(int) Math.floor(Math.random() * (max + 1))];
        }

        return cadena;
    }

    public static String LetrasAleatoriosMayusculas (int maximo) {
        int longitud = maximo;
        String[] caracteres = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String cadena = "";

        int max = caracteres.length - 1;

        for (int i = 0; i < longitud; i++) {
            cadena += caracteres[(int) Math.floor(Math.random() * (max + 1))];
        }

        return cadena;
    }

}
