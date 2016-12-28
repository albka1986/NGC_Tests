package iOS.pages;/* Created by Ponomarenko Oleh on 28/11/16. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.waitAndTap;
import static utilites.Utilities.xpathBuilderByValue;


public class SignInPageIOS extends IOSSetup {


    public static By signUpButton = By.name("Sign Up");
    public By signInButton = By.name("Sign In");
    public By email = xpathBuilderByValue("email2@email.com");
    public By password = xpathBuilderByValue("password");

    public void openSignUp() {
        waitAndTap(signUpButton);
    }

    public void signIn(String email, String password) {
        waitAndTap(signInButton);
    }


}
