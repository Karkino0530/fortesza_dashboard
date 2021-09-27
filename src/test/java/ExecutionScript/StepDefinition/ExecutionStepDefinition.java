package ExecutionScript.StepDefinition;

import ExecutionScript.Utilidades.ReadProperties;
import ExecutionScript.WaitManager.WaitManager;
import ScriptDesign.EditarPerfil.Task.editar_perfil_usuario;
import ScriptDesign.IniciaSesion.Task.inicia_sesion_inversionista;
import ScriptDesign.Registro.Task.registro_inversionista;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.util.logging.Logger;

public class ExecutionStepDefinition {

    Logger logger = Logger.getLogger("StepDefinition-Execution");
    DriverManager driverManager = new DriverManager();

    @After
    public void finEscenario(Scenario scenario) throws Throwable {
        logger.info("[INFO]-RESULTADO DE EJECUCION: " + scenario.getStatus());


       if (scenario.isFailed())
       {
           WaitManager.ScreenShot(driverManager.driver, "RESULTADO FALLIDO");
           driverManager.getDriver().quit();
       }

   }

   // REGISTRO DE INVERSIONISTA EXITO
    @Given("^Cliente accede a la pagina de fortesza para registrarse como inversionista$")
    public void usuarioAccedeALaPaginaDeRegistroDeFortesza() throws Throwable {
        driverManager.driver.get(ReadProperties.getPropertyData("Configuation", "urlfortesza.registro"));
    }

    @When("^Completa el formulario de registro sus datos de seguridad$")
    public void completaElFormularioDeRegistroSusDatosDeSeguridadYContraseña() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registro_inversionista.conPrimerNombre(driverManager.driver);
        registro_inversionista.conSegundoNombre(driverManager.driver);
        registro_inversionista.conPrimerApellido(driverManager.driver);
        registro_inversionista.conSegundoApellido(driverManager.driver);
        registro_inversionista.seleccionTipoDocumentoCedula(driverManager.driver);
        registro_inversionista.conNumeroIdentidadCedula(driverManager.driver);
        registro_inversionista.conNacionalidad(driverManager.driver);
        registro_inversionista.conNumeroCelular(driverManager.driver);
        registro_inversionista.conCorreoElectronico(driverManager.driver);
        registro_inversionista.conPassword(driverManager.driver);
        registro_inversionista.conConfirmacionPassword(driverManager.driver);
        registro_inversionista.conAceptarAcuerdoDeTerminos(driverManager.driver);
        registro_inversionista.conCompletarRegistro(driverManager.driver);
    }

    @Then("^El cliente podra registrarse exitosamente\\.$")
    public void elClientePodraRegistrarseExitosamente() throws Throwable {

        registro_inversionista.conNotificacionEmergenteRegistroExitoso(driverManager.driver);

        WaitManager.ScreenShotSuccess(driverManager.driver, "REGRISTRO INVERSIONISTRA EXITOSO");

        driverManager.getDriver().quit();
    }


    // INGRESO A DASHBOARD FORTESZA
    @Given("^Usuario \"([^\"]*)\" accede a staging\\.fortesza\\.com/login$")
    public void usuarioAccedeAHttpsStagingForteszaComLogin(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driverManager.driver.get(ReadProperties.getPropertyData("Configuation", "urlfortesza.login"));
        inicia_sesion_inversionista.conIniciaSesion(driverManager.driver);
        inicia_sesion_inversionista.conEmailUsuario(driverManager.driver, username);
    }

    @When("^Ingresa sus datos de seguridad \"([^\"]*)\"$")
    public void ingresaSusDatosDeSeguridad(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        inicia_sesion_inversionista.conPasswordUsuario(driverManager.driver, password);

    }

    @Then("^Inversionista puede ve el dashboard$")
    public void inversionistaPuedeVeElDashboard() throws Throwable {

        inicia_sesion_inversionista.conIniciaSesionFortesza(driverManager.driver);

        WaitManager.ScreenShotSuccess(driverManager.driver, "INICIA SESION EXITOSO");

        inicia_sesion_inversionista.conCerrarSesion(driverManager.driver);
    }


    // EDITAR DATOS DE USUARIO
    @Given("^Inversionista accede a su perfil de fortesza con sus datos de seguridad \"([^\"]*)\" y \"([^\"]*)\"$")
    public void inversionistaAccedeASuPerfilDeForteszaConSusDatosDeSeguridadY(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driverManager.driver.get(ReadProperties.getPropertyData("Configuation", "urlfortesza.login"));
        inicia_sesion_inversionista.conIniciaSesion(driverManager.driver);
        inicia_sesion_inversionista.conEmailUsuario(driverManager.driver, username);
        inicia_sesion_inversionista.conPasswordUsuario(driverManager.driver, password);
        inicia_sesion_inversionista.conIniciaSesionFortesza(driverManager.driver);
    }

    @When("^Edita los datos de su perfil de usuario$")
    public void editaLosDatosDeSuPerfilDeUsuario() throws Throwable {

        editar_perfil_usuario.conEditarPerfilUusuario(driverManager.driver);

        WaitManager.ScreenShotSuccess(driverManager.driver, "ACTUALIZA INFORMACION - ANTES");

        editar_perfil_usuario.conEditarGenero(driverManager.driver);
        editar_perfil_usuario.conEditarTelefono(driverManager.driver);
        editar_perfil_usuario.conEditarDirecionPrincipal(driverManager.driver);
        editar_perfil_usuario.conEditarDirecionComplementaria(driverManager.driver);

    }

    @Then("^el Inversionista podra ver sus datos actualizados$")
    public void elInversionistaPodraVerSusDatosActualizados() throws Throwable {

        editar_perfil_usuario.conFormularioDeDatosActualizado(driverManager.driver);

        WaitManager.ScreenShotSuccess(driverManager.driver, "ACTUALIZA INFORMACION EXITOSO");

        inicia_sesion_inversionista.conCerrarSesion(driverManager.driver);

    }
}