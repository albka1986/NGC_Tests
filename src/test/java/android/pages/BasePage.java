package android.pages;/* Created by Ponomarenko Oleh on 03/11/16. */

import io.appium.java_client.AppiumDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static final String APP_PACKAGE_NAME = "com.erminesoft.ngc:id/";

    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    @Test
    public static void swipingVertical(AppiumDriver driver) throws InterruptedException {
        //Get the size of screen.
        Dimension size = driver.manage().window().getSize();
//        System.out.println(size);
        //Find swipe start and end point from screen's with and height.
        //Find starty point which is at bottom side of screen.
        int starty = (int) (size.height * 0.80);
        //Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.20);
        //Find horizontal point where you wants to swipe. It is in middle of screen width.
        int startx = size.width / 2;
//        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
        //Swipe from Bottom to Top.
        driver.swipe(startx, starty, startx, endy, 3000);
        Thread.sleep(2000);
        //Swipe from Top to Bottom.
        driver.swipe(startx, endy, startx, starty, 3000);
        Thread.sleep(2000);
    }

    public static void hideKeyboard(AppiumDriver driver) {
        try {
            Thread.sleep(2000);
            driver.hideKeyboard();
            Thread.sleep(2000);
        } catch (WebDriverException | InterruptedException e) {
        }
    }

    public void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForClickabilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


}
