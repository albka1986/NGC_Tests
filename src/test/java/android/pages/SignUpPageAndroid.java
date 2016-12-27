package android.pages;

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static android.pages.SignInPageAndroid.signUpButton;
import static utilites.Utilities.*;

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
    public By createAccountButton = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]");
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

    public void registrationByData(String email, String password, String name, String location, boolean photo) throws InterruptedException {

        waitForVisibilityOf(signUpButton);

        //step #1
        tapOn(signUpButton);

        waitForVisibilityOf(this.email);

        if (photo) {
            addPhoto();
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

        swipingVerticalToTop();

        sendKeys(this.name, name);
        hideKeyboard();
        Thread.sleep(2000);

        if (!location.equals("")) {
            driver.findElement(this.location).sendKeys(location);
            Thread.sleep(10000);
            driver.getKeyboard().pressKey(Keys.RETURN);
        }

        Thread.sleep(10000);


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

        Thread.sleep(3000);

        driver.tap(1, 300, 300, 300);

        waitAndTap(imageDoneMotorola);

        tapOn(imageCrop);
    }

}
