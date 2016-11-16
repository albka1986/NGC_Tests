package android.pages;/* Created by Ponomarenko Oleh on 07/11/16. */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class DrawerPage extends BasePage {

    public static By drawerTap = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
    public static By drawerAvatar = By.id(APP_PACKAGE_NAME + "drawer_avatar");
    public static By searchButton = By.id(APP_PACKAGE_NAME + "drawer_search_btn");


    public DrawerPage(AppiumDriver driver) {
        super(driver);
    }


    public void drawerOpen() throws InterruptedException {
        Thread.sleep(2000);
        driver.tap(1, 100, 190, 1);
        Thread.sleep(2000);
    }
}
