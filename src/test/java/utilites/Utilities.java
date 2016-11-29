package utilites;

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

import static config.MyListener.driver;

public class Utilities {


    public static void takeScreenShot(AppiumDriver driver) {
        String destDir;
        DateFormat dateFormat;
        // Set folder name to store screenshots.
        destDir = "screenshots";
        // Capture screenshot.
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Set date format to set It as screenshot file name.
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        // Create folder under project with name "screenshots" provided to destDir.
        new File(destDir).mkdirs();
        // Set file name using current date time.
        String destFile = dateFormat.format(new Date()) + ".png";

        try {
            // Copy paste file at destination folder location
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
            System.out.println("~~~~~~~Have took a capture!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void hideKeyboard(AppiumDriver driver) {
        try {
            Thread.sleep(2000);
            driver.hideKeyboard();
            Thread.sleep(2000);
        } catch (WebDriverException | InterruptedException e) {
        }
    }

    public static void swipingVertical(AppiumDriver driver) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = size.width / 2;
        //Swipe from Bottom to Top.
//        driver.swipe(startx, starty, startx, endy, 3000);
//        Thread.sleep(2000);
        //Swipe from Top to Bottom.
        driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);
    }

    public static void swipeRightToLeft(AppiumDriver driver) {
        driver.swipe(300, 300, 1, 300, 1500);


    }

    public static void waitForVisibilityOf(AppiumDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForClickabilityOf(AppiumDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static By xpathBuilderByValue(String value) {
        String xpathPart1 = "//*[@value='";
        String xpathPart2 = "']";
        String xpath = xpathPart1 + value + xpathPart2;
        return By.xpath(xpath);
    }

    public static void tapOn(By identification) {
        driver.findElement(identification).click();
        System.out.println("Clicked on: " + identification);
    }

}
