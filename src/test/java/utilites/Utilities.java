package utilites;

import config.MyListener;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static config.MyListener.driver;
import static config.MyListener.getDriver;

public class Utilities {


    public static void takeScreenShot(AppiumDriver driver) {
        String destDir;
        DateFormat dateFormat;
        destDir = "screenshots";
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        new File(destDir).mkdirs();
        String destFile = dateFormat.format(new Date()) + ".png";

        try {
            // Copy paste file at destination folder location
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
            System.out.println("~~~~~~~Have took a capture!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void hideKeyboard() {
        try {
            getDriver();
            Thread.sleep(2000);
            driver.hideKeyboard();
            Thread.sleep(2000);
        } catch (WebDriverException | InterruptedException e) {
        }
    }

    public static void swipingVerticalToTop() throws InterruptedException {
        AppiumDriver driver = MyListener.getDriver();
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = (int) (size.width * 0.3);
        driver.swipe(startx, starty, startx, endy, 3000);
        Thread.sleep(2000);
    }

    public static void swipingVerticalToDown() throws InterruptedException {
        AppiumDriver driver = MyListener.getDriver();
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = (int) (size.width * 0.3);
        driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);
    }

    public static void swipeRightToLeft(AppiumDriver driver) {
        driver.swipe(300, 300, 1, 300, 1500);
    }

    public static void waitForVisibilityOf(By identification) {
        AppiumDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(identification));
    }

    public static void waitAndTap(By locator) {
        waitForVisibilityOf(locator);
        tapOn(locator);
    }

    public static void waitForClickabilityOf(By identification) {
        AppiumDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(identification));
    }

    public static By xpathBuilderByValue(String value) {
        String xpathPart1 = "//*[@value='";
        String xpathPart2 = "']";
        String xpath = xpathPart1 + value + xpathPart2;
        return By.xpath(xpath);
    }


    public static By xpathBuilderByText(String text) {
        String xpathPart1 = "//text()[contains('";
        String xpathPart2 = "')]";
        String xpath = xpathPart1 + text + xpathPart2;
        return By.xpath(xpath);
    }

    public static void tapOn(By identification) {
        driver.findElement(identification).click();
        System.out.println("Clicked on: " + identification);
    }

    public static void sendKeys(By identification, String keys) {
        waitForClickabilityOf(identification);
        driver.findElement(identification).sendKeys(keys);
    }

    public static boolean trueOrFalse() {
        return new Random().nextBoolean();
    }
}
