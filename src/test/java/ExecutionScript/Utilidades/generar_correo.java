package ExecutionScript.Utilidades;

import static ExecutionScript.Utilidades.CadenaAleatoria.NumerosAleatorios;

public class generar_correo {

    public static String corre_electronico(String nombre, String apellido){

        String correo = nombre.toLowerCase() + "_" + apellido.toLowerCase() + NumerosAleatorios(3) + "@gamil.com";

        return correo;

    }

}
