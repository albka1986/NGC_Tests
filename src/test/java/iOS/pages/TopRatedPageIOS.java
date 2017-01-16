package iOS.pages;/* Created by Ponomarenko Oleh on 13/01/17. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.waitAndTap;

public class TopRatedPageIOS extends AndroidSetup {
    private By onlineStores = By.name("Online stores");
    private By licensedProducers = By.name("Licensed producers");
    private By painClinics = By.name("Pain Clinics");
    private By doctors = By.name("Doctors");
    private By dispensaries = By.name("Dispensaries");

    public void openTopRatedStores() {
        waitAndTap(onlineStores);
    }

    public void openTopRatedProducers() {
        waitAndTap(licensedProducers);
    }

    public void openTopRatedClinics() {

        waitAndTap(painClinics);
    }

    public void openTopRatedDoctors() {
        waitAndTap(doctors);
    }

    public void openTorRatedDispensaries() {
        waitAndTap(dispensaries);
    }
}
