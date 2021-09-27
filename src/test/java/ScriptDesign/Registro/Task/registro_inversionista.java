package ScriptDesign.Registro.Task;

import ExecutionScript.StepDefinition.DriverManager;
import ExecutionScript.WaitManager.WaitManager;
import ScriptDesign.Registro.PageObjects.RegistroPageObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static ExecutionScript.Utilidades.generar_correo.corre_electronico;
import static ExecutionScript.Utilidades.generar_nombre.nombre_usuario;
import static ExecutionScript.Utilidades.generar_num_celular.num_celular;
import static ExecutionScript.Utilidades.generar_num_identidad.num_cedula;

public class registro_inversionista {

    private static final Logger logger = LogManager.getLogger(registro_inversionista.class);

    WebDriver driver;

    public registro_inversionista(WebDriver driver)
    {
        this.driver = driver;
    }

    public void registro_inverionista() throws Throwable
    {

        logger.info("[STEP]-REGISTRO INVERSIONISTA");

        RegistroPageObject.btnRegistro(this.driver).click();

    }

    public static void conRegistroInversionista(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.registro_inverionista();
        DriverManager.log();
    }

    public void ingresar_primer_nombre() throws Throwable
    {
        logger.info("[STEP]-INGRESAR PRIMER NOMBRE");

        WaitManager.WaitManageByid(this.driver, "[STEP]-INGRESAR PRIMER NOMBRE", RegistroPageObject.textoFirstName(), 10);

        RegistroPageObject.txtFirstName(this.driver).sendKeys(nombre_usuario());

        logger.info("[DATA]-Primer nombre ingresado: " + RegistroPageObject.txtFirstName(this.driver).getAttribute("value"));

    }

    public static void conPrimerNombre(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.ingresar_primer_nombre();
        DriverManager.log();
    }

    public void ingresar_segundo_nombre() throws Throwable
    {
        logger.info("[STEP]-INGRESAR SEGUNDO NOMBRE");

        WaitManager.WaitManageByid(this.driver, "[STEP]-INGRESAR SEGUNDO NOMBRE", RegistroPageObject.textSecondName(), 10);

        RegistroPageObject.txtSecondName(this.driver).sendKeys(nombre_usuario());

        logger.info("[DATA]-Segundo nombre ingresado: " + RegistroPageObject.txtSecondName(this.driver).getAttribute("value"));
    }

    public static void conSegundoNombre(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.ingresar_segundo_nombre();
        DriverManager.log();
    }

    public void ingresar_primer_apellido() throws Throwable
    {
        logger.info("[STEP]-INGRESAR PRIMER APELLIDO");

        WaitManager.WaitManageByid(this.driver, "[STEP]-INGRESAR PRIMER APELLIDO", RegistroPageObject.textoSurname(), 10);

        RegistroPageObject.txtSurname(this.driver).sendKeys(nombre_usuario());

        logger.info("[DATA]-Primer apellido ingresado: " + RegistroPageObject.txtSurname(this.driver).getAttribute("value"));

    }

    public static void conPrimerApellido(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.ingresar_primer_apellido();
        DriverManager.log();
    }

    public void ingresar_segundo_apellido() throws Throwable
    {
        logger.info("[STEP]-INGRESAR SEGUNDO APELLIDO");

        WaitManager.WaitManageByid(this.driver, "[STEP]-INGRESAR SEGUNDO APELLIDO", RegistroPageObject.textoSecondsurname(), 10);

        RegistroPageObject.txtSecondsurname(this.driver).sendKeys(nombre_usuario());

        logger.info("[DATA]-Segundo apellido ingresado: " + RegistroPageObject.txtSecondsurname(this.driver).getAttribute("value"));

    }

    public static void conSegundoApellido(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.ingresar_segundo_apellido();
        DriverManager.log();
    }

    public void seleccionar_tipo_documento_cedula() throws Throwable{

        logger.info("[STEP]-SELECCIONAR TIPO DE DOCUMENTO DE IDENTIDAD");

        RegistroPageObject.cboDocument_type(this.driver).click();

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-SELECCIONAR TIPO DE DOCUMENTO: CEDULA", "//option[contains(text(),'Cedula de Panamá')]", 10);

        RegistroPageObject.optDocument_type(this.driver).click();

    }

    public static void seleccionTipoDocumentoCedula(WebDriver driver) throws Throwable {
        registro_inversionista task = new registro_inversionista(driver);
        task.seleccionar_tipo_documento_cedula();
        DriverManager.log();
    }

    public void ingresar_numero_identidad_cedula() throws Throwable
    {
        logger.info("[STEP]-INGRESAR NUMERO DE IDENTIDAD");

        WaitManager.WaitManageByid(this.driver, "[STEP]-INGRESAR NUMERO DE IDENTIDAD", RegistroPageObject.textoDocument_number(), 10);

        RegistroPageObject.txtDocument_number(this.driver).sendKeys(num_cedula());

        logger.info("[DATA]-Numero de identidad ingresado: " + RegistroPageObject.txtDocument_number(this.driver).getAttribute("value"));

    }

