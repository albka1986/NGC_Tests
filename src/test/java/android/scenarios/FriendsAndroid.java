package android.scenarios;

import android.pages.*;
import interfaces.Friends;
import model.User;

public class FriendsAndroid implements Friends {


    @Override
    public void acceptFriendship() {
        FriendsPageAndroid friendsPageAndroid = new FriendsPageAndroid();
        friendsPageAndroid.acceptFriendship();
    }

    @Override
    public void back() {
        NavigationAndroid navigationAndroid = new NavigationAndroid();
        navigationAndroid.back();
    }

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
    public void findUserByName(String name) throws InterruptedException {
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
