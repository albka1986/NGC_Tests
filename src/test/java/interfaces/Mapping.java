package interfaces;

import static utilites.Validation.*;

public interface Mapping {

    default void mapper() throws InterruptedException {

        String email = randomValidEmail();
        String password = randomValidPassword();
        String name = randomValidName();
        String location = "";

        openSignUp();
        openSignIn();
        signUp(email, password, name, location, true);
        logout();
        signIn(email, password);
        openMyProfile();
        openSearch();
        openMyPosts();
        openHotspots();
        openMyFriends();
        openCamps();
        openEvents();
        openSettings();
        openDirectories();
        openInfoSources();

        logout();

    }

    void openInfoSources();

    void openDirectories();

    void openMyPosts();

    void openCamps();

    void openHotspots();

    void openEvents();

    void openMyFriends();

    void openSettings();

    void openSearch() throws InterruptedException;

    void signUp(String email, String password, String name, String location, boolean photo) throws InterruptedException;


    void signIn(String email, String password);

    void logout() throws InterruptedException;

    void openMyProfile() throws InterruptedException;

    void openDrawer() throws InterruptedException;

    void openSignIn();

    void openSignUp();
}
