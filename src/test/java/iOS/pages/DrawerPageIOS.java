package iOS.pages;

import config.MyListener;
import iOS.configDevice.IOSSetup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import static iOS.pages.MyProfilePageIOS.logoutButton;
import static utilites.Utilities.*;

public class DrawerPageIOS extends IOSSetup {

    public static By drawerAvatar;
    public static By searchButton = By.name("Search");
    public static By myPostsButton = By.name("My Posts");
    public static By hotspotsButton = By.name("Hotspots");
    public static By friendsButton = By.name("Friends");
    public static By campsButton = By.name("Camps");
    public static By eventsButton = By.name("Events");
    public static By settingsButton = By.name("Settings");
    public static By directoriesButton = By.name("DirectoriesIOS");
    public static By otherSourcesButton = By.name("Other Sources");
    public static By drawerButton = MobileBy.id("hamburger");
    private By topRated = By.name("Top Rated");

    public void drawerOpen() {
        waitAndTap(drawerButton);
    }

    public void openOtherSources() {
        drawerOpen();
        swipingToTopIOS();
        waitAndTap(otherSourcesButton);
    }

    public void openDirectories() {
        drawerOpen();
        waitAndTap(directoriesButton);
    }

    public void openMyPosts() {
        drawerOpen();
        waitAndTap(myPostsButton);

    }

    public void openCamps() {
        drawerOpen();
        waitAndTap(campsButton);

    }

    public void openHotspots() {
        drawerOpen();
        waitAndTap(hotspotsButton);
        AppiumDriver driver = MyListener.getDriver();
        String allow = "Allow \"Camp Dev\" to access your location while you use the app?";
    }

    public void openEvents() {
        drawerOpen();
        waitAndTap(eventsButton);
    }

    public void openFriends() {
        drawerOpen();
        waitAndTap(friendsButton);
    }

    public void openSettings() {
        drawerOpen();
        swipingToTopIOS();
        waitAndTap(settingsButton);

    }

    public void openSearch() {
        drawerOpen();
        waitAndTap(searchButton);
    }

    public void openMyProfile() {
        AppiumDriver driver = MyListener.getDriver();
        drawerOpen();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.tap(1, 100, 100, 500); //tap on drawerAvatar

        waitForVisibilityOf(logoutButton);
    }

    public void tapOnAvatar() {
        driver.tap(1, 100, 100, 500);
    }

    public void openTopRated() {
        drawerOpen();
        swipingToTopIOS();
        waitAndTap(topRated);
    }
}
