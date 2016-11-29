package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import iOS.configDevice.IOSSetup;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class DrawerPageIOS extends IOSSetup {

    public By drawer = By.name("drawerButton");

    public void drawerOpen() throws InterruptedException {
        Thread.sleep(2000);
        driver.tap(1, 100, 190, 1);
        IOSDriver iosDriver = driver;
        Thread.sleep(2000);
    }
}
