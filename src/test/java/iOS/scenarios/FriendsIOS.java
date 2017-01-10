package iOS.scenarios;/* Created by Ponomarenko Oleh on 04/01/17. */

import iOS.pages.*;
import interfaces.Friends;
import model.User;

public class FriendsIOS implements Friends {
    @Override
    public void acceptFriendship() {
        FriendsPageIOS friendsPageAndroid = new FriendsPageIOS();
        friendsPageAndroid.acceptFriendship();
    }

    @Override
    public void back() throws InterruptedException {
        NavigationIOS navigationAndroid = new NavigationIOS();
        navigationAndroid.back();
    }

    @Override
    public void logout() throws InterruptedException {
        MyProfilePageIOS myProfilePageIOS = new MyProfilePageIOS();
        myProfilePageIOS.logout();
    }

    @Override
    public void sendRequestFriendship() {
        FriendsPageIOS friendsPageAndroid = new FriendsPageIOS();
        friendsPageAndroid.sendRequestFriendship();
    }

    @Override
    public void findUserByName(String name) throws InterruptedException {
        SearchPageIOS searchPageAndroid = new SearchPageIOS();
        searchPageAndroid.findUserByName(name);
    }

    @Override
    public void signInByData(String email, String password) throws InterruptedException {
        SignInPageIOS signInPageAndroid = new SignInPageIOS();
        signInPageAndroid.signInByData(email, password);

    }

    @Override
    public User randomValidSignUp() throws InterruptedException {
        SignUpPageIOS signUpPageIOS = new SignUpPageIOS();
        User user = signUpPageIOS.validRandomSignUp();
        return user;
    }
}
