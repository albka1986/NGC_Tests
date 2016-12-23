package android.pages;

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

import static android.pages.DrawerPageAndroid.drawerAvatar;
import static utilites.Utilities.tapOn;
import static utilites.Utilities.waitForVisibilityOf;

public class MyProfilePageAndroid extends AndroidSetup {

    public static By logoutButton = By.id(APP_PACKAGE_NAME + "my_profile_logout");

    public void logout() {

        new DrawerPageAndroid().drawerOpen();

        waitForVisibilityOf(drawerAvatar);
        tapOn(drawerAvatar);

        waitForVisibilityOf(logoutButton);
        tapOn(logoutButton);
    }
}
