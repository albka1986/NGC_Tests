package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.swipingToDown;
import static utilites.Utilities.waitAndTap;

public class MyProfilePageIOS extends IOSSetup {
    public static By logoutButton = By.name("logOutButton");


    public void logout() throws InterruptedException {
        DrawerPageIOS drawerPage = new DrawerPageIOS();
        drawerPage.drawerOpen();
        Thread.sleep(1000);
        swipingToDown();
        Thread.sleep(1000);
        drawerPage.tapOnAvatar();
        waitAndTap(logoutButton);

        waitAndTap(By.name("Yes"));

    }


}
