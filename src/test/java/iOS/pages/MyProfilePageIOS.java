package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import static android.configDevice.AndroidSetup.getDriver;
import static utilites.Utilities.tapOn;
import static utilites.Utilities.waitForVisibilityOf;

public class MyProfilePageIOS {
    public static By logoutButton = By.name("logOutButton");


    public void logout() throws InterruptedException {
        DrawerPageIOS drawerPage = new DrawerPageIOS();

        AppiumDriver driver = getDriver();
        drawerPage.drawerOpen();

        Thread.sleep(5000);
        driver.tap(1, 100, 100, 500); //tap on drawerAvatar

        waitForVisibilityOf(logoutButton);
        tapOn(logoutButton);
    }


}
