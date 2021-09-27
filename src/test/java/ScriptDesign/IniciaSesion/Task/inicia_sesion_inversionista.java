package ScriptDesign.IniciaSesion.Task;

import ExecutionScript.StepDefinition.DriverManager;
import ExecutionScript.WaitManager.WaitManager;
import ScriptDesign.IniciaSesion.PageObjects.IniciaSesionPageObject;
import ScriptDesign.Registro.PageObjects.RegistroPageObject;
import ScriptDesign.Registro.Task.registro_inversionista;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static ExecutionScript.Utilidades.generar_nombre.nombre_usuario;

public class inicia_sesion_inversionista {

    private static final Logger logger = LogManager.getLogger(inicia_sesion_inversionista.class);

    WebDriver driver;

    public inicia_sesion_inversionista(WebDriver driver)
    {
        this.driver = driver;
    }

    public void iniciasesioninverionista() throws Throwable
    {
        logger.info("[STEP]-INICIA SESION INVERSIONISTA");

       TimeUnit.SECONDS.sleep(3);

        WaitManager.WaitManageByid(this.driver, "[STEP]-INICIA SESION INVERSIONISTA-EMAIL USER", IniciaSesionPageObject.textoEmailUser(), 10);
        WaitManager.WaitManageByid(this.driver, "[STEP]-INICIA SESION INVERSIONISTA-PASSWORD", IniciaSesionPageObject.textoPassword(), 10);
        WaitManager.WaitManageByid(this.driver, "[STEP]-INICIA SESION INVERSIONISTA-SIGN-IN", IniciaSesionPageObject.botonSignIn(), 10);
    }

    public static void conIniciaSesion(WebDriver driver) throws Throwable {

        inicia_sesion_inversionista task = new inicia_sesion_inversionista(driver);
        task.iniciasesioninverionista();
        DriverManager.log();
    }

    public void ingresa_correo_usuario(String emailUser) throws Throwable
    {
        logger.info("[STEP]-INGRESAR EMAIL USUARIO");

        IniciaSesionPageObject.txtEmailUser(this.driver).sendKeys(emailUser);

        logger.info("[DATA]-Email usuario ingresado: " + IniciaSesionPageObject.txtEmailUser(this.driver).getAttribute("value"));

    }

    public static void conEmailUsuario(WebDriver driver, String emailUser) throws Throwable {

        inicia_sesion_inversionista task = new inicia_sesion_inversionista(driver);
        task.ingresa_correo_usuario(emailUser);
        DriverManager.log();
    }

    public void ingresa_password(String password) throws Throwable
    {
        logger.info("[STEP]-INGRESAR PASSWORD USUARIO");

        IniciaSesionPageObject.txtPassword(this.driver).sendKeys(password);

        logger.info("[DATA]-Password usuario ingresado: " + IniciaSesionPageObject.txtPassword(this.driver).getAttribute("value"));

    }

    public static void conPasswordUsuario(WebDriver driver, String password) throws Throwable {

        inicia_sesion_inversionista task = new inicia_sesion_inversionista(driver);
        task.ingresa_password(password);
        DriverManager.log();
    }

    public void dashboard_fortesza() throws Throwable
    {
        logger.info("[STEP]-DASHBOARD FORTESZA");

        IniciaSesionPageObject.btnSigIn(this.driver).click();

        TimeUnit.SECONDS.sleep(10);

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-DASHBOARD FORTESZA", "//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]", 10);
    }

    public static void conIniciaSesionFortesza(WebDriver driver) throws Throwable {

        inicia_sesion_inversionista task = new inicia_sesion_inversionista(driver);
        task.dashboard_fortesza();
        DriverManager.log();
    }

    public void cerrar_Sesion() throws Throwable
    {
        logger.info("[STEP]-CERRAR SESION");

        IniciaSesionPageObject.btnSOptions(this.driver).click();

        TimeUnit.SECONDS.sleep(3);

        IniciaSesionPageObject.btnSSingOut(this.driver).click();

        TimeUnit.SECONDS.sleep(5);

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-PANTALLA PRINCIPAL FORTESZA", "//body/app-root[1]/app-principal-layout[1]/div[1]/app-landing[1]/div[1]/div[1]/section[1]", 10);

        this.driver.quit();
    }

    public static void conCerrarSesion(WebDriver driver) throws Throwable {

        inicia_sesion_inversionista task = new inicia_sesion_inversionista(driver);
        task.cerrar_Sesion();
        DriverManager.log();
    }

}
