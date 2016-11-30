package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import iOS.configDevice.IOSSetup;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import static utilites.Utilities.waitForVisibilityOf;

public class DrawerPageIOS extends IOSSetup {

    public By drawer = By.name("drawerButton");

    public void drawerOpen() throws InterruptedException {
        waitForVisibilityOf(driver, MobileBy.id("hamburger"));
        driver.findElement(MobileBy.id("hamburger")).click();
    }
}
