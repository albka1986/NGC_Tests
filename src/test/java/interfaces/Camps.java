package interfaces;

import static utilites.Utilities.hideKeyboard;


public interface Camps {


    default void createCamp(int amount) throws InterruptedException {
        validRandomSignUp();
        openCamps();
        for (int i = 0; i < amount; i++) {
            addCamp();
        }
        logout();
    }

    void logout() throws InterruptedException;

    void validRandomSignUp() throws InterruptedException;

    default void addCamp() {
        pressCreateCamp();
        enterCampTitle();
        selectCampCategory();
        enterStartMessage();
        pressSaveCamp();
        hideKeyboard();
    }

    void enterStartMessage();

    void pressSaveCamp();

    void enterCampTitle();

    void pressCreateCamp();

    void selectCampCategory();

    void openCamps();
}
