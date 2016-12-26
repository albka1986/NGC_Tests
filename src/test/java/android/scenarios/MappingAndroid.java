package android.scenarios;

import android.pages.DrawerPageAndroid;
import android.pages.MyProfilePageAndroid;
import android.pages.SignInPageAndroid;
import android.pages.SignUpPageAndroid;
import interfaces.Mapping;

import static android.pages.DrawerPageAndroid.*;
import static utilites.Utilities.*;

public class MappingAndroid implements Mapping {
    SignUpPageAndroid signUpPageAndroid = new SignUpPageAndroid();
    SignInPageAndroid signInPageAndroid = new SignInPageAndroid();
    DrawerPageAndroid drawerPageAndroid = new DrawerPageAndroid();
    MyProfilePageAndroid myProfilePageAndroid = new MyProfilePageAndroid();

    @Override
    public void openInfoSources() {
        openDrawer();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            swipingVerticalToDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitAndTap(directoriesButton);
    }

    @Override
    public void openMyPosts() {
        openDrawer();
        waitAndTap(drawerPageAndroid.myPostsButton);
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
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        waitAndTap(drawerPageAndroid.searchButton);
    }

    @Override
    public void signUp(String email, String password, String name, String location, boolean photo) throws InterruptedException {
        SignUpPageAndroid signUpPageAndroid = new SignUpPageAndroid();
        signUpPageAndroid.registrationByData(email, password, name, location, photo);
    }

    @Override
    public void signIn(String email, String password) {
        signInPageAndroid.signIn(email, password);
    }

    @Override
    public void logout() throws InterruptedException {
        myProfilePageAndroid.logout();
    }

    @Override
    public void openMyProfile() {
        openDrawer();
        waitForVisibilityOf(drawerPageAndroid.drawerAvatar);
        tapOn(drawerPageAndroid.drawerAvatar);
    }

    @Override
    public void openDrawer() {
        drawerPageAndroid.drawerOpen();
    }

    @Override
    public void openSignIn() {
        waitAndTap(signUpPageAndroid.signInButton);
    }

    @Override
    public void openSignUp() {
        waitAndTap(signInPageAndroid.signUpButton);
    }
}
