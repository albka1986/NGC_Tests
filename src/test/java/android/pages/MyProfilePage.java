package android.pages;

/* Created by Ponomarenko Oleh on 07/11/16. */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MyProfilePage extends BasePage {

    public static By logoutButton = By.id(APP_PACKAGE_NAME + "my_profile_logout");

    public MyProfilePage(AppiumDriver driver) {
        super(driver);
    }

    public MyProfilePage logout() throws InterruptedException {
        Thread.sleep(10000);
        new DrawerPage(driver).drawerOpen();
        waitForClickabilityOf(DrawerPage.drawerAvatar);
        driver.findElement(DrawerPage.drawerAvatar).click();
        waitForVisibilityOf(MyProfilePage.logoutButton);
        driver.findElement(MyProfilePage.logoutButton).click();

        return new MyProfilePage(driver);
    }
}
