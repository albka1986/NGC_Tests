package android.pages;

/* Created by Ponomarenko Oleh on 07/11/16. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.waitForClickabilityOf;
import static utilites.Utilities.waitForVisibilityOf;

public class MyProfilePage extends AndroidSetup {

    public static By logoutButton = By.id(APP_PACKAGE_NAME + "my_profile_logout");

    public void logout() throws InterruptedException {
        Thread.sleep(10000);
        new DrawerPage().drawerOpen();
        waitForClickabilityOf(driver, DrawerPage.drawerAvatar);
        driver.findElement(DrawerPage.drawerAvatar).click();
        waitForVisibilityOf(driver, MyProfilePage.logoutButton);
        driver.findElement(MyProfilePage.logoutButton).click();
    }
}
