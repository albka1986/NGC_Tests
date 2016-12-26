package iOS.pages;

import iOS.configDevice.IOSSetup;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import static utilites.Utilities.waitAndTap;
import static utilites.Utilities.waitForClickabilityOf;

public class DrawerPageIOS extends IOSSetup {

    public static By drawerAvatar;
    public static By searchButton = By.name("Search");
    public static By myPostsButton = By.name("My Posts");
    public static By hotspotsButton = By.name("Hotspots");
    public static By friendsButton = By.name("Friends");
    public static By campsButton = By.name("Camps");
    public static By eventsButton = By.name("Events");
    public static By settingsButton = By.name("Settings");
    public static By directoriesButton = By.name("Directories");
    public static By infoSourcesButton = By.name("Info Sources");
    public By drawerButton = MobileBy.id("hamburger");

    public void drawerOpen() {
        waitAndTap(drawerButton);
        waitForClickabilityOf(searchButton);
    }
}
