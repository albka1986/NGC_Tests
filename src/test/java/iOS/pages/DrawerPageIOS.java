package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import iOS.configDevice.IOSSetup;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import static utilites.Utilities.tapOn;
import static utilites.Utilities.waitForVisibilityOf;

public class DrawerPageIOS extends IOSSetup {

    public By drawerButton = MobileBy.id("hamburger");

    public void drawerOpen() throws InterruptedException {
        waitForVisibilityOf(MobileBy.id("hamburger"));
        tapOn(drawerButton);
    }
}
