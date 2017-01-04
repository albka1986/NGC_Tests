package android.scenarios;/* Created by Ponomarenko Oleh on 03/01/17. */

import android.pages.*;
import interfaces.Friends;
import model.User;

public class FriendsAndroid implements Friends {


    @Override
    public void logout() {
        MyProfilePageAndroid myProfilePageAndroid = new MyProfilePageAndroid();
        myProfilePageAndroid.logout();
    }

    @Override
    public void sendRequestFriendship() {
        FriendsPageAndroid friendsPageAndroid = new FriendsPageAndroid();
        friendsPageAndroid.sendRequestFriendship();
    }

    @Override
    public void findUserByName(String name) {
        SearchPageAndroid searchPageAndroid = new SearchPageAndroid();
        searchPageAndroid.findUserByName(name);
    }

    @Override
    public void signInByData(String email, String password) {
        SignInPageAndroid signInPageAndroid = new SignInPageAndroid();
        signInPageAndroid.signInByData(email, password);

    }

    @Override
    public User randomValidSignUp() throws InterruptedException {
        SignUpPageAndroid signUpPageAndroid = new SignUpPageAndroid();
        User user = signUpPageAndroid.validRandomSignUp();
        return user;
    }
}
