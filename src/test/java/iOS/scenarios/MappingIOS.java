package iOS.scenarios;/* Created by Ponomarenko Oleh on 23/12/16. */

import iOS.pages.*;
import interfaces.Mapping;

public class MappingIOS implements Mapping {

    SignInPageIOS signInPageIOS = new SignInPageIOS();
    SignUpPageIOS signUpPageIOS = new SignUpPageIOS();
    DrawerPageIOS drawerPageIOS = new DrawerPageIOS();
    MyProfilePageIOS myProfilePageIOS = new MyProfilePageIOS();
    TopRatedPageIOS topRatedPageIOS = new TopRatedPageIOS();
    DirectoriesIOS directoriesIOS = new DirectoriesIOS();
    NavigationIOS navigationIOS = new NavigationIOS();


    @Override
    public void signUpByData(String email, String password, String name, String location, boolean photo) throws InterruptedException {
        //TODO: paste a variable photo to the method when a method photo will be ready
        signUpPageIOS.signUpByData(email, password, name, location, false);
    }

    @Override
    public void signIn(String email, String password) throws InterruptedException {
        signInPageIOS.signInByData(email, password);
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
    public void openTorRatedDispensaries() throws InterruptedException {
        topRatedPageIOS.openTorRatedDispensaries();
        Thread.sleep(2000);
        back();
    }

    @Override
    public void openTopRatedStores() throws InterruptedException {
        topRatedPageIOS.openTopRatedStores();
        Thread.sleep(2000);
        back();
    }

    @Override
    public void openTopRatedProducers() throws InterruptedException {
        //TODO: the method is  skipped while a bug #4066
        /*topRatedPageIOS.openTopRatedProducers();
        Thread.sleep(2000);
        back();*/
    }

    @Override
    public void openTopRatedClinics() throws InterruptedException {
        //TODO: the method is  skipped while a bug #4066
       /* topRatedPageIOS.openTopRatedClinics();
        Thread.sleep(2000);
        back();*/
    }

    @Override
    public void openTopRatedDoctors() throws InterruptedException {
        topRatedPageIOS.openTopRatedDoctors();
        Thread.sleep(2000);
        back();
    }

    @Override
    public void openTopRated() {
        drawerPageIOS.openTopRated();
    }

    @Override
    public void confirmBack() {
        directoriesIOS.confirmBack();
    }

    @Override
    public void openApplicationForm() throws InterruptedException {
        directoriesIOS.openApplicationForm();
        back();
        confirmBack();
        back();
    }

    @Override
    public void openDispensaries() throws InterruptedException {
        directoriesIOS.openDispensaries();
        Thread.sleep(2000);
        back();
    }

    @Override
    public void openBudtenders() throws InterruptedException {
        directoriesIOS.openBudtenders();
        Thread.sleep(2000);
    }

    @Override
    public void openOnlineStores() throws InterruptedException {
        directoriesIOS.openOnlineStores();
        Thread.sleep(2000);
        back();
    }

    @Override
    public void openLicensedProducers() throws InterruptedException {
        directoriesIOS.openLicensedProducers();
        Thread.sleep(2000);
        back();
    }

    @Override
    public void openPainClinics() throws InterruptedException {
        directoriesIOS.openPainClinics();
        Thread.sleep(2000);
        back();
    }

    @Override
    public void openDoctors() throws InterruptedException {
        directoriesIOS.openDoctors();
        Thread.sleep(2000);
        back();
    }

    @Override
    public void back() throws InterruptedException {
        navigationIOS.back();
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
