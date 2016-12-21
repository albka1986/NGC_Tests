package android.pages;/* Created by Ponomarenko Oleh on 03/11/16. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.*;

public class SignInPageAndroid extends AndroidSetup {


    public By signUpButton = By.id(APP_PACKAGE_NAME + "welcome_sign_up_tab");
    public By emailField = By.id(APP_PACKAGE_NAME + "welcome_sign_in_email");
    public By passwordField = By.id(APP_PACKAGE_NAME + "welcome_sign_in_password");
    private By signInButton = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.TextView[1]");

    public void signIn(String email, String password) {
        waitForVisibilityOf(emailField);
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        hideKeyboard();

        waitForClickabilityOf(signInButton);
        tapOn(signInButton);
    }

}
