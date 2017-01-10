package iOS.scenarios;/* Created by Ponomarenko Oleh on 06/01/17. */

import iOS.pages.*;
import interfaces.Like;
import model.User;

public class LikeIOS implements Like {
    @Override
    public void openTopRated() {
        new DrawerPageIOS().openTopRated();
    }

    @Override
    public void logout() throws InterruptedException {
        MyProfilePageIOS myProfilePageIOS = new MyProfilePageIOS();
        myProfilePageIOS.logout();
    }

    @Override
    public void back() throws InterruptedException {
        NavigationIOS navigationIOS = new NavigationIOS();
        navigationIOS.back();
    }

    @Override
    public void pressLikeButton() {
        DirectoriesIOS doctorProfilePage = new DirectoriesIOS();
        doctorProfilePage.pressLikeButton();
    }

    @Override
    public void selectObject(String name) {
        DirectoriesIOS directoriesIOS = new DirectoriesIOS();
        directoriesIOS.selectObject(name);
    }

    @Override
    public void selectCategory(String category) {
        DirectoriesIOS directoriesIOS = new DirectoriesIOS();
        directoriesIOS.selectCategory(category);
    }


    @Override
    public void signInByData(String email, String password) throws InterruptedException {
        SignInPageIOS signInPageIOS = new SignInPageIOS();
        signInPageIOS.signInByData(email, password);
    }

    @Override
    public User validRandomSignUp() throws InterruptedException {
        SignUpPageIOS signUpPageIOS = new SignUpPageIOS();
        User user = signUpPageIOS.validRandomSignUp();
        return user;
    }
}
