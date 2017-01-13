package iOS.pages;/* Created by Ponomarenko Oleh on 11/01/17. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.waitAndTap;

public class PhotoIOS extends IOSSetup {

    private By alertPermissionPhoto = By.name("“Camp Dev” Would Like to Access Your Photos");
    private By allowPermissionPhoto = By.name("OK");

    public void allowPermissionPhoto() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (driver.findElement(alertPermissionPhoto) != null) {
            waitAndTap(allowPermissionPhoto);
        }
    }


}
