package ExecutionScript.Utilidades;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollPage {

    WebDriver driver;
    JavascriptExecutor js;

    public ScrollPage(WebDriver driver)
    {
        this.driver = driver;
        js = (JavascriptExecutor) this.driver;
    }

    private void EndPage()
    {
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    private void TopPage()
    {
        js.executeScript("window.scrollBy(0,0)");
    }

    public static void EndPage(WebDriver driver)
    {
        ScrollPage task = new ScrollPage(driver);
        task.EndPage();
    }

    public static void TopPage(WebDriver driver)
    {
        ScrollPage task = new ScrollPage(driver);
        task.TopPage();
    }


}
