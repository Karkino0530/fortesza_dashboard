package ExecutionScript.Utilidades;

import java.util.Random;

import static ExecutionScript.Utilidades.CadenaAleatoria.NumerosAleatorios;

public class generar_num_identidad {

    public static String num_cedula(){

        Random r = new Random();
        int prefijo = r.nextInt(13) + 1;

        String numero_identidad =  prefijo + "-" + NumerosAleatorios(4) + "-" + NumerosAleatorios(4);

        return numero_identidad;

    }

}
