package android.pages;

import android.configDevice.AndroidSetup;
import interfaceScenarios.ScenarioRegistration;
import org.openqa.selenium.By;

public class SignUpPage extends AndroidSetup implements ScenarioRegistration {

    public By signUpButton = By.id(APP_PACKAGE_NAME + "welcome_sign_up_tab");
    public By email = By.id(APP_PACKAGE_NAME + "welcome_sign_up_email");
    public By password = By.id(APP_PACKAGE_NAME + "welcome_sign_up_password");
    public By confirmPassword = By.id(APP_PACKAGE_NAME + "welcome_sign_up_confirm_password");
    public By name = By.id(APP_PACKAGE_NAME + "welcome_sign_up_name");
    public By location = By.id(APP_PACKAGE_NAME + "welcome_sign_up_location");
    public By age = By.id(APP_PACKAGE_NAME + "welcome_sign_up_age");
    public By genderMenu = By.id(APP_PACKAGE_NAME + "welcome_sign_up_gender");
    public By nextButton = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]");
    public By tagSports = By.id(APP_PACKAGE_NAME + "welcome_sign_up_sports_tag");
    public By createAccount = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]");
    public By addPhotoButton = By.id("welcome_sign_up_avatar");
    public By imageCrop = By.id(APP_PACKAGE_NAME + "crop_image_menu_crop");
    public By selectCamera = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
    public By makeShoot = By.id("com.android.camera:id/shutter_button");
    public By imageDone = By.id("com.android.camera:id/btn_done");



/*
    public SignUpPage(AppiumDriver driver) {
        super(driver);
    }


    public SignUpPage validSignUp() throws InterruptedException {
        waitForVisibilityOf(driver, signUpButton);
        //step #1
        driver.findElement(signUpButton).click();
        driver.findElement(email).sendKeys(Validation.randomValidEmail());
        driver.findElement(password).sendKeys(Validation.randomValidPassword());
        driver.findElement(confirmPassword).sendKeys("12345678");
        hideKeyboard(driver);
        driver.findElement(name).sendKeys(Validation.randomValidName());
        hideKeyboard(driver);
        try {
            swipingVertical(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(3000);
        driver.findElement(nextButton).click();

        //step #2
        waitForVisibilityOf(driver, tagSports);
        driver.findElement(tagSports).click();
        driver.findElement(createAccount).click();

        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "]");
        return new SignUpPage(driver);
    }

    @Test
    public SignUpPage registerWithPointsData(String email, String password, String confirmPassword, String name) throws InterruptedException {
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
            swipingVertical(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(3000);
        driver.findElement(nextButton).click();

        //step #2
        waitForVisibilityOf(driver, tagSports);
        driver.findElement(tagSports).click();
        driver.findElement(createAccount).click();

        System.out.println("User created: " +
                "[" +
                "Email: " + email +
                "; Password: " + password +
                "; Name: " + name +
                "]");

        return new SignUpPage(driver);
    }

    @Test
    public SignUpPage registerWithoutPhoto() throws InterruptedException {
        validSignUp();
        return new SignUpPage(driver);
    }

    @Test
    public SignUpPage registerWithPhoto() throws InterruptedException {
        addPhoto();
        validSignUp();
        return new SignUpPage(driver);
    }

    @Test
    public SignUpPage addPhoto() throws InterruptedException {

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

        return new SignUpPage(driver);
    }*/
}
