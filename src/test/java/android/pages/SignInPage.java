package android.pages;/* Created by Ponomarenko Oleh on 03/11/16. */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SignInPage extends BasePage {

    public By signInButton = By.id(APP_PACKAGE_NAME + "welcome_sign_in_tab");

    public SignInPage(AppiumDriver driver) {
        super(driver);
    }
}
