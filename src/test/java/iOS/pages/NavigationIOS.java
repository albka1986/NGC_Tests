package iOS.pages;/* Created by Ponomarenko Oleh on 04/01/17. */

import iOS.configDevice.IOSSetup;

public class NavigationIOS extends IOSSetup {
    public void back() {
        driver.navigate().back();
    }
}
