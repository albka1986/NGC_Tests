package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import io.appium.java_client.AppiumDriver;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

import static iOS.pages.DrawerPageIOS.drawerButton;
import static iOS.pages.SignInPageIOS.signUpButton;
import static utilites.Utilities.*;
import static utilites.Validation.*;

public class SignUpPageIOS {

    public By signInButton = By.name("Sign In");
    public By email = xpathBuilderByValue("E-mail*");
    public By password = xpathBuilderByValue("Password*");
    public By confirmPassword = xpathBuilderByValue("Confirm Password*");
    public By name = xpathBuilderByValue("Name*");
    public By location = xpathBuilderByValue("Location");
    public By nextStepButton = By.name("Next Step");
    public By createAccountButton = By.name("Create Account");
    public By tags[] = {By.name("clubs"), By.name("games"), By.name("cars"), By.name("sports"), By.name("business"), By.name("music"), By.name("shops")};
    public By dateOfBirth = xpathBuilderByValue("Date of Birth*");
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

    public User validRandomSignUp() throws InterruptedException {
        User user = new User();
        waitAndTap(signUpButton);

        //step #1

        //attaching a photo
        //TODO: always without photo. The function doesn't work.
        if (false) {
            System.out.println("With a photo");
            addPhoto();
        } else {
            System.out.println("Without any photo");
        }

        waitForVisibilityOf(this.email);

        String email = randomValidEmail();
        user.setEmail(email);
        sendKeys(this.email, email);

        String password = randomValidPassword();
        user.setPassword(password);
        sendKeys(this.password, password);

        sendKeys(this.confirmPassword, password);

        String name = randomValidName();
        user.setName(name);
        sendKeys(this.name, name);
        hideKeyboard();

        String location = randomValidLocation();
        if (!location.equals("")) {
            sendKeys(this.location, location);
            hideKeyboard();
        }

        setDateOfBirth();

        System.out.println("Step1\n" +
                "Try to create:\n" +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "]");

        Thread.sleep(3000);
        waitAndTap(nextStepButton);

        //step #2
        By tag = this.tags[new Random().nextInt(7)];
        waitAndTap(tag);
        waitAndTap(createAccountButton);

        waitForVisibilityOf(drawerButton);
        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "]");
        return user;
    }

    private void addPhoto() {
        System.out.printf("The method doesn't know how to make a photo yet.");
    }

    public void setDateOfBirth() {
        waitAndTap(dateOfBirth);
        waitAndTap(dateOfBirthDone);
    }


    private void allowingCamera(AppiumDriver driver) throws InterruptedException {
        try {
            WebElement element = driver.findElement(this.titleRequestCamera);
            if (element != null) {
                tapOn(this.allowCamera);
            }
        } catch (Exception e) {
            System.out.println("Права уже предоставлены");
        }
    }

    public void signUpByData(String email, String password, String name, String location, boolean photo) throws InterruptedException {

        waitAndTap(signUpButton);

        //step #1

        //attaching a photo
        //TODO: always without photo. The function doesn't work.
        if (photo) {
            System.out.println("With a photo");
            addPhoto();
        } else {
            System.out.println("Without any photo");
        }

        waitForVisibilityOf(this.email);

        sendKeys(this.email, email);

        sendKeys(this.password, password);

        sendKeys(this.confirmPassword, password);

        sendKeys(this.name, name);

        hideKeyboard();

        if (!location.equals("")) {
            sendKeys(this.location, location);
        }

        setDateOfBirth();

        System.out.println("Step1\n" +
                "Try to create:\n" +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "]");

        Thread.sleep(3000);
        waitAndTap(nextStepButton);

        //step #2
        By tag = this.tags[new Random().nextInt(7)];
        waitAndTap(tag);
        waitAndTap(createAccountButton);

        waitForVisibilityOf(drawerButton);
        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "]");
    }
}
