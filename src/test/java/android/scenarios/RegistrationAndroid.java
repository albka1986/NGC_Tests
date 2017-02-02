package android.scenarios;


import android.pages.MyProfilePageAndroid;
import android.pages.SignInPageAndroid;
import android.pages.SignUpPageAndroid;
import interfaces.Registration;
import io.appium.java_client.AppiumDriver;
import utilites.Validation;

public class RegistrationAndroid implements Registration {

    SignUpPageAndroid signUpPage = new SignUpPageAndroid();
    SignInPageAndroid signInPage = new SignInPageAndroid();
    MyProfilePageAndroid myProfilePage = new MyProfilePageAndroid();
    Validation validation = new Validation();


    @Override
    public void validRandomSignUp(AppiumDriver driver) throws InterruptedException {
        SignUpPageAndroid signUpPageAndroid = new SignUpPageAndroid();
        signUpPageAndroid.validRandomSignUp();
    }

    @Override
    public void logout(AppiumDriver driver) throws InterruptedException {
        myProfilePage.logout();
    }


    @Override
    public void registrationByData(AppiumDriver driver, String email, String password, String name, String location, boolean photo) throws InterruptedException {
        signUpPage.signUpByData(email, password, name, location, photo);
    }


    public void createUsers(int amount) throws InterruptedException {
        new SignUpPageAndroid().createUserTopName(amount);
    }


}
