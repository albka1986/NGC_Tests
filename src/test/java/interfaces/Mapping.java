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
        openSettings();
        openOtherSources();

        logout();

    }

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
