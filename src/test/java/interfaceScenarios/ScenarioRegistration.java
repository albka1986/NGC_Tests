package interfaceScenarios;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utilites.Validation;

import static utilites.Utilities.*;

public interface ScenarioRegistration {

    By signUpButton = null;
    By email = null;
    By password = null;
    By confirmPassword = null;
    By name = null;
    By location = null;
    By age = null;
    By genderMenu = null;
    By nextButton = null;
    By tagSports = null;
    By createAccount = null;
    By addPhotoButton = null;
    By imageCrop = null;
    By selectCamera = null;
    By makeShoot = null;
    By imageDone = null;

    default void singUpValidRandom(AppiumDriver driver) throws InterruptedException {
        waitForVisibilityOf(driver, signUpButton);
        //step #1
        driver.findElement(signUpButton).click();
        driver.findElement(email).sendKeys(Validation.randomValidEmail());
        driver.findElement(password).sendKeys(Validation.randomValidPassword());
        driver.findElement(confirmPassword).sendKeys("12345678");
        hideKeyboard(driver);
        driver.findElement(name).sendKeys(Validation.randomValidName());
        hideKeyboard(driver);
        try {
            swipingVertical(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(3000);
        driver.findElement(nextButton).click();

        //step #2
        waitForVisibilityOf(driver, tagSports);
        driver.findElement(tagSports).click();
        driver.findElement(createAccount).click();

        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "]");
    }

    default void logout(AppiumDriver driver) {

    }

    default void validRandomRegistration(AppiumDriver driver) throws InterruptedException {
        singUpValidRandom(driver);
        logout(driver);
    }


}
