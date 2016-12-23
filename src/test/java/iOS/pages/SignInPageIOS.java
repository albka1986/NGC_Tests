package iOS.pages;/* Created by Ponomarenko Oleh on 28/11/16. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.waitAndTap;


public class SignInPageIOS extends IOSSetup {

    public By signUpButton = By.name("Sign Up");

    void openSignUp() {
        waitAndTap(signUpButton);
    }
}
