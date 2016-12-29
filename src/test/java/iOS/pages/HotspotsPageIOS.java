package iOS.pages;/* Created by Ponomarenko Oleh on 29/12/16. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilites.Utilities.*;

public class HotspotsPageIOS extends IOSSetup {

    private By hotspotDescription;
    private By hotspotTitle;
    private By saveHotspotButton;
    private By tag;
    private By createHotspotButton;

    public void enterDescription(String keys) {
        sendKeys(this.hotspotDescription, keys);
        hideKeyboard();
    }

    public void enterHotspotTitle(String keys) {
        sendKeys(this.hotspotTitle, keys);
        hideKeyboard();
    }

    public void pressSaveHotspot() {
        waitAndTap(this.saveHotspotButton);
    }

    public void enterTag(String keys) {
        sendKeys(this.tag, keys);
        driver.getKeyboard().pressKey(Keys.ENTER);
        hideKeyboard();
    }

    public void pressCreateHotspotButton() throws InterruptedException {
        waitAndTap(this.createHotspotButton);
//        WebElement element = driver.findElement(By.id("android:id/message"));
//        if (element.getText() != null) {
//            System.out.println(element.getText());
//            waitAndTap(By.id("android:id/button1"));
//        }
        Thread.sleep(10000);
    }
}
