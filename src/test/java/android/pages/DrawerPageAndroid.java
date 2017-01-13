package android.pages;/* Created by Ponomarenko Oleh on 07/11/16. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.*;

public class DrawerPageAndroid extends AndroidSetup {

    public static By drawerButton = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]");
    public static By drawerAvatar = By.id(APP_PACKAGE_NAME + "drawer_avatar");
    public static By searchButton = By.id(APP_PACKAGE_NAME + "drawer_search_btn");
    public static By myPostsButton = By.id(APP_PACKAGE_NAME + "drawer_posts_btn");
    public static By hotspotsButton = By.id(APP_PACKAGE_NAME + "drawer_hotspots_btn");
    public static By friendsButton = By.id(APP_PACKAGE_NAME + "drawer_friends_btn");
    public static By campsButton = By.id(APP_PACKAGE_NAME + "drawer_camps_btn");
    public static By eventsButton = By.id(APP_PACKAGE_NAME + "drawer_events_btn");
    public static By settingsButton = By.id(APP_PACKAGE_NAME + "drawer_settings_btn");
    public static By directoriesButton = By.id(APP_PACKAGE_NAME + "drawer_directories_btn");
    public static By otherSourcesButton = By.id(APP_PACKAGE_NAME + "drawer_other_btn");


    public void drawerOpen() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int tapX = (int) (driver.manage().window().getSize().getWidth() * 0.08);
        int tapY = (int) (driver.manage().window().getSize().getHeight() * 0.08);
        driver.tap(1, tapX, tapY, 200);
    }

    public void openInfoSources() {
        drawerOpen();


        try {
            Thread.sleep(3000);
            swipingToTop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitAndTap(otherSourcesButton);
    }

    public void openDirectories() {
        drawerOpen();
        try {
            Thread.sleep(2000);
            swipingToTop();
        } catch (InterruptedException e) {
        }
        waitAndTap(this.directoriesButton);
    }

    public void openMyPosts() {
        drawerOpen();
        waitAndTap(this.myPostsButton);
    }

    public void openCamps() {
        drawerOpen();
        waitAndTap(campsButton);
    }

    public void openHotspots() {
        drawerOpen();
        waitAndTap(hotspotsButton);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            swipingToTop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitAndTap(settingsButton);
    }

    public void openSearch() {
        drawerOpen();
        waitAndTap(this.searchButton);
    }

    public void openMyProfile() {
        drawerOpen();
        waitForVisibilityOf(this.drawerAvatar);
        tapOn(this.drawerAvatar);
    }

}
