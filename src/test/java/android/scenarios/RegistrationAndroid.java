package android.scenarios;


import android.pages.MyPostsPageAndroid;
import android.pages.MyProfilePageAndroid;
import android.pages.SignInPageAndroid;
import android.pages.SignUpPageAndroid;
import interfaces.Registration;
import io.appium.java_client.AppiumDriver;
import utilites.Validation;

import static utilites.Utilities.*;

public class RegistrationAndroid implements Registration {

    SignUpPageAndroid signUpPage = new SignUpPageAndroid();
    SignInPageAndroid signInPage = new SignInPageAndroid();
    MyProfilePageAndroid myProfilePage = new MyProfilePageAndroid();
    Validation validation = new Validation();

    public void validRandomSignUp(AppiumDriver driver) throws InterruptedException {

        waitForVisibilityOf(signInPage.signUpButton);
        if (trueOrFalse()) {
            addPhoto(driver);
            waitForVisibilityOf(signInPage.signUpButton);
        }

        //step #1
        driver.findElement(signInPage.signUpButton).click();

        String email = validation.randomValidEmail();
        driver.findElement(signUpPage.email).sendKeys(email);

        String password = validation.randomValidPassword();
        driver.findElement(signUpPage.password).sendKeys(password);

        driver.findElement(signUpPage.confirmPassword).sendKeys(password);
        hideKeyboard();

        String name = validation.randomValidName();
        driver.findElement(signUpPage.name).sendKeys(name);
        hideKeyboard();


        try {
            swipingVerticalToTop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String location = validation.randomValidLocation();
        driver.findElement(signUpPage.location).sendKeys(location);
        hideKeyboard();

        setDateOfBirth(driver);
        String birth = driver.findElement(signUpPage.dateOfBirthField).getText();

        driver.findElement(signUpPage.termAndConditions).click();

        System.out.println("Try to create:\n" +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "; Birthday: " + birth +
                "]");

        Thread.sleep(3000);
        driver.findElement(signUpPage.nextStepButton).click();

        //step #2
        waitForVisibilityOf(signUpPage.tagSports);
        driver.findElement(signUpPage.tagSports).click();
        driver.findElement(signUpPage.createAccountButton).click();

        waitForVisibilityOf(MyPostsPageAndroid.titleScreen);

        System.out.println("Try to create:\n" +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "; Birthday: " + birth +
                "]");
    }

    @Override
    public void logout(AppiumDriver driver) throws InterruptedException {
        myProfilePage.logout();
    }

    @Override
    public void addPhoto(AppiumDriver driver) throws InterruptedException {

    }


    @Override
    public void registrationByData(AppiumDriver driver, String email, String password, String name, String location, boolean photo) throws InterruptedException {
        signUpPage.registrationByData(email, password, name, location, photo);
    }


    public void registrationForProduction() {

    }

    @Override
    public void setDateOfBirth(AppiumDriver driver) {
        signUpPage.setDateOfBirth();
    }

    @Override
    public void signIn(AppiumDriver driver) {
    }
}
