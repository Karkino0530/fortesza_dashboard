package ExecutionScript.WaitManager;

import net.serenitybdd.core.annotations.findby.By;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class WaitManager {

    static Logger logger = Logger.getLogger("WaitManager");

    public static boolean WaitManageByid(WebDriver driver, String idElemento , String located, int time) throws IOException
    {
        try {

            WebDriverWait wait = new WebDriverWait(driver, time);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(located)));

            logger.info("[INFO]-Se muestra elemento " + idElemento);
            return true;
        }
        catch (Exception e)
        {
            WaitManager.ScreenShot(driver, idElemento);
            logger.error(e);
            Assert.fail();
            return false;
        }
    }

    public static boolean WaitManageByXpath(WebDriver driver, String idElemento , String located, int time) throws IOException
    {
        try {

            WebDriverWait wait = new WebDriverWait(driver, time);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(located)));

            logger.info("[INFO]-Se muestra elemento " + idElemento);
            return true;
        }
        catch (Exception e)
        {
            WaitManager.ScreenShot(driver, idElemento);
            logger.error(e);
            Assert.fail();
            return false;
        }
    }


    public static void ScreenShot(WebDriver driver, String foto) throws IOException
    {

        String currentDir = System.getProperty("user.dir");

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        DateFormat dateFormat2 = new SimpleDateFormat("hh.mm.ss");
        Date date2 = new Date();

        String path = dateFormat.format(date);
        String subPath = dateFormat2.format(date2);

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(currentDir + "//Evidencias//screenshots//"+path+"//"+subPath+"//" + foto + ".png"));

    }

    public static void ScreenShotSuccess(WebDriver driver, String foto) throws IOException
    {

        String currentDir = System.getProperty("user.dir");

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        DateFormat dateFormat2 = new SimpleDateFormat("hh.mm.ss");
        Date date2 = new Date();

        String path = dateFormat.format(date);
        String subPath = dateFormat2.format(date2);

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(currentDir + "//Evidencias//screenshots//Success//"+path+"//"+subPath+"//" + foto + ".png"));

    }


}

