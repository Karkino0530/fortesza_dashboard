package ExecutionScript.Utilidades;

import java.util.Random;

import static ExecutionScript.Utilidades.CadenaAleatoria.NumerosAleatorios;

public class generar_num_celular {

    public static String num_celular(){

        String celular =  "6" + NumerosAleatorios(3) + "-" + NumerosAleatorios(4);

        return celular;

    }

}
