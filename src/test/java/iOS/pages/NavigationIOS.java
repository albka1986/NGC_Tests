package iOS.pages;/* Created by Ponomarenko Oleh on 04/01/17. */

import iOS.configDevice.IOSSetup;

public class NavigationIOS extends IOSSetup {

    public void back() throws InterruptedException {
        Thread.sleep(3000);
        driver.tap(1, 50, 50, 200);
    }
}
