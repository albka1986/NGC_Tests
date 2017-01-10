package iOS.pages;/* Created by Ponomarenko Oleh on 28/11/16. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.*;


public class SignInPageIOS extends IOSSetup {


    public static By signUpButton = By.name("Sign Up");
    public By signInButton = By.name("Sign In");
    public By email = By.name("signInEmail");
    public By password = By.name("signInPassword");

    public void openSignUp() {
        waitAndTap(signUpButton);
    }

    public void signIn(String email, String password) {
        waitAndTap(signInButton);
    }

    public void signInByData(String email, String password) throws InterruptedException {
        waitForVisibilityOf(this.email);

        Thread.sleep(2000);
        driver.findElement(this.email).clear();
        sendKeys(this.email, email);

        Thread.sleep(2000);
        driver.findElement(this.password).clear();
        sendKeys(this.password, password);

        hideKeyboard();

        waitAndTap(signInButton);

    }


}
