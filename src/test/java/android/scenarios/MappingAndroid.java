package android.scenarios;

import android.pages.*;
import interfaces.Mapping;

import static utilites.Utilities.waitAndTap;
import static utilites.Validation.*;

public class MappingAndroid implements Mapping {
    SignUpPageAndroid signUpPageAndroid = new SignUpPageAndroid();
    SignInPageAndroid signInPageAndroid = new SignInPageAndroid();
    DrawerPageAndroid drawerPageAndroid = new DrawerPageAndroid();
    MyProfilePageAndroid myProfilePageAndroid = new MyProfilePageAndroid();
    DirectoriesPageAndroid directoriesPageAndroid = new DirectoriesPageAndroid();
    NavigationAndroid navigationAndroid = new NavigationAndroid();

    @Override
    public void mapper() throws InterruptedException {
        String email = randomValidEmail();
        String password = randomValidPassword();
        String name = randomValidName();
        String location = "";
        boolean photo = true;

        openSignUp();
        openSignIn();
        signUpByData(email, password, name, location, photo);
        logout();
        signIn(email, password);
        openMyProfile();
        openSearch();
        openMyPosts();
        openHotspots();
        openFriends();
        openCamps();
        openEvents();

        openDirectories();

        directoriesPageAndroid.openDoctors();
        navigationAndroid.back();

        directoriesPageAndroid.openPainClinics();
        navigationAndroid.back();

        directoriesPageAndroid.openLicensedProducers();
        navigationAndroid.back();

        directoriesPageAndroid.openOnlineStores();
        navigationAndroid.back();

        directoriesPageAndroid.openDispensaries();
        navigationAndroid.back();

        directoriesPageAndroid.openBudtenders();
        directoriesPageAndroid.openApplicationForm();
        navigationAndroid.back();
        directoriesPageAndroid.confirmBack();
        navigationAndroid.back();

        openSettings();
        openOtherSources();

        Thread.sleep(3000);

        logout();
    }

    @Override
    public void openOtherSources() {
        //TODO: Here was a bug #3942
        drawerPageAndroid.openInfoSources();
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
        drawerPageAndroid.openEvents();
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
