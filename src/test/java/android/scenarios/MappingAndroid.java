package android.scenarios;

import android.pages.DrawerPageAndroid;
import android.pages.MyProfilePageAndroid;
import android.pages.SignInPageAndroid;
import interfaces.Mapping;

import static utilites.Utilities.tapOn;
import static utilites.Utilities.waitForVisibilityOf;

public class MappingAndroid implements Mapping {

    SignInPageAndroid signInPage = new SignInPageAndroid();
    DrawerPageAndroid drawerPage = new DrawerPageAndroid();
    MyProfilePageAndroid myProfilePage = new MyProfilePageAndroid();

    @Override
    public void addNewCamp() {

    }

    @Override
    public void openCamps() {

    }

    @Override
    public void saveChangesOnHotspot() {

    }

    @Override
    public void openHotspotEdit() {

    }

    @Override
    public void openHotspotDetails() {

    }

    @Override
    public void openCreateHotspot() {

    }

    @Override
    public void openHotSpots() {

    }

    @Override
    public void openAboutUs() {

    }

    @Override
    public void openEventList() {

    }

    @Override
    public void openMyFriends() {

    }

    @Override
    public void openSettings() {

    }

    @Override
    public void navBarBack() {

    }

    @Override
    public void openUserProfile() {

    }

    @Override
    public void openSearchResult() {

    }

    @Override
    public void openSearch() {

    }

    @Override
    public void signUp() {

    }

    @Override
    public void signIn(String email, String password) {
        signInPage.signIn(email, password);
    }

    @Override
    public void logout() throws InterruptedException {
        myProfilePage.logout();
    }

    @Override
    public void saveChangesOnEditProfile() {

    }

    @Override
    public void openEditProfile() {
    }

    @Override
    public void openMyProfile() throws InterruptedException {
        drawerPage.drawerOpen();
        waitForVisibilityOf(drawerPage.drawerAvatar);
        tapOn(drawerPage.drawerAvatar);

    }

    @Override
    public void openDrawer() throws InterruptedException {
        drawerPage.drawerOpen();
    }

    @Override
    public void openSignIn() {

    }
}
