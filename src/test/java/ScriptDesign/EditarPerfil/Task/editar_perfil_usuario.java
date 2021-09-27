package ScriptDesign.EditarPerfil.Task;

import ExecutionScript.StepDefinition.DriverManager;
import ExecutionScript.Utilidades.ScrollPage;
import ExecutionScript.WaitManager.WaitManager;
import ScriptDesign.EditarPerfil.PageObjects.EditarPageObject;
import ScriptDesign.IniciaSesion.PageObjects.IniciaSesionPageObject;
import ScriptDesign.Registro.PageObjects.RegistroPageObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static ExecutionScript.Utilidades.generar_distrito.distrito;
import static ExecutionScript.Utilidades.generar_num_celular.num_celular;

public class editar_perfil_usuario {

    private static final Logger logger = LogManager.getLogger(editar_perfil_usuario.class);

    WebDriver driver;

    public editar_perfil_usuario(WebDriver driver)
    {
        this.driver = driver;
    }

    public void informacion_usuario() throws Throwable
    {
        logger.info("[STEP]-INFORMACION PERSONAL USUARIO");

        IniciaSesionPageObject.btnSOptions(this.driver).click();

        TimeUnit.SECONDS.sleep(3);

        EditarPageObject.optPerfilUsuario(this.driver).click();

        TimeUnit.SECONDS.sleep(5);

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-INFORMACION PERSONAL USUARIO", "//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]", 10);
    }

    public static void conEditarPerfilUusuario(WebDriver driver) throws Throwable {

        editar_perfil_usuario task = new editar_perfil_usuario(driver);
        task.informacion_usuario();
        DriverManager.log();
    }

    public void editar_informacion_genero() throws Throwable
    {

        logger.info("[STEP]-EDITAR INFORMACION PERSONAL USUARIO - GENERO");

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-EDITAR INFORMACION PERSONAL USUARIO - GENERO", EditarPageObject.editGenero(), 10);

        ScrollPage.EndPage(this.driver);

        EditarPageObject.edtGenero(this.driver).click();

        TimeUnit.SECONDS.sleep(3);

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-FORMULARIO DE EDITAR GENERO", EditarPageObject.fromGenero(), 10);

        EditarPageObject.frmGenero(this.driver).click();

        TimeUnit.SECONDS.sleep(3);

        int tmp = (int) (Math.random() * 2 + 1);

        if (tmp == 1) {
            EditarPageObject.sltGeneroMasculino(this.driver).click();
            logger.info("[DATA]-Genero Seleccionado: Masculino");
        } else {
            EditarPageObject.sltGeneroFemnino(this.driver).click();
            logger.info("[DATA]-Genero Seleccionado: Femenino");
        }
        if (tmp==3){
            EditarPageObject.sltGeneroOtro(this.driver).click();
            logger.info("[DATA]-Genero Seleccionado: Otro");
        }

        TimeUnit.SECONDS.sleep(2);

        EditarPageObject.btnAceptarEditarGenero(this.driver).click();

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-NOTIFICACION EMERGENTE DE ACTUALIZACION", EditarPageObject.ntfActualizaExitoso(), 10);

    }

    public static void conEditarGenero(WebDriver driver) throws Throwable {

        editar_perfil_usuario task = new editar_perfil_usuario(driver);
        task.editar_informacion_genero();
        DriverManager.log();
    }

    public void editar_informacion_tenefo() throws Throwable
    {
        logger.info("[STEP]-EDITAR INFORMACION PERSONAL USUARIO - TELEFONO");

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-EDITAR INFORMACION PERSONAL USUARIO - TELEFONO", EditarPageObject.editTelefono(), 10);

        EditarPageObject.edtTelefono(this.driver).click();

        TimeUnit.SECONDS.sleep(3);

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-FORMULARIO DE EDITAR TELEFONO", EditarPageObject.textoTelefono(), 10);

        logger.info("[DATA]-Numero de telefono actual: " + EditarPageObject.txtTelefono(this.driver).getAttribute("value"));

        EditarPageObject.txtTelefono(this.driver).clear();

        EditarPageObject.txtTelefono(this.driver).sendKeys(num_celular());

        logger.info("[DATA]-Numero de telefono nuevo: " + EditarPageObject.txtTelefono(this.driver).getAttribute("value"));

        EditarPageObject.btnAceptarEditarTelefono(this.driver).click();

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-NOTIFICACION EMERGENTE DE ACTUALIZACION", EditarPageObject.ntfActualizaExitoso(), 10);
    }

    public static void conEditarTelefono(WebDriver driver) throws Throwable {

        editar_perfil_usuario task = new editar_perfil_usuario(driver);
        task.editar_informacion_tenefo();
        DriverManager.log();
    }

