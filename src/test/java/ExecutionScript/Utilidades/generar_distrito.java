package ExecutionScript.Utilidades;

import java.io.IOException;
import java.util.Random;

public class generar_distrito {

    public static String distrito() throws IOException {

        Random r = new Random();
        int randomInt = r.nextInt(20) + 1;

        String nombre_distrito = ReadProperties.getPropertyData("dataUsers","ciudad" + randomInt + ".name");

        return nombre_distrito;

    }

}
