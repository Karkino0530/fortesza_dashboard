package ExecutionScript.Utilidades;

import java.io.IOException;
import java.util.Random;

public class generar_nombre {

    public static String nombre_usuario() throws IOException {

        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;

        String nombre_usuario = ReadProperties.getPropertyData("dataUsers","name" + randomInt + ".user");

        return nombre_usuario;

    }

}
