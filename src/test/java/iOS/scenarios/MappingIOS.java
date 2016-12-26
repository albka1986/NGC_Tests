package iOS.scenarios;/* Created by Ponomarenko Oleh on 23/12/16. */

import config.MyListener;
import iOS.pages.DrawerPageIOS;
import iOS.pages.MyProfilePageIOS;
import iOS.pages.SignInPageIOS;
import iOS.pages.SignUpPageIOS;
import interfaces.Mapping;
import io.appium.java_client.AppiumDriver;

import static iOS.pages.DrawerPageIOS.*;
import static utilites.Utilities.swipingVerticalToTop;
import static utilites.Utilities.waitAndTap;

public class MappingIOS implements Mapping {

    SignInPageIOS signInPageIOS = new SignInPageIOS();
    SignUpPageIOS signUpPageIOS = new SignUpPageIOS();
    DrawerPageIOS drawerPageIOS = new DrawerPageIOS();
    MyProfilePageIOS myProfilePageIOS = new MyProfilePageIOS();

    @Override
    public void openInfoSources() {
        openDrawer();
        try {
            swipingVerticalToTop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitAndTap(infoSourcesButton);
    }

    @Override
    public void openDirectories() {
        openDrawer();
        waitAndTap(directoriesButton);
    }

    @Override
    public void openMyPosts() {
        openDrawer();
        waitAndTap(myPostsButton);

    }

    @Override
    public void openCamps() {
        openDrawer();
        waitAndTap(campsButton);

    }

    @Override
    public void openHotspots() {
        openDrawer();
        waitAndTap(hotspotsButton);
        AppiumDriver driver = MyListener.getDriver();
        String allow = "Allow \"Camp Dev\" to access your location while you use the app?";
    }

    @Override
    public void openEvents() {
        openDrawer();
        waitAndTap(eventsButton);
    }

    @Override
    public void openFriends() {
        openDrawer();
        waitAndTap(friendsButton);
    }

    @Override
    public void openSettings() {
        openDrawer();
        try {
            swipingVerticalToTop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitAndTap(settingsButton);

    }

    @Override
    public void openSearch() {
        openDrawer();
        waitAndTap(searchButton);
    }

    @Override
    public void signUp(String email, String password, String name, String location, boolean photo) throws InterruptedException {

    }

    @Override
    public void signIn(String email, String password) {
        signInPageIOS.signInByData("", "");
    }

    @Override
    public void logout() throws InterruptedException {
        myProfilePageIOS.logout();
    }

    @Override
    public void openMyProfile() throws InterruptedException {

    }

    @Override
    public void openDrawer() {
        drawerPageIOS.drawerOpen();
    }

    @Override
    public void openSignIn() {
        signUpPageIOS.openSignIn();
    }

    @Override
    public void openSignUp() {
        signInPageIOS.openSignUp();
    }

    @Override
    public void mapper() throws InterruptedException {
        String email = "";
        String password = "";
        signIn(email, password);
        openMyProfile();
        openSearch();
        openMyPosts();
        openHotspots();
        openFriends();
        openCamps();
        openEvents();
        openSettings();
        openDirectories();
        openInfoSources();

        logout();
    }
}
