package iOS.pages;/* Created by Ponomarenko Oleh on 28/12/16. */

import org.openqa.selenium.By;

import static utilites.Utilities.*;
import static utilites.Validation.randomValidCampTitle;

public class CampsPageIOS {
    public By createCampButton = By.name("plusIcon");
    public By startMessage = xpathBuilderByValue("Start the conversation...");
    public By campTitle = xpathBuilderByValue("Camp title");
    public By saveCampButton = By.name("Create Camp");
    public By pickCampCategory = By.name("Pick a category");
    public By confirmCategory = By.name("Done");

    public void enterStartMessage() {
        //TODO: bug #3934
//        String keys = randomValidCampStartMessage();
        String keys = "Test";
        sendKeys(this.startMessage, keys);
    }

    public void pressSaveCamp() {
        waitAndTap(this.saveCampButton);
    }

    public void enterCampTitle() {
        String campTitle = randomValidCampTitle();
        sendKeys(this.campTitle, campTitle);
    }

    public void pressCreateCamp() {
        waitAndTap(this.createCampButton);
    }

    public void selectCampCategory() {
        waitAndTap(this.pickCampCategory);
        waitAndTap(this.confirmCategory);
    }
}
