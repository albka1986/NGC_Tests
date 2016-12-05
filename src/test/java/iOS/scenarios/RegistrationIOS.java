package iOS.scenarios;/* Created by Ponomarenko Oleh on 28/11/16. */

import iOS.pages.DrawerPageIOS;
import iOS.pages.MyProfilePageIOS;
import iOS.pages.SignInPageIOS;
import iOS.pages.SignUpPageIOS;
import interfaces.Registration;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utilites.Validation;

import java.util.Random;

import static utilites.Utilities.*;

public class RegistrationIOS implements Registration {
    SignInPageIOS signInPage = new SignInPageIOS();
    SignUpPageIOS signUpPage = new SignUpPageIOS();
    Validation validation = new Validation();
    DrawerPageIOS drawerPage = new DrawerPageIOS();
    MyProfilePageIOS myProfilePage = new MyProfilePageIOS();

    @Override
    public void validRandomSignUp(AppiumDriver driver) throws InterruptedException {

        //attaching a photo
        if (trueOrFalse()) {
            addPhoto(driver);
        }
        waitForVisibilityOf(signInPage.signUpButton);
        driver.findElement(signInPage.signUpButton).click();

        //step #1
        waitForVisibilityOf(signUpPage.email);
        driver.findElement(signInPage.signUpButton).click();

        /** Bug #3594 - Sign Up: validation for field email is wrong
         waitForVisibilityOf(driver, signUpPage.email);
         String email = validation.randomValidEmail();
         */

        waitForVisibilityOf(signUpPage.email);
        String email = "newUser" + new Random().nextInt(9999) + "@gmail.com";

        driver.findElement(signUpPage.email).sendKeys(email);

        String password = validation.randomValidPassword();
        driver.findElement(signUpPage.password).sendKeys(password);

        driver.findElement(signUpPage.confirmPassword).sendKeys(password);

        String name = validation.randomValidName();
        driver.findElement(signUpPage.name).sendKeys(name);


        String location = validation.randomValidLocation();

        //TODO: Bug #3587 (User can't use ",/")
        while (location.contains(",") || location.contains("/")) {
            location = validation.randomValidLocation();
        }
        //end

        if (trueOrFalse()) {
            driver.findElement(signUpPage.location).sendKeys(location);
        }

        setDateOfBirth(driver);


        System.out.println("Step1\n" +
                "Try to create:\n" +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "]");

        Thread.sleep(3000);
        driver.findElement(signUpPage.nextStepButton).click();

        //step #2
        By tag = signUpPage.tags[new Random().nextInt(7)];
        waitForVisibilityOf(tag);
        driver.findElement(tag).click();
        driver.findElement(signUpPage.createAccountButton).click();

        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "]");
    }

    @Override
    public void logout(AppiumDriver driver) throws InterruptedException {

        drawerPage.drawerOpen();

        Thread.sleep(5000);
        driver.tap(1, 100, 100, 500); //tap on drawerAvatar

        System.out.println("Trying to find logout-button");

        waitForVisibilityOf(myProfilePage.logoutButton);
        tapOn(myProfilePage.logoutButton);
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
    public void setDateOfBirth(AppiumDriver driver) {
        tapOn(signUpPage.dateOfBirth);
        tapOn(signUpPage.dateOfBirthDone);
    }

    @Override
    public void signIn(AppiumDriver driver) {
        waitForVisibilityOf(signInPage.signInButton);
        tapOn(signInPage.signInButton);
    }
}
