package android.pages;

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

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
    public By dateOfBirth = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");
    public By dateOfBirthSet = By.id(APP_PACKAGE_NAME + "ok");
    public By dateOfBirthField = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");
    public By termAndConditions = By.id(APP_PACKAGE_NAME + "welcome_sign_up_terms_and_conditions_checkbox");

/*
       @Test
    public SignUpPageAndroid registerWithPointsData(String email, String password, String confirmPassword, String name) throws InterruptedException {
        waitForVisibilityOf(driver, signUpButton);
        //step #1
        driver.findElement(signUpButton).click();
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
        hideKeyboard(driver);
        driver.findElement(this.name).sendKeys(name);
        hideKeyboard(driver);
        try {
            swipingVerticalToTop(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(3000);
        driver.findElement(nextStepButton).click();

        //step #2
        waitForVisibilityOf(driver, tagSports);
        driver.findElement(tagSports).click();
        driver.findElement(createAccountButton).click();

        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "]");

        return new SignUpPageAndroid(driver);
    }


    @Test
    public SignUpPageAndroid registerWithPhoto() throws InterruptedException {
        addPhoto();
        validSignUp();
        return new SignUpPageAndroid(driver);
    }

    @Test
    public SignUpPageAndroid addPhoto() throws InterruptedException {

        waitForVisibilityOf(driver, signUpButton);

        driver.findElement(signUpButton).click();

        driver.findElement(addPhotoButton).click();

        Thread.sleep(2000);
        driver.findElement(selectCamera).click();

        waitForVisibilityOf(driver, makeShoot);
        driver.findElement(makeShoot).click();

        waitForVisibilityOf(driver, imageDone);
        driver.findElement(imageDone).click();

        driver.findElement(imageCrop).click();

        return new SignUpPageAndroid(driver);
    }*/
}
