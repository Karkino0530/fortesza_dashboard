package ExecutionScript.Utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    static final String CURRENTDIR = System.getProperty("user.dir");
    static Properties pro;

    public static void Propeties(String fileProperties) throws IOException {
        // Buscando archivos de configuracion
        try {
            String filepath = CURRENTDIR + "/src/test/Resources/properties/"+fileProperties+".properties";

            File dataPath = new File(filepath);
            FileInputStream df = new FileInputStream(dataPath);

            pro = new Properties();
            pro.load(df);
        }
        catch (Throwable e)
            {
                System.out.println(e.getMessage());

            }
    }

    public static String getPropertyData(String fileProperties, String key) throws IOException {
        Propeties(fileProperties);
        String keyData = pro.getProperty(key);
        return keyData;
    }
}
