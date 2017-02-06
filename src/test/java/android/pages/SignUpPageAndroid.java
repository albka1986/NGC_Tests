package android.pages;

import android.configDevice.AndroidSetup;
import model.User;
import org.openqa.selenium.By;

import java.util.LinkedHashSet;
import java.util.Set;

import static android.pages.SignInPageAndroid.signUpButton;
import static utilites.Utilities.*;
import static utilites.Validation.*;

public class SignUpPageAndroid extends AndroidSetup {

    public By signInButton = By.id(APP_PACKAGE_NAME + "welcome_sign_in_tab");
    public By email = By.id(APP_PACKAGE_NAME + "welcome_sign_up_email");
    public By password = By.id(APP_PACKAGE_NAME + "welcome_sign_up_password");
    public By confirmPassword = By.id(APP_PACKAGE_NAME + "welcome_sign_up_confirm_password");
    public By name = By.id(APP_PACKAGE_NAME + "welcome_sign_up_name");
    public By location = By.id(APP_PACKAGE_NAME + "welcome_sign_up_location");
    public By age = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");
    public By genderMenu = By.id(APP_PACKAGE_NAME + "welcome_sign_up_gender");
    public By nextStepButton = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]");
    public By tagSports = By.id(APP_PACKAGE_NAME + "welcome_sign_up_sports_tag");
    public By createAccountButton = By.id(APP_PACKAGE_NAME + "welcome_sign_up_create_account");
    //    public By createAccountButton = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]");
    public By addPhotoButton = By.id("welcome_sign_up_avatar");
    public By imageCrop = By.id(APP_PACKAGE_NAME + "crop_image_menu_crop");
    public By selectCamera = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
    public By makeShoot = By.id("com.android.camera:id/shutter_button");
    public By imageDone = By.id("com.android.camera:id/btn_done");
    public By imageDoneMotorola = By.id("com.motorola.camera:id/review_approve");
    public By dateOfBirth = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");
    public By dateOfBirthSet = By.id(APP_PACKAGE_NAME + "ok");
    public By dateOfBirthField = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");
    public By termAndConditions = By.id(APP_PACKAGE_NAME + "welcome_sign_up_terms_and_conditions_checkbox");

    public void signUpByData(String email, String password, String name, String location, boolean photo) throws InterruptedException {

        waitForVisibilityOf(signUpButton);

        //step #1
        tapOn(signUpButton);

        waitForVisibilityOf(this.email);

        if (photo) {
            addPhoto();
            Thread.sleep(5000);
        }

        sendKeys(this.email, email);
        hideKeyboard();
        Thread.sleep(2000);

        sendKeys(this.password, password);
        hideKeyboard();
        Thread.sleep(2000);

        sendKeys(this.confirmPassword, password);
        hideKeyboard();
        Thread.sleep(4000);

        swipingToTop();

        sendKeys(this.name, name);
        hideKeyboard();
        swipingToTop();

        if (!location.equals("")) {
            driver.findElement(this.location).sendKeys(location);
            Thread.sleep(7000);
            hideKeyboard();
        }

        Thread.sleep(7000);


        setDateOfBirth();
        Thread.sleep(2000);
        hideKeyboard();

        String birth = driver.findElement(dateOfBirthField).getText();

        driver.findElement(termAndConditions).click();

        System.out.println("Try to create: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "; Birthday: " + birth +
                "]");

        Thread.sleep(3000);
        tapOn(nextStepButton);

        //step #2
        waitForVisibilityOf(tagSports);
        driver.findElement(tagSports).click();
        driver.findElement(createAccountButton).click();

        waitForVisibilityOf(MyPostsPageAndroid.titleScreen);

        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "; Birthday: " + birth +
                "]");
    }

    public void setDateOfBirth() {
        tapOn(dateOfBirth);
        tapOn(dateOfBirthSet);
    }

    public void addPhoto() throws InterruptedException {

        waitForVisibilityOf(signUpButton);
        tapOn(signUpButton);

        waitForVisibilityOf(addPhotoButton);
        tapOn(addPhotoButton);

        waitForVisibilityOf(selectCamera);
        tapOn(selectCamera);

        Thread.sleep(5000);

        driver.tap(1, 300, 300, 200);

        Thread.sleep(3000);

        waitAndTap(imageDoneMotorola);

        tapOn(imageCrop);
    }

    public User validRandomSignUp() throws InterruptedException {
        User user = new User();
        waitForVisibilityOf(signUpButton);
        //TODO: change to method trueOrFalse when problem with memory on a device will be fixed;
        if (false) {
            addPhoto();
            waitForVisibilityOf(this.email);
        }

        //step #1
        waitAndTap(signUpButton);

        String email = randomValidEmail();
        user.setEmail(email);
        sendKeys(this.email, email);

        String password = randomValidPassword();
        user.setPassword(password);
        sendKeys(this.password, password);
        hideKeyboard();

        sendKeys(this.confirmPassword, password);
        hideKeyboard();


        String name = randomValidName();
        user.setName(name);
        sendKeys(this.name, name);
        hideKeyboard();

        swipingToTop();

        String location = randomValidLocation();
        driver.findElement(this.location).sendKeys(location);
        hideKeyboard();

        setDateOfBirth();
        String birth = driver.findElement(dateOfBirthField).getText();

        driver.findElement(this.termAndConditions).click();

        System.out.println("Step #1. " +
                "Try to create:\n" +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "; Birthday: " + birth +
                "]");

        Thread.sleep(3000);
        driver.findElement(nextStepButton).click();

        //step #2
        waitForVisibilityOf(tagSports);
        driver.findElement(tagSports).click();
        driver.findElement(createAccountButton).click();

        waitForVisibilityOf(MyPostsPageAndroid.titleScreen);

        System.out.println("Step #2. " +
                "Try to create:\n" +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "; Location: " + location +
                "; Birthday: " + birth +
                "]");
        return user;
    }


    public void createUserTopName(int amount) throws InterruptedException {
        Set<User> users = new LinkedHashSet<>();
        MyProfilePageAndroid myProfilePageAndroid = new MyProfilePageAndroid();

        while (users.size() < amount) {
            User user = new User();
            String name = randomTopName();
            user.setEmail(name + "@gmail.com");
            user.setName(name);
            user.setPassword(randomValidPassword());
            user.setLocation(randomTopLocation());

            users.add(user);
        }

        for (User user : users) {
            signUpByData(user.getEmail(), user.getPassword(), user.getName(), user.getLocation(), false);
            myProfilePageAndroid.logout();
        }

    }

}
