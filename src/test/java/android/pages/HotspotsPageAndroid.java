package android.pages;/* Created by Ponomarenko Oleh on 29/12/16. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static utilites.Utilities.*;

public class HotspotsPageAndroid extends AndroidSetup {

    private By hotspotDescription = By.id(APP_PACKAGE_NAME + "base_edit_hotspot_description");
    private By hotspotTitle = By.id(APP_PACKAGE_NAME + "base_edit_hotspot_title");
    private By saveHotspotButton = By.id(APP_PACKAGE_NAME + "base_edit_hotspot_save");
    private By tag = By.id(APP_PACKAGE_NAME + "base_edit_hotspot_tag");
    private By createHotspotButton = By.id(APP_PACKAGE_NAME + "hotspots_add_btn");
    private By location = By.xpath("xpath: //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]");


    public void enterDescription(String keys) {
        sendKeys(this.hotspotDescription, keys);
        hideKeyboard();
    }

    public void enterHotspotTitle(String keys) {
        sendKeys(this.hotspotTitle, keys);
        hideKeyboard();
    }

    public void pressSaveHotspot() {
        while (driver.findElement(location).getText().isEmpty())
            waitAndTap(this.saveHotspotButton);
    }

    public void enterTag(String keys) {
        sendKeys(this.tag, keys);
        driver.getKeyboard().pressKey(Keys.ENTER);
        hideKeyboard();
    }

    public void pressCreateHotspotButton() throws InterruptedException {
        waitAndTap(this.createHotspotButton);
        WebElement element = driver.findElement(By.id("android:id/message"));
        if (element.getText() != null) {
            System.out.println(element.getText());
            waitAndTap(By.id("android:id/button1"));
        }
        Thread.sleep(10000);
    }
}
