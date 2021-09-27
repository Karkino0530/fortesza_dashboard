package ScriptDesign.EditarPerfil.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditarPageObject {

    private static WebElement element = null;
    private static String elemento = null;

    public static String optionPerfilUsuario(){
        elemento = "Perfil de usuario";

        return elemento;
    }

    public static WebElement optPerfilUsuario(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[contains(text(),'Perfil de usuario')]"));

        return element;
    }

    public static String editGenero(){
        elemento = "//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[7]/label[1]/button[1]/span[1]/mat-icon[1]";

        return elemento;
    }

    public static WebElement edtGenero(WebDriver driver) {
        element = driver.findElement(By.xpath("//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[7]/label[1]/button[1]/span[1]/mat-icon[1]"));

        return element;
    }

    public static WebElement comboGenero(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@id='mat-select-value-25']"));

        return element;
    }

    public static String fromGenero(){
        elemento = "//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]";

        return elemento;
    }

    public static WebElement frmGenero(WebDriver driver) {
        element = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]"));

        return element;
    }

    public static WebElement lblGenero(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]"));

        return element;
    }

    public static WebElement sltGeneroMasculino(WebDriver driver){
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[1]/mat-option[1]/span[1]"));

        return element;
    }


    public static WebElement sltGeneroFemnino(WebDriver driver){
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[1]/mat-option[2]/span[1]"));

        return element;
    }

    public static WebElement sltGeneroOtro(WebDriver driver){
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[1]/mat-option[3]/span[1]"));

        return element;
    }

    public static WebElement btnAceptarEditarGenero(WebDriver driver){

        element = driver.findElement(By.xpath("//span[contains(text(),'Aceptar')]"));

        return element;

    }

    public static String ntfActualizaExitoso() {

        elemento = "//body/div[4]/div[1]/div[1]";

        return elemento;

    }

    public static String editTelefono(){
        elemento = "//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/label[1]/button[1]/span[1]/mat-icon[1]";

        return elemento;
    }

    public static WebElement edtTelefono(WebDriver driver) {
        element = driver.findElement(By.xpath("//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/label[1]/button[1]/span[1]/mat-icon[1]"));

        return element;
    }

    public static String textoTelefono(){

        elemento = "//input[@id='mat-input-0']";

        return elemento;

    }

    public static WebElement txtTelefono(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='mat-input-0']"));

        return element;
    }

    public static WebElement btnAceptarEditarTelefono(WebDriver driver) {
        element = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-actions[1]/div[1]/div[1]/div[1]/button[2]"));

        return element;
    }

    public static String editDireccionPrincipal(){
        elemento = "//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/label[1]/button[1]/span[1]/mat-icon[1]";

        return elemento;
    }

    public static WebElement edtDireccionPrincipal(WebDriver driver) {
        element = driver.findElement(By.xpath("//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/label[1]/button[1]/span[1]/mat-icon[1]"));

        return element;
    }

    public static WebElement txtEstado(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));

        return element;
    }

    public static WebElement txtCiudad(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[3]/input[1]"));

        return element;
    }

    public static WebElement txtDistrito(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[3]/div[1]/div[1]/div[3]/input[1]"));

        return element;
    }

    public static WebElement txtCalle(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[4]/div[1]/div[1]/div[3]/input[1]"));

        return element;
    }

    public static WebElement btnAceptarEditarDireccion(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-actions[1]/div[1]/div[1]/div[1]/button[2]"));

        return element;
    }

    public static String editDireccionComplementaria(){
        elemento = "//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[3]/label[1]/button[1]/span[1]/mat-icon[1]";

        return elemento;
    }

    public static WebElement edtDireccionComplementaria(WebDriver driver) {
        element = driver.findElement(By.xpath("//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[3]/label[1]/button[1]/span[1]/mat-icon[1]"));

        return element;
    }

    public static String fromEditDireccionComplementaria(){
        elemento = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]";

        return elemento;
    }

    public static WebElement txtDireccionComplementaria(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));

        return element;
    }

    public static WebElement txtDireccionSecundaria(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-content[1]/div[1]/div[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[3]/input[1]"));

        return element;
    }

    public static WebElement btnAceptarEditarDireccionComplementaria(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/mat-dialog-actions[1]/div[1]/div[1]/div[1]/button[2]"));

        return element;
    }

    public static String frmDatosActualizados() {
        elemento = "/html[1]/body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-user-profile-index[1]/div[1]/div[1]/div[2]";

        return elemento;
    }

}
