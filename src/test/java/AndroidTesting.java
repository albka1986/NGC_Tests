import android.configDevice.AndroidSetup;
import android.scenarios.RegistrationAndroid;
import config.MyListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class AndroidTesting extends AndroidSetup {


    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidEmulator();
        System.out.println("Has prepared emulator Android");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Quit");
        Thread.sleep(30000);
        driver.quit();
        Runtime.getRuntime().exec("adb -s emulator-5554 emu kill");
    }

    @Test(invocationCount = 15)
    public void validRandomRegistration() throws InterruptedException {
        RegistrationAndroid registrationAndroid = new RegistrationAndroid();
        registrationAndroid.validRandomRegistration(driver);
    }

    @Test
    public void registrationByData() throws InterruptedException {
        RegistrationAndroid registrationAndroid = new RegistrationAndroid();
        registrationAndroid.registrationByData(driver, "qLOil@70jz.X0Y", "oxjCAryovRrwVK7", "g.dmhFFwT", "");
    }

/*    @Test(invocationCount = 1)
    public void testValidSignUp() throws InterruptedException {
        System.out.println("Entered in Android: testValidSignUp");
        new SignUpPage(driver).registerWithPhoto();
        new MyProfilePage(driver).logout();
    }

    @Test
    public void testWithPointsData() throws InterruptedException {
        new SignUpPage(driver).registerWithPointsData("asdasdasd2@ma.ru", "12345678", "12345678", "Oleh Ponomarenko");
        new MyProfilePage(driver).logout();
    }

    @Test (invocationCount = 1)
    public void testMapping() throws InterruptedException {
        System.out.println("Entered in testMapping");

        SignUpPage signUpPage = new SignUpPage(driver);
        SignInPage signInPage = new SignInPage(driver);
        DrawerPage drawerPage = new DrawerPage(driver);
        SearchPage searchPage = new SearchPage(driver);

        waitForVisibilityOf(driver, signUpPage.signUpButton);

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
        hideKeyboard(driver);

        driver.findElement(searchPage.searchButton).click();

        driver.navigate().back();

        drawerPage.drawerOpen();

        driver.findElement(DrawerPage.drawerAvatar).click();

        driver.findElement(MyProfilePage.logoutButton).click();

        driver.navigate().back();
        System.out.println("Mapping - OK!");

    }*/


}
