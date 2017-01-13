package android.scenarios;

import android.pages.*;
import interfaces.Mapping;

import static utilites.Utilities.waitAndTap;

public class MappingAndroid implements Mapping {
    SignUpPageAndroid signUpPageAndroid = new SignUpPageAndroid();
    SignInPageAndroid signInPageAndroid = new SignInPageAndroid();
    DrawerPageAndroid drawerPageAndroid = new DrawerPageAndroid();
    MyProfilePageAndroid myProfilePageAndroid = new MyProfilePageAndroid();
    DirectoriesPageAndroid directoriesPageAndroid = new DirectoriesPageAndroid();
    NavigationAndroid navigationAndroid = new NavigationAndroid();

    @Override
    public void openTorRatedDispensaries() {
        //TODO: sprint #7
    }

    @Override
    public void openTopRatedStores() {
        //TODO: sprint #7
    }

    @Override
    public void openTopRatedProducers() {
        //TODO: sprint #7
    }

    @Override
    public void openTopRatedClinics() {
        //TODO: sprint #7
    }

    @Override
    public void openTopRatedDoctors() {
        //TODO: sprint #7
    }

    @Override
    public void openTopRated() {
        drawerPageAndroid.openTopRated();
    }

    @Override
    public void confirmBack() {
        directoriesPageAndroid.confirmBack();
    }

    @Override
    public void openApplicationForm() {
        directoriesPageAndroid.openApplicationForm();
    }

    @Override
    public void openDispensaries() throws InterruptedException {
        directoriesPageAndroid.openDispensaries();
    }

    @Override
    public void openBudtenders() throws InterruptedException {
        directoriesPageAndroid.openBudtenders();
    }

    @Override
    public void openOnlineStores() throws InterruptedException {
        directoriesPageAndroid.openOnlineStores();
    }

    @Override
    public void openLicensedProducers() throws InterruptedException {
        directoriesPageAndroid.openLicensedProducers();
    }

    @Override
    public void openPainClinics() throws InterruptedException {
        directoriesPageAndroid.openPainClinics();
    }

    @Override
    public void openDoctors() throws InterruptedException {
        directoriesPageAndroid.openDoctors();
    }

    @Override
    public void back() {
        navigationAndroid.back();
    }

    @Override
    public void openOtherSources() {
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