    public void editar_informacion_direccion_principal() throws Throwable
    {

        logger.info("[STEP]-EDITAR INFORMACION PERSONAL USUARIO - DIRECCION PRINCIPAL");

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-EDITAR INFORMACION PERSONAL USUARIO - DIRECCION PRINCIPAL", EditarPageObject.editDireccionPrincipal(), 10);

        EditarPageObject.edtDireccionPrincipal(this.driver).click();

        TimeUnit.SECONDS.sleep(3);

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-FORMULARIO DE EDITAR DIRECCION PRINCIPAL", "//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]", 10);

        logger.info("[DATA]-Estado actual: " + EditarPageObject.txtEstado(this.driver).getAttribute("value"));
        logger.info("[DATA]-Ciudad actual: " + EditarPageObject.txtCiudad(this.driver).getAttribute("value"));
        logger.info("[DATA]-Distrito actual: " + EditarPageObject.txtDistrito(this.driver).getAttribute("value"));
        logger.info("[DATA]-Calle actual: " + EditarPageObject.txtCalle(this.driver).getAttribute("value"));

        EditarPageObject.txtEstado(this.driver).clear();
        EditarPageObject.txtCiudad(this.driver).clear();
        EditarPageObject.txtDistrito(this.driver).clear();
        EditarPageObject.txtCalle(this.driver).clear();

        EditarPageObject.txtEstado(this.driver).sendKeys("PANAMA");

        TimeUnit.SECONDS.sleep(1);

        EditarPageObject.txtCiudad(this.driver).sendKeys("PANAMA");

        TimeUnit.SECONDS.sleep(1);

        EditarPageObject.txtDistrito(this.driver).sendKeys(distrito());

        TimeUnit.SECONDS.sleep(1);

        EditarPageObject.txtCalle(this.driver).sendKeys("CALLE 50");

        logger.info("[DATA]-Estado actualizado: " + EditarPageObject.txtEstado(this.driver).getAttribute("value"));
        logger.info("[DATA]-Ciudad actualizada: " + EditarPageObject.txtCiudad(this.driver).getAttribute("value"));
        logger.info("[DATA]-Distrito actualizado: " + EditarPageObject.txtDistrito(this.driver).getAttribute("value"));
        logger.info("[DATA]-Calle actualizada: " + EditarPageObject.txtCalle(this.driver).getAttribute("value"));

        EditarPageObject.btnAceptarEditarDireccion(this.driver).click();

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-NOTIFICACION EMERGENTE DE ACTUALIZACION", EditarPageObject.ntfActualizaExitoso(), 10);

    }

    public static void conEditarDirecionPrincipal(WebDriver driver) throws Throwable {

        editar_perfil_usuario task = new editar_perfil_usuario(driver);
        task.editar_informacion_direccion_principal();
        DriverManager.log();
    }

    public void editar_informacion_direccion_complementaria() throws Throwable
    {

        logger.info("[STEP]-EDITAR INFORMACION PERSONAL USUARIO - DIRECCION COMPLEMENTARIA");

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-EDITAR INFORMACION PERSONAL USUARIO - DIRECCION COMPLEMENTARIA", EditarPageObject.editDireccionComplementaria(), 10);

        EditarPageObject.edtDireccionComplementaria(this.driver).click();


        WaitManager.WaitManageByXpath(this.driver, "[STEP]-FORMULARIO DE EDITAR DIRECCION COMPLEMENTARIA", EditarPageObject.fromEditDireccionComplementaria(), 10);

        logger.info("[DATA]-Estado actual: " + EditarPageObject.txtEstado(this.driver).getAttribute("value"));
        logger.info("[DATA]-Direccion actual: " + EditarPageObject.txtCiudad(this.driver).getAttribute("value"));

        EditarPageObject.txtDireccionComplementaria(this.driver).clear();
        EditarPageObject.txtDireccionComplementaria(this.driver).sendKeys("PANAMA");

        TimeUnit.SECONDS.sleep(2);

        EditarPageObject.txtDireccionSecundaria(this.driver).clear();
        EditarPageObject.txtDireccionSecundaria(this.driver).sendKeys(distrito());

        logger.info("[DATA]-Estado actualizado: " + EditarPageObject.txtEstado(this.driver).getAttribute("value"));
        logger.info("[DATA]-Direccion actualizada: " + EditarPageObject.txtCiudad(this.driver).getAttribute("value"));

        EditarPageObject.btnAceptarEditarDireccionComplementaria(this.driver).click();

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-NOTIFICACION EMERGENTE DE ACTUALIZACION", EditarPageObject.ntfActualizaExitoso(), 10);

    }

    public static void conEditarDirecionComplementaria(WebDriver driver) throws Throwable {

        editar_perfil_usuario task = new editar_perfil_usuario(driver);
        task.editar_informacion_direccion_complementaria();
        DriverManager.log();
    }

    public void formulario_datos_actualizados() throws Throwable
    {
        logger.info("[STEP]-EDITAR INFORMACION PERSONAL USUARIO ACTUALIZADA CORRECTAMENTE");

        WaitManager.WaitManageByXpath(this.driver, "[STEP]-EDITAR INFORMACION PERSONAL USUARIO", EditarPageObject.frmDatosActualizados(),10);

        TimeUnit.SECONDS.sleep(5);

        ScrollPage.TopPage(this.driver);
    }

    public static void conFormularioDeDatosActualizado(WebDriver driver) throws Throwable {

        editar_perfil_usuario task = new editar_perfil_usuario(driver);
        task.formulario_datos_actualizados();
        DriverManager.log();
    }


}
