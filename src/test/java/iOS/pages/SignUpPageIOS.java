package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import io.appium.java_client.AppiumDriver;
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

    public void validRandomSignUp() throws InterruptedException {

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
        sendKeys(this.email, email);

        String password = randomValidPassword();
        sendKeys(this.password, password);

        sendKeys(this.confirmPassword, password);

        String name = randomValidName();
        sendKeys(this.name, name);

        String location = randomValidLocation();
        sendKeys(this.location, location);

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

    public void registrationByData(AppiumDriver driver, String email, String password, String name, String location, boolean photo) throws InterruptedException {
        waitAndTap(signUpButton);

        //step #1
        if (photo) {
            addPhoto();
        }

        sendKeys(this.email, email);
        sendKeys(this.password, password);
        sendKeys(this.confirmPassword, password);
        sendKeys(this.name, name);
        sendKeys(this.location, location);

        setDateOfBirth();

        System.out.println("Step1\n" +
                "Try to create: " +
                "[" + "Email: " + email + "; Password: " + password + "; Name: " + name + "; Location: " + location + "]");

        waitAndTap(this.nextStepButton);

        //step #2
        //TODO: make randomTag generator;
        By tag = this.tags[new Random().nextInt(7)];
        waitAndTap(tag);

        waitAndTap(this.createAccountButton);

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
