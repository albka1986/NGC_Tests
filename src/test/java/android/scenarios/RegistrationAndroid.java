package android.scenarios;


import android.pages.DrawerPageAndroid;
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
    Validation validation = new Validation();
    MyProfilePageAndroid myProfilePage = new MyProfilePageAndroid();

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
        hideKeyboard(driver);
        String name = validation.randomValidName();
        driver.findElement(signUpPage.name).sendKeys(name);
        hideKeyboard(driver);
        try {
            swipingVertical(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String location = validation.randomValidLocation();
        if (trueOrFalse()) {
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
        driver.findElement(signUpPage.nextStepButton).click();

        //step #2
        waitForVisibilityOf(signUpPage.tagSports);
        driver.findElement(signUpPage.tagSports).click();
        driver.findElement(signUpPage.createAccountButton).click();

        takeScreenShot(driver);

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
        new DrawerPageAndroid().drawerOpen();
        waitForClickabilityOf(DrawerPageAndroid.drawerAvatar);
        driver.findElement(DrawerPageAndroid.drawerAvatar).click();
        waitForVisibilityOf(MyProfilePageAndroid.logoutButton);
        driver.findElement(MyProfilePageAndroid.logoutButton).click();
    }

    public void addPhoto(AppiumDriver driver) throws InterruptedException {

        waitForVisibilityOf(signInPage.signUpButton);
        driver.findElement(signInPage.signUpButton).click();

        waitForVisibilityOf(signUpPage.addPhotoButton);
        driver.findElement(signUpPage.addPhotoButton).click();

        waitForVisibilityOf(signUpPage.selectCamera);
        driver.findElement(signUpPage.selectCamera).click();

        waitForVisibilityOf(signUpPage.makeShoot);
        driver.findElement(signUpPage.makeShoot).click();

        waitForVisibilityOf(signUpPage.imageDone);
        driver.findElement(signUpPage.imageDone).click();

        driver.findElement(signUpPage.imageCrop).click();
    }

    public void registrationByData(AppiumDriver driver, String email, String password, String name, String location) throws InterruptedException {

        waitForVisibilityOf(signInPage.signUpButton);

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
        driver.findElement(signUpPage.nextStepButton).click();

        //step #2
        waitForVisibilityOf(signUpPage.tagSports);
        driver.findElement(signUpPage.tagSports).click();
        driver.findElement(signUpPage.createAccountButton).click();

        waitForVisibilityOf(myProfilePage.logoutButton);

        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "]");
    }

    public void registrationForProduction() {

    }

    @Override
    public void setDateOfBirth(AppiumDriver driver) {
        tapOn(signUpPage.dateOfBirth);
        tapOn(signUpPage.dateOfBirthDone);
    }

    @Override
    public void signIn(AppiumDriver driver) {

    }
}
