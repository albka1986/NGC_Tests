package android.scenarios;


import android.pages.DrawerPage;
import android.pages.MyProfilePage;
import android.pages.SignInPageAndroid;
import android.pages.SignUpPageAndroid;
import interfaces.Registration;
import io.appium.java_client.AppiumDriver;
import utilites.Validation;

import static utilites.Utilities.*;

public class RegistrationAndroid implements Registration {

    SignUpPageAndroid signUpPage = new SignUpPageAndroid();
    SignInPageAndroid signInPage = new SignInPageAndroid();
    Validation validation = new Validation();
    MyProfilePage myProfilePage = new MyProfilePage();

    public void validRandomSignUp(AppiumDriver driver) throws InterruptedException {

        waitForVisibilityOf(driver, signInPage.signUpButton);
        if (validation.trueOrFalse()) {
            addPhoto(driver);
            waitForVisibilityOf(driver, signInPage.signUpButton);
        }
        //step #1
        driver.findElement(signInPage.signUpButton).click();

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

    public void logout(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(10000);
        new DrawerPage().drawerOpen();
        waitForClickabilityOf(driver, DrawerPage.drawerAvatar);
        driver.findElement(DrawerPage.drawerAvatar).click();
        waitForVisibilityOf(driver, MyProfilePage.logoutButton);
        driver.findElement(MyProfilePage.logoutButton).click();
    }

    public void addPhoto(AppiumDriver driver) throws InterruptedException {

        waitForVisibilityOf(driver, signInPage.signUpButton);

        driver.findElement(signInPage.signUpButton).click();

        driver.findElement(signUpPage.addPhotoButton).click();

        Thread.sleep(2000);
        driver.findElement(signUpPage.selectCamera).click();

        waitForVisibilityOf(driver, signUpPage.makeShoot);
        driver.findElement(signUpPage.makeShoot).click();

        waitForVisibilityOf(driver, signUpPage.imageDone);
        driver.findElement(signUpPage.imageDone).click();

        driver.findElement(signUpPage.imageCrop).click();
    }

    public void registrationByData(AppiumDriver driver, String email, String password, String name, String location) throws InterruptedException {

        waitForVisibilityOf(driver, signInPage.signUpButton);

        //step #1
        driver.findElement(signInPage.signUpButton).click();

        driver.findElement(signUpPage.email).sendKeys(email);

        driver.findElement(signUpPage.password).sendKeys(password);

        driver.findElement(signUpPage.confirmPassword).sendKeys(password);

        hideKeyboard(driver);

        driver.findElement(signUpPage.name).sendKeys(name);
        hideKeyboard(driver);
        try {
            swipingVertical(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (!location.equals("")) {
            driver.findElement(signUpPage.location).sendKeys(location);
        }


        System.out.println("[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "]");


        Thread.sleep(3000);
        driver.findElement(signUpPage.nextButton).click();

        //step #2
        waitForVisibilityOf(driver, signUpPage.tagSports);
        driver.findElement(signUpPage.tagSports).click();
        driver.findElement(signUpPage.createAccount).click();

        waitForVisibilityOf(driver, myProfilePage.logoutButton);

        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "]");
    }

    public void registrationForProduction() {

    }
}
