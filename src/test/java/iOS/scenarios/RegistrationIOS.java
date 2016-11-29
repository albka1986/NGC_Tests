package iOS.scenarios;/* Created by Ponomarenko Oleh on 28/11/16. */

import iOS.pages.DrawerPageIOS;
import iOS.pages.MyProfilePageIOS;
import iOS.pages.SignInPageIOS;
import iOS.pages.SignUpPageIOS;
import interfaces.Registration;
import io.appium.java_client.AppiumDriver;
import utilites.Validation;

import static utilites.Utilities.*;

public class RegistrationIOS implements Registration {
    SignInPageIOS signInPage = new SignInPageIOS();
    SignUpPageIOS signUpPage = new SignUpPageIOS();
    Validation validation = new Validation();

    @Override
    public void validRandomSignUp(AppiumDriver driver) throws InterruptedException {

        //attaching a photo
        if (validation.trueOrFalse()) {
            addPhoto(driver);
        }
        waitForVisibilityOf(driver, signInPage.signUpButton);
        driver.findElement(signInPage.signUpButton).click();

        //step #1
        waitForVisibilityOf(driver, signUpPage.email);
        driver.findElement(signInPage.signUpButton).click();

        waitForVisibilityOf(driver, signUpPage.email);
        String email = validation.randomValidEmail();
        driver.findElement(signUpPage.email).sendKeys(email);

        String password = validation.randomValidPassword();
        driver.findElement(signUpPage.password).sendKeys(password);
        driver.findElement(signUpPage.confirmPassword).sendKeys(password);
        hideKeyboard(driver);
        String name = validation.randomValidName();
        driver.findElement(signUpPage.name).sendKeys(name);
        hideKeyboard(driver);
        try {
            swipingVertical(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String location = validation.randomFavoriteProduct();
        if (validation.trueOrFalse()) {
            driver.findElement(signUpPage.location).sendKeys(location);
            hideKeyboard(driver);
        }

        System.out.println("Try to create:\n" +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location" + location +
                "]");

        Thread.sleep(3000);
        driver.findElement(signUpPage.nextButton).click();

        //step #2
        waitForVisibilityOf(driver, signUpPage.tagSports);
        driver.findElement(signUpPage.tagSports).click();
        driver.findElement(signUpPage.createAccount).click();

        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location" + location +
                "]");
    }

    @Override
    public void logout(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(10000);
        DrawerPageIOS drawerPage = new DrawerPageIOS();
        new DrawerPageIOS().drawerOpen();
        waitForClickabilityOf(driver, drawerPage.drawerAvatar);
        driver.findElement(drawerPage.drawerAvatar).click();
        waitForVisibilityOf(driver, MyProfilePageIOS.logoutButton);
        driver.findElement(MyProfilePageIOS.logoutButton).click();
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

    @Override
    public void setDateOfBirth() {

    }
}
