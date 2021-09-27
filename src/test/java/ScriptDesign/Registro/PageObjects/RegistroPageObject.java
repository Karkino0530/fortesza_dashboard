package ScriptDesign.Registro.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistroPageObject {

    private static WebElement element = null;
    private static String elemento = null;

    public static WebElement btnRegistro(WebDriver driver) {
        element = driver.findElement(By.xpath("//body/app-root[1]/app-principal-layout[1]/app-navbar[1]/mat-toolbar[1]/mat-toolbar-row[1]/div[6]/button[2]/span[1]/div[1]"));

        return element;
    }


    public static String textoFirstName(){
        elemento = "txt-firstname";

        return elemento;
    }


    public static WebElement txtFirstName(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='txt-firstname']"));

        return element;
    }

    public static String textSecondName(){
        elemento = "txt-secondname";

        return elemento;
    }

    public static WebElement txtSecondName(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='txt-secondname']"));

        return element;
    }

    public static String textoSurname(){
        elemento = "txt-firstname";

        return elemento;
    }

    public static WebElement txtSurname(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='txt-firstsurname']"));

        return element;
    }

    public static String textoSecondsurname(){
        elemento = "txt-secondsurname";

        return elemento;
    }

    public static WebElement txtSecondsurname(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='txt-secondsurname']"));

        return element;
    }

    public static WebElement cboDocument_type(WebDriver driver) {
        element = driver.findElement(By.xpath("//select[@id='document_type']"));

        return element;
    }

    public static WebElement optDocument_type(WebDriver driver) {
        element = driver.findElement(By.xpath("//option[contains(text(),'Cedula de Panamá')]"));

        return element;
    }

    public static String textoDocument_number(){
        elemento = "document_number";

        return elemento;
    }

    public static WebElement txtDocument_number(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='document_number']"));

        return element;
    }

    public static String textoNationality(){
        elemento = "txt-nationality";

        return elemento;
    }


    public static WebElement txtNationality(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='txt-nationality']"));

        return element;
    }

    public static String textoPhoneNumber(){
        elemento = "txt-phone-number";

        return elemento;
    }

    public static WebElement txtPhoneNumber(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='txt-phone-number']"));

        return element;
    }

    public static String textoEmail(){
        elemento = "txt-email";

        return elemento;
    }

    public static WebElement txtEmail(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='txt-email']"));

        return element;
    }

    public static String textoPasword(){
        elemento = "txt-password";

        return elemento;
    }

    public static WebElement txtPassword(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='txt-password']"));

        return element;
    }

    public static String textoConfrimPasword(){
        elemento = "txt-confirm-password";

        return elemento;
    }

    public static WebElement txtConfirmPassword(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='txt-confirm-password']"));

        return element;
    }

    public static WebElement chkAceptaAcuerdoTerminos(WebDriver driver) {
        element = driver.findElement(By.xpath("//body/app-root[1]/app-register[1]/div[3]/div[2]/div[3]/form[1]/div[8]/mat-checkbox[1]/label[1]/div[1]"));

        return element;
    }

    public static WebElement btnContinuar(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[contains(text(),'Continuar')]"));

        return element;
    }

    public static WebElement btnRegistrase(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[contains(text(),'Registrarme')]"));

        return element;
    }

    public static String msjRegistroExitoso(){
        elemento = "toast-container";

        return elemento;
    }


}
