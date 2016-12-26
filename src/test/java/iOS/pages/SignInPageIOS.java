package iOS.pages;/* Created by Ponomarenko Oleh on 28/11/16. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.waitAndTap;


public class SignInPageIOS extends IOSSetup {

    public By signInButton = By.name("Sign In");
    public By signUpButton = By.name("Sign Up");
    public By email;
    public By password;

    public void openSignUp() {
        waitAndTap(signUpButton);
    }

    public void signInByData(String email, String password) {
        waitAndTap(signInButton);
    }
}
