package interfaces;

import static utilites.Validation.*;

public interface Mapping {

    default void mapper() throws InterruptedException {

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

        openDoctors();
        back();

        openPainClinics();
        back();

        openLicensedProducers();
        back();

        openOnlineStores();
        back();

        openDispensaries();
        back();

        openBudtenders();
        openApplicationForm();
        back();
        confirmBack();
        back();

        openTopRated();
        openTopRatedDoctors();
        openTopRatedClinics();
        openTopRatedProducers();
        openTopRatedStores();
        openTorRatedDispensaries();

        openSettings();

        openOtherSources();


        logout();

    }

    void openTorRatedDispensaries();

    void openTopRatedStores();

    void openTopRatedProducers();

    void openTopRatedClinics();

    void openTopRatedDoctors();

    void openTopRated();

    void confirmBack();

    void openApplicationForm();

    void openDispensaries() throws InterruptedException;

    void openBudtenders() throws InterruptedException;

    void openOnlineStores() throws InterruptedException;

    void openLicensedProducers() throws InterruptedException;

    void openPainClinics() throws InterruptedException;

    void openDoctors() throws InterruptedException;

    void back();

    void openOtherSources();

    void openDirectories();

    void openMyPosts();

    void openCamps();

    void openHotspots();

    void openEvents();

    void openFriends();

    void openSettings() throws InterruptedException;

    void openSearch() throws InterruptedException;

    void signUpByData(String email, String password, String name, String location, boolean photo) throws InterruptedException;

    void signIn(String email, String password);

    void logout() throws InterruptedException;

    void openMyProfile() throws InterruptedException;

    void openDrawer() throws InterruptedException;

    void openSignIn();

    void openSignUp();
}
