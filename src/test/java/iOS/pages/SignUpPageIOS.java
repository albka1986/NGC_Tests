package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import org.openqa.selenium.By;

import static android.pages.SignInPageAndroid.signUpButton;
import static utilites.Utilities.*;

public class SignUpPageIOS {

    public By signInButton = By.name("Sign In");
    public By email = xpathBuilderByValue("Email*");
    public By password = xpathBuilderByValue("Password*");
    public By confirmPassword = xpathBuilderByValue("Confirm Password*");
    public By name = xpathBuilderByValue("Name*");
    public By location = xpathBuilderByValue("Location");
    public By nextStepButton = By.name("Next Step");
    public By createAccountButton = By.name("Create Account");
    public By tags[] = {By.name("clubs"), By.name("games"), By.name("cars"), By.name("sports"), By.name("business"), By.name("music"), By.name("shops")};
    public By dateOfBirth = xpathBuilderByValue("Date of Birth");
    public By dateOfBirthDone = By.name("Done");
    public By addPhotoButton = By.name("addPhoto");
    public By chooseFromLibrary = By.name("Choose from Library");
    public By titleRequestCamera = By.name("“Campfiire” Would Like to Access Your Photos");
    public By allowCamera = By.name("OK");
    public By cameraRoll = xpathBuilderByText("Camera Roll");
    public By chooseButton = By.name("Choose");

    public void openSignIn() {
        waitAndTap(signInButton);
    }

    public void registrationByData(String email, String password, String name, String location, boolean photo) {
        waitAndTap(signUpButton);

    }

}
