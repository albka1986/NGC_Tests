package android.scenarios;

import android.pages.DrawerPageAndroid;
import android.pages.MyProfilePageAndroid;
import android.pages.SignInPageAndroid;
import android.pages.SignUpPageAndroid;
import interfaces.Mapping;

import static utilites.Utilities.waitAndTap;

public class MappingAndroid implements Mapping {
    SignUpPageAndroid signUpPageAndroid = new SignUpPageAndroid();
    SignInPageAndroid signInPageAndroid = new SignInPageAndroid();
    DrawerPageAndroid drawerPageAndroid = new DrawerPageAndroid();
    MyProfilePageAndroid myProfilePageAndroid = new MyProfilePageAndroid();

    @Override
    public void openOtherSources() {
        //TODO: skipped due to a bug #3942
//        drawerPageAndroid.openInfoSources();
    }

    @Override
    public void openDirectories() {
        drawerPageAndroid.openDirectories();
    }

    @Override
    public void openMyPosts() {
        drawerPageAndroid.openMyPosts();
    }

    @Override
    public void openCamps() {
        drawerPageAndroid.openCamps();
    }

    @Override
    public void openHotspots() {
        drawerPageAndroid.openHotspots();
    }


    @Override
    public void openEvents() {
        drawerPageAndroid.openDirectories();
    }

    @Override
    public void openFriends() {
        drawerPageAndroid.openFriends();
    }

    @Override
    public void openSettings() {
        drawerPageAndroid.openSettings();
    }

    @Override
    public void openSearch() {
        drawerPageAndroid.openSearch();
    }

    @Override
    public void signUpByData(String email, String password, String name, String location, boolean photo) throws InterruptedException {
        signUpPageAndroid.signUpByData(email, password, name, location, photo);
    }

    @Override
    public void signIn(String email, String password) {
        signInPageAndroid.signInByData(email, password);
    }

    @Override
    public void logout() throws InterruptedException {
        myProfilePageAndroid.logout();
    }

    @Override
    public void openMyProfile() {
        drawerPageAndroid.openMyProfile();
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
