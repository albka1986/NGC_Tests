package android.pages;/* Created by Ponomarenko Oleh on 03/11/16. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.*;

public class SignInPageAndroid extends AndroidSetup {


    public static By signUpButton = By.id(APP_PACKAGE_NAME + "welcome_sign_up_tab");
    public By emailField = By.id(APP_PACKAGE_NAME + "welcome_sign_in_email");
    public By passwordField = By.id(APP_PACKAGE_NAME + "welcome_sign_in_password");
    private By signInButton = By.id(APP_PACKAGE_NAME + "welcome_sign_in_button");

    public void signInByData(String email, String password) {
        waitForVisibilityOf(emailField);
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        hideKeyboard();

        waitForClickabilityOf(signInButton);
        tapOn(signInButton);
    }
}
