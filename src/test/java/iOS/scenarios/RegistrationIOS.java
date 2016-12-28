package iOS.scenarios;/* Created by Ponomarenko Oleh on 28/11/16. */

import iOS.pages.DrawerPageIOS;
import iOS.pages.MyProfilePageIOS;
import iOS.pages.SignInPageIOS;
import iOS.pages.SignUpPageIOS;
import interfaces.Registration;
import io.appium.java_client.AppiumDriver;
import utilites.Validation;

public class RegistrationIOS implements Registration {
    SignInPageIOS signInPage = new SignInPageIOS();
    SignUpPageIOS signUpPage = new SignUpPageIOS();
    Validation validation = new Validation();
    DrawerPageIOS drawerPage = new DrawerPageIOS();
    MyProfilePageIOS myProfilePage = new MyProfilePageIOS();


    @Override
    public void validRandomSignUp(AppiumDriver driver) throws InterruptedException {
        SignUpPageIOS signUpPageIOS = new SignUpPageIOS();
        signUpPageIOS.validRandomSignUp();
    }

    @Override
    public void logout(AppiumDriver driver) throws InterruptedException {
        myProfilePage.logout();
    }

    @Override
    public void registrationByData(AppiumDriver driver, String email, String password, String name, String location, boolean photo) throws InterruptedException {
    }


}