    public static void conNumeroIdentidadCedula(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.ingresar_numero_identidad_cedula();
        DriverManager.log();
    }

    public void seleccionar_nacionalidad() throws Throwable{

        logger.info("[STEP]-SELECCIONAR NACIONALIDAD");

        WaitManager.WaitManageByid(this.driver, "[STEP]-SELECCIONAR NACIONALIDAD", RegistroPageObject.textoNationality(), 10);

        RegistroPageObject.txtNationality(this.driver).sendKeys("Panama");

        logger.info("[DATA]-Nacionalidad ingresado: " + RegistroPageObject.txtNationality(this.driver).getAttribute("value"));
    }

    public static void conNacionalidad(WebDriver driver) throws Throwable {
        registro_inversionista task = new registro_inversionista(driver);
        task.seleccionar_nacionalidad();
        DriverManager.log();
    }

    public void ingresar_numero_celular() throws Throwable
    {
        logger.info("[STEP]-INGRESAR NUMERO DE CELULAR");

        WaitManager.WaitManageByid(this.driver, "[STEP]-INGRESAR NUMERO DE CELULAR", RegistroPageObject.textoPhoneNumber(), 10);

        RegistroPageObject.txtPhoneNumber(this.driver).sendKeys(num_celular());

        logger.info("[DATA]-Numero de celular ingresado: " + RegistroPageObject.txtPhoneNumber(this.driver).getAttribute("value"));

    }

    public static void conNumeroCelular(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.ingresar_numero_celular();
        DriverManager.log();
    }

    public void ingresar_correo_electronico() throws Throwable
    {
        logger.info("[STEP]-INGRESAR CORREO ELECTRONICO");

        WaitManager.WaitManageByid(this.driver, "[STEP]-INGRESAR CORREO ELECTRONICO", RegistroPageObject.textoEmail(), 10);

        String email = corre_electronico(RegistroPageObject.txtFirstName(this.driver).getAttribute("value"), RegistroPageObject.txtSurname(this.driver).getAttribute("value"));

        RegistroPageObject.txtEmail(this.driver).sendKeys(email);

        logger.info("[DATA]-Correo electronico ingresado: " + RegistroPageObject.txtEmail(this.driver).getAttribute("value"));

    }

    public static void conCorreoElectronico(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.ingresar_correo_electronico();
        DriverManager.log();
    }

    public void ingresar_password() throws Throwable
    {
        logger.info("[STEP]-INGRESAR CONTRASEÑA");

        WaitManager.WaitManageByid(this.driver, "[STEP]-INGRESAR CONTRASEÑA", RegistroPageObject.textoPasword(), 10);

        String pass = "Abcd1234.";

        RegistroPageObject.txtPassword(this.driver).sendKeys(pass);

        logger.info("[DATA]-Contraseña ingresada: " + RegistroPageObject.txtPassword(this.driver).getAttribute("value"));

    }

    public static void conPassword(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.ingresar_password();
        DriverManager.log();
    }

    public void ingresar_confirmacion_password() throws Throwable
    {
        logger.info("[STEP]-INGRESAR CONFIRMACION DE CONTRASEÑA");

        WaitManager.WaitManageByid(this.driver, "[STEP]-INGRESAR CONFIRMACION DE CONTRASEÑA", RegistroPageObject.textoConfrimPasword(), 10);

        String pass = "Abcd1234.";

        RegistroPageObject.txtConfirmPassword(this.driver).sendKeys(pass);

        logger.info("[DATA]-Confirmacion de contraseña ingresada: " + RegistroPageObject.txtConfirmPassword(this.driver).getAttribute("value"));

    }

    public static void conConfirmacionPassword(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.ingresar_confirmacion_password();
        DriverManager.log();
    }

    public void acelptaTerminos() throws Throwable {

        logger.info("[STEP]-ACEPTAR ACUERDO TERMINOS");

        RegistroPageObject.chkAceptaAcuerdoTerminos(this.driver).click();

        TimeUnit.SECONDS.sleep(5);

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-PANTALLA DE TERMINOS Y CODICIONES", "//button[@id='btn-confirm-terms-and-conditions']", 10);

        RegistroPageObject.btnContinuar(this.driver).click();
    }

    public static void conAceptarAcuerdoDeTerminos(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.acelptaTerminos();
        DriverManager.log();
    }

    public void completar_registro() throws Throwable
    {
        logger.info("[STEP]-COMPLETAR REGISTRO");

        RegistroPageObject.btnRegistrase(this.driver).click();

    }

    public static void conCompletarRegistro(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.completar_registro();
        DriverManager.log();
    }

    public void notificacion_registro_exitoso() throws Throwable
    {
        logger.info("[STEP]-NOTIFICACION EMERGENTE REGISTRO EXITOSO");

        WaitManager.WaitManageByid(this.driver, "NOTIFICACION EMERGENTE REGISTRO EXITOSO", RegistroPageObject.msjRegistroExitoso(), 15);
    }

    public static void conNotificacionEmergenteRegistroExitoso(WebDriver driver) throws Throwable {

        registro_inversionista task = new registro_inversionista(driver);
        task.notificacion_registro_exitoso();
        DriverManager.log();
    }



}
