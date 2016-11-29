package iOS.scenarios;/* Created by Ponomarenko Oleh on 28/11/16. */

import iOS.pages.SignInPageIOS;
import interfaces.Registration;
import io.appium.java_client.AppiumDriver;

public class RegistrationIOS implements Registration {
    SignInPageIOS signInPageIOS = new SignInPageIOS();


    @Override
    public void validRandomSignUp(AppiumDriver driver) throws InterruptedException {
        driver.findElement(signInPageIOS.signUpButton).click();

    }

    @Override
    public void logout(AppiumDriver driver) throws InterruptedException {

    }

    @Override
    public void addPhoto(AppiumDriver driver) throws InterruptedException {

    }


    @Override
    public void registrationByData(AppiumDriver driver, String email, String password, String name, String location) throws InterruptedException {

    }

    @Override
    public void registrationForProduction() {

    }
}
