package ExecutionScript.StepDefinition;

import ExecutionScript.Utilidades.ReadProperties;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    WebDriver driver;

    Properties pro;
    static Properties proData;

    static final String CURRENTDIR = System.getProperty("user.dir");



    public void DefineProperty() throws IOException {

        String filepath = CURRENTDIR + "/src/test/Resources/properties/Configuation.properties";
        FileInputStream fs = new FileInputStream(new File(filepath));

        pro = new Properties();
        pro.load(fs);

        //Levanto browser
       System.setProperty("webdriver.chrome.driver", CURRENTDIR + pro.getProperty("Driver"));

    }

    public void ShowChromeON() throws IOException {
        DefineProperty();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void ShowChromeOFF() throws IOException {

        DefineProperty();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200,600");
        driver = new ChromeDriver(options);
    }

    public DriverManager()  {
        try {
            // Buscando archivos de configuracion
            String filepath = CURRENTDIR + "/src/test/Resources/properties/Configuation.properties";
            FileInputStream fs = new FileInputStream(new File(filepath));

            pro = new Properties();
            pro.load(fs);

            String Datafilepath = CURRENTDIR + "/src/test/Resources/properties/dataUsers.properties"; // Path of .properties file
            File dataPath = new File(Datafilepath);
            FileInputStream df = new FileInputStream(dataPath);

            proData = new Properties();
            proData.load(df);

            //Levanta browser ambiente
            ShowChromeON();

            int timeout = Integer.parseInt(ReadProperties.getPropertyData("Configuation", "chrome.driver.timeout"));
            driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);

        }
        catch (Throwable e)
        {
            System.out.println("No pude abrir el navegador, favor revisar");
            System.out.println(e.getMessage());
        }

        //validarEviencias();
        System.out.println("[INFO]-Chrome abierto");

        //Ingresa url
        //driver.get(pro.getProperty("urlfortesza"));

    }

    public WebDriver getDriver() {
        return driver;
    }

    public static String getPropertyData(String key) {
        String keyData = proData.getProperty(key);
        return keyData;
    }

    @Before
    public static void log() throws Throwable
    {
        PropertyConfigurator.configure(CURRENTDIR + "/src/main/resources/log4j.properties");
    }


}
