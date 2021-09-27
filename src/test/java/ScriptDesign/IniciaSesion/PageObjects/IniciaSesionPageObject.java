package ScriptDesign.IniciaSesion.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IniciaSesionPageObject {

    private static WebElement element = null;
    private static String elemento = null;


    public static WebElement btnIniciaSesion(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@id='span-bt-1']"));

        return element;
    }

    public static String textoEmailUser(){
        elemento = "txt-email-or-user";

        return elemento;
    }

    public static String textoPassword(){
        elemento = "txt-password";

        return elemento;
    }

    public static String botonSignIn(){
        elemento = "btn-sign-in-page";

        return elemento;
    }

    public static WebElement txtEmailUser(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='txt-email-or-user']"));

        return element;
    }

    public static WebElement txtPassword(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='txt-password']"));

        return element;
    }

    public static WebElement btnSigIn(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@id='btn-sign-in-page']"));

        return element;
    }

    public static WebElement btnSOptions(WebDriver driver) {
        element = driver.findElement(By.xpath("//mat-icon[contains(text(),'more_vert')]"));

        return element;
    }

    public static WebElement btnSSingOut(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[4]"));

        return element;
    }

}
