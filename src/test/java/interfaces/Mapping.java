package interfaces;

import model.User;

import static utilites.Validation.*;

public interface Mapping {

    default void mapper() throws InterruptedException {
        User user = new User();
        user.setEmail(randomValidEmail());
        user.setPassword(randomValidPassword());
        user.setName(randomValidName());
        user.setLocation("");
        boolean photo = true;

        openSignUp();
        openSignIn();
        signUpByData(user.getEmail(), user.getPassword(), user.getName(), user.getLocation(), photo);
        logout();
        signIn(user.getEmail(), user.getPassword());
        openMyProfile();
        openSearch();
        openMyPosts();
        openHotspots();
        openFriends();
        openCamps();
        openEvents();

        openDirectories();
        openDoctors();
        openPainClinics();
        openLicensedProducers();
        openOnlineStores();
        openDispensaries();
        openBudtenders();
        openApplicationForm();

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

    void openTorRatedDispensaries() throws InterruptedException;

    void openTopRatedStores() throws InterruptedException;

    void openTopRatedProducers() throws InterruptedException;

    void openTopRatedClinics() throws InterruptedException;

    void openTopRatedDoctors() throws InterruptedException;

    void openTopRated();

    void confirmBack();

    void openApplicationForm() throws InterruptedException;

    void openDispensaries() throws InterruptedException;

    void openBudtenders() throws InterruptedException;

    void openOnlineStores() throws InterruptedException;

    void openLicensedProducers() throws InterruptedException;

    void openPainClinics() throws InterruptedException;

    void openDoctors() throws InterruptedException;

    void back() throws InterruptedException;

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

    void signIn(String email, String password) throws InterruptedException;

    void logout() throws InterruptedException;

    void openMyProfile() throws InterruptedException;

    void openDrawer() throws InterruptedException;

    void openSignIn();

    void openSignUp();
}
