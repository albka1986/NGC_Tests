package interfaces;/* Created by Ponomarenko Oleh on 06/01/17. */

import model.User;

public interface Like {

    default void setLike() throws InterruptedException {
        validRandomSignUp();
        openTopRated();
        String category = "Doctors";
        selectCategory(category);
        String name = "Alaska";
        selectObject(name);
        pressLikeButton();
        back();
        back();
        logout();

    }

    void openTopRated();

    void logout() throws InterruptedException;

    void back() throws InterruptedException;

    void pressLikeButton();

    void selectObject(String name);

    void selectCategory(String category);


    void signInByData(String email, String password) throws InterruptedException;

    User validRandomSignUp() throws InterruptedException;

}
