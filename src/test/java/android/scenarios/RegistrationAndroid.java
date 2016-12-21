package android.scenarios;


import android.pages.MyPostsPageAndroid;
import android.pages.MyProfilePageAndroid;
import android.pages.SignInPageAndroid;
import android.pages.SignUpPageAndroid;
import interfaces.Registration;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Keys;
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
        tapOn(signInPage.signUpButton);

        waitForVisibilityOf(signUpPage.email);

        sendKeys(signUpPage.email, email);
        hideKeyboard();
        Thread.sleep(2000);

        sendKeys(signUpPage.password, password);
        hideKeyboard();
        Thread.sleep(2000);

        sendKeys(signUpPage.confirmPassword, password);
        hideKeyboard();
        Thread.sleep(2000);

        sendKeys(signUpPage.name, name);
        hideKeyboard();
        Thread.sleep(2000);

        swipingVerticalToTop();

        if (!location.equals("")) {
            driver.findElement(signUpPage.location).sendKeys(location);
            Thread.sleep(10000);
            driver.getKeyboard().pressKey(Keys.RETURN);
        }

        Thread.sleep(10000);


        setDateOfBirth(driver);
        Thread.sleep(2000);
        hideKeyboard();

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
        tapOn(signUpPage.dateOfBirthSet);
    }

    @Override
    public void signIn(AppiumDriver driver) {
    }
}
