package iOS.pages;/* Created by Ponomarenko Oleh on 06/01/17. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.waitAndTap;

public class DirectoriesIOS extends IOSSetup {


    private By doctors = By.name("Doctors");
    private By painClinics = By.name("Pain Clinics");
    private By licensedProducers = By.name("Licensed producers");
    private By onlineStores = By.name("Online stores");
    private By dispensaries = By.name("Dispensaries");
    private By budtenders = By.name("Budtenders");
    private By likeButton = By.name("like");
    private By applicationFormButton = By.name("activeButton");
    private By confirmBack = By.name("Yes");


    public void pressLikeButton() {
        waitAndTap(likeButton);
    }

    public void selectObject(String name) {
        waitAndTap(By.name(name));
    }

    public void selectCategory(String category) {
        waitAndTap(By.name(category));
    }

    public void openBudtenders() {
        waitAndTap(budtenders);
    }

    public void openOnlineStores() {
        waitAndTap(onlineStores);
    }

    public void openLicensedProducers() {
        waitAndTap(licensedProducers);
    }

    public void openPainClinics() {
        waitAndTap(painClinics);
    }

    public void openDoctors() {
        waitAndTap(doctors);
    }

    public void confirmBack() {
        waitAndTap(confirmBack);
    }

    public void openApplicationForm() {
        waitAndTap(applicationFormButton);
    }

    public void openDispensaries() {
        waitAndTap(dispensaries);
    }
}
