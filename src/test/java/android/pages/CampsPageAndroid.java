package android.pages;/* Created by Ponomarenko Oleh on 28/12/16. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.sendKeys;
import static utilites.Utilities.tapOn;
import static utilites.Validation.randomValidName;

public class CampsPageAndroid extends AndroidSetup {
    public By createCampButton = By.id(APP_PACKAGE_NAME + "add_camp_fab");
    public By campTitle = By.id(APP_PACKAGE_NAME + "add_camp_title");
    public By startMessage = By.id(APP_PACKAGE_NAME + "add_camp_topic");
    private By saveCampButton = By.id(APP_PACKAGE_NAME + "add_edit_camp");
    private By pickCampCategory = By.id("android:id/text1");
    private By chooseCategory = By.xpath("//android.widget.ListView[1]/android.widget.CheckedTextView[2]");

    public void enterCampTitle() {
        //TODO: generate method randomCampTitle();
        String campTitle = randomValidName();
        System.out.println("Camp Title: " + campTitle);
        sendKeys(this.campTitle, campTitle);
    }

    public void enterStartMessage() {
        //TODO: generate method randomStartMessage();
        String startMessage = randomValidName();
        System.out.printf("Start Message: " + startMessage);
        sendKeys(this.startMessage, startMessage);
    }

    public void pressSaveCamp() {
        tapOn(this.saveCampButton);
    }

    public void selectCampCategory() {
        tapOn(this.pickCampCategory);
        tapOn(this.chooseCategory);
    }

    public void pressCreateCamp() {
        tapOn(this.createCampButton);
    }
}
