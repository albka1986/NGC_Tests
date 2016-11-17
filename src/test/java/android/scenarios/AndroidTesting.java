package android.scenarios;

import android.config.AndroidSetup;
import android.pages.*;
import configDevice.MyListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static utilites.Utilities.takeScreenShot;

@Listeners(MyListener.class)
public class AndroidTesting extends AndroidSetup {


    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidEmulator();
        System.out.println("Has prepared emulator");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Quit");
        Thread.sleep(10000);
        driver.quit();
        Runtime.getRuntime().exec("adb -s emulator-5554 emu kill");
    }

    @Test
    public void testValidSignUp() throws InterruptedException {

        System.out.println("Entered in testValidSignUp");
        for (int i = 0; i < 1; i++) {
            try {
                new SignUpPage(driver).registerWithPhoto();
                new MyProfilePage(driver).logout();
            } catch (Exception e) {
                takeScreenShot(driver);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testWithPointsData() throws InterruptedException {
        new SignUpPage(driver).registerWithPointsData("123@ma.ru", "12345678", "12345678", "Oleh Ponomarenko");
        new MyProfilePage(driver).logout();
    }

    @Test
    public void testMapping() throws InterruptedException {
        System.out.println("Entered in testMapping");

        for (int i = 0; i < 1; i++) {
            try {
                SignUpPage signUpPage = new SignUpPage(driver);
                SignInPage signInPage = new SignInPage(driver);
                DrawerPage drawerPage = new DrawerPage(driver);
                SearchPage searchPage = new SearchPage(driver);
                new BasePage(driver).waitForVisibilityOf(signUpPage.signUpButton);

                driver.findElement(signUpPage.signUpButton).click();

                driver.findElement(signInPage.signInButton).click();

                driver.findElement(signUpPage.signUpButton).click();

                signUpPage.validSignUp();

                drawerPage.drawerOpen();

                driver.navigate().back();

                drawerPage.drawerOpen();

                driver.findElement(drawerPage.drawerAvatar).click();

                drawerPage.drawerOpen();

                driver.findElement(drawerPage.searchButton).click();

                driver.findElement(searchPage.searchField).sendKeys("ANY TEXT");
                new BasePage(driver).hideKeyboard(driver);

                driver.findElement(searchPage.searchButton).click();

                driver.navigate().back();

                drawerPage.drawerOpen();

                driver.findElement(DrawerPage.drawerAvatar).click();

                driver.findElement(MyProfilePage.logoutButton).click();

                driver.navigate().back();
                System.out.println("Mapping - OK!");

            } catch (Exception e) {
                takeScreenShot(driver);
                e.printStackTrace();
            }
        }
    }

}
