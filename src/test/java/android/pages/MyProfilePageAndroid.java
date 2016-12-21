package android.pages;

/* Created by Ponomarenko Oleh on 07/11/16. */

import android.configDevice.AndroidSetup;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import static utilites.Utilities.waitForClickabilityOf;
import static utilites.Utilities.waitForVisibilityOf;

public class MyProfilePageAndroid extends AndroidSetup {

    public static By logoutButton = By.id(APP_PACKAGE_NAME + "my_profile_logout");


    public void logout() throws InterruptedException {
        DrawerPageAndroid drawerPage = new DrawerPageAndroid();
        AppiumDriver driver = getDriver();

        Thread.sleep(7000);

        drawerPage.drawerOpen();

        waitForClickabilityOf(drawerPage.drawerAvatar);
        driver.findElement(drawerPage.drawerAvatar).click();

        waitForVisibilityOf(logoutButton);
        driver.findElement(logoutButton).click();
    }
}
