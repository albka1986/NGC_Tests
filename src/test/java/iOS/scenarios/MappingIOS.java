package iOS.scenarios;/* Created by Ponomarenko Oleh on 23/12/16. */

import iOS.pages.DrawerPageIOS;
import iOS.pages.MyProfilePageIOS;
import iOS.pages.SignInPageIOS;
import iOS.pages.SignUpPageIOS;
import interfaces.Mapping;

public class MappingIOS implements Mapping {

    SignInPageIOS signInPageIOS = new SignInPageIOS();
    SignUpPageIOS signUpPageIOS = new SignUpPageIOS();
    DrawerPageIOS drawerPageIOS = new DrawerPageIOS();
    MyProfilePageIOS myProfilePageIOS = new MyProfilePageIOS();

    @Override
    public void signUpByData(String email, String password, String name, String location, boolean photo) throws InterruptedException {
        SignUpPageIOS signUpPageIOS = new SignUpPageIOS();
        //TODO: paste a variable photo to the method when a method photo will be ready
        signUpPageIOS.signUpByData(email, password, name, location, false);
    }

    @Override
    public void signIn(String email, String password) {
        signInPageIOS.signIn("", "");
    }

    @Override
    public void logout() throws InterruptedException {
        myProfilePageIOS.logout();
    }

    @Override
    public void openMyProfile() throws InterruptedException {
        drawerPageIOS.openMyProfile();
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
    public void openTorRatedDispensaries() {
        drawerPageIOS.openTopRated();
    }

    @Override
    public void openTopRatedStores() {

    }

    @Override
    public void openTopRatedProducers() {

    }

    @Override
    public void openTopRatedClinics() {

    }

    @Override
    public void openTopRatedDoctors() {

    }

    @Override
    public void openTopRated() {

    }

    @Override
    public void confirmBack() {

    }

    @Override
    public void openApplicationForm() {

    }

    @Override
    public void openDispensaries() throws InterruptedException {

    }

    @Override
    public void openBudtenders() throws InterruptedException {

    }

    @Override
    public void openOnlineStores() throws InterruptedException {

    }

    @Override
    public void openLicensedProducers() throws InterruptedException {

    }

    @Override
    public void openPainClinics() throws InterruptedException {

    }

    @Override
    public void openDoctors() throws InterruptedException {

    }

    @Override
    public void back() {

    }

    @Override
    public void openOtherSources() {
        //TODO: skipped due to a bug #3943
        drawerPageIOS.openOtherSources();
    }

    @Override
    public void openDirectories() {
        drawerPageIOS.openDirectories();
    }

    @Override
    public void openMyPosts() {
        drawerPageIOS.openMyPosts();
    }

    @Override
    public void openCamps() {
        drawerPageIOS.openCamps();
    }

    @Override
    public void openHotspots() {
        drawerPageIOS.openHotspots();
    }

    @Override
    public void openEvents() {
        //TODO: при переходе на Events, зависает приложение (только на Симуляторе!!!).
        //drawerPageIOS.openEvents();
    }

    @Override
    public void openFriends() {
        drawerPageIOS.openFriends();
    }

    @Override
    public void openSettings() throws InterruptedException {
        drawerPageIOS.openSettings();
    }

    @Override
    public void openSearch() throws InterruptedException {
        drawerPageIOS.openSearch();
    }
}
