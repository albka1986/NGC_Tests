package android.pages;/* Created by Ponomarenko Oleh on 12/01/17. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utilites.Utilities.findListOfElementsById;
import static utilites.Utilities.waitAndTap;

public class DirectoriesPageAndroid extends AndroidSetup {

    private final String doctors = "Doctors";
    private final String painClinics = "Pain Clinics";
    private final String licensedProducers = "Licensed producers";
    private final String onlineStores = "Online stores";
    private final String dispensaries = "Dispensaries";
    private final String budtenders = "Budtenders";
    By budtenders_upload = By.id(APP_PACKAGE_NAME + "budtenders_upload");
    By allowBack = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[2]");
    private String listOfElements = "android:id/text1";

    public void openDoctors() throws InterruptedException {
        Thread.sleep(2000);
        findElementByTextOnListAndClick(doctors);
        Thread.sleep(2000);
    }

    public void openPainClinics() throws InterruptedException {
        Thread.sleep(2000);
        findElementByTextOnListAndClick(painClinics);
        Thread.sleep(2000);
    }

    public void openLicensedProducers() throws InterruptedException {
        Thread.sleep(2000);
        findElementByTextOnListAndClick(licensedProducers);
        Thread.sleep(2000);
    }

    public void openOnlineStores() throws InterruptedException {
        Thread.sleep(2000);
        findElementByTextOnListAndClick(onlineStores);
        Thread.sleep(2000);
    }

    public void openDispensaries() throws InterruptedException {
        Thread.sleep(2000);
        findElementByTextOnListAndClick(dispensaries);
        Thread.sleep(2000);
    }

    public void openBudtenders() throws InterruptedException {
        Thread.sleep(2000);
        findElementByTextOnListAndClick(budtenders);
        Thread.sleep(2000);
    }

    public void openApplicationForm() {
        waitAndTap(budtenders_upload);
    }

    private void findElementByTextOnListAndClick(String text) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> elements = findListOfElementsById(listOfElements);
        m:
        for (WebElement element : elements) {
            if (element.getText().equals(text)) {
                element.click();
                System.out.println("Clicked on: " + text);
                break m;
            }
        }
    }

    public void confirmBack() {
        waitAndTap(allowBack);
    }


}
