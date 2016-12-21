package interfaces;

import io.appium.java_client.AppiumDriver;

import static config.MyListener.getDriver;

public interface Mapping {

    default void mapper(String email, String password) throws InterruptedException {

        AppiumDriver driver = getDriver();

        signIn(email, password);
        openDrawer();
        openMyProfile();
        openEditProfile();
        saveChangesOnEditProfile();
        logout();
        openSignIn();
        signUp();
        openDrawer();
        openSearch();
        openSearchResult();
        openUserProfile();
        navBarBack();
        navBarBack();
        openDrawer();
        openSettings();
        openDrawer();
        openMyFriends();
        openDrawer();
        openEventList();
        //TODO: openEventDetails
        openDrawer();
        openAboutUs();
        openDrawer();
        openHotSpots();
        openCreateHotspot();
        openHotspotDetails();
        openHotspotEdit();
        saveChangesOnHotspot();
        navBarBack();
        openDrawer();
        openCamps();
        //TODO: addNewCamp();
        //TODO: openCampDetails();
        navBarBack();
        logout();
    }

    void addNewCamp();

    void openCamps();

    void saveChangesOnHotspot();

    void openHotspotEdit();

    void openHotspotDetails();

    void openCreateHotspot();

    void openHotSpots();

    void openAboutUs();

    void openEventList();

    void openMyFriends();


    void openSettings();

    void navBarBack();

    void openUserProfile();

    void openSearchResult();

    void openSearch();

    void signUp();

    void signIn(String email, String password);

    void logout() throws InterruptedException;

    void saveChangesOnEditProfile();

    void openEditProfile();

    void openMyProfile() throws InterruptedException;

    void openDrawer() throws InterruptedException;

    void openSignIn();
}
