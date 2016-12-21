import android.configDevice.AndroidSetup;
import android.scenarios.MappingAndroid;
import config.MyListener;
import interfaces.Mapping;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;

@Listeners(MyListener.class)
public class ModificationAndroidTesting extends AndroidSetup {

    Mapping mappingAndroid = new MappingAndroid();

    private void prepareAndroidEmulator2() throws IOException, InterruptedException {

//        Terminal.sendCommandToTerminal2();
        System.out.println("Start setting Capabilities...");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("avd", "LG_G4");
        capabilities.setCapability("deviceName", "AndroidEmulator");
        capabilities.setCapability("platformVersion", "5.1");
        capabilities.setCapability("app", app.getAbsolutePath());
//        capabilities.setCapability("browserName", "");
        capabilities.setCapability("deviceOrientation", "portrait");
//        capabilities.setCapability("appiumVersion", "1.6.0");
//        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("deviceReadyTimeout", 120);
//        capabilities.setCapability("fullReset", "false");
//        capabilities.setCapability("noReset", "true");

        System.out.println("System is creating a new Driver...");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Its have created");
        MyListener.setDriver(driver);
    }

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidEmulator2();
    }

    @Test
    public void testSignIn() throws InterruptedException {
        System.out.println("Ready for test");
        mappingAndroid.signIn("mail@mail.com", "12345678");
        mappingAndroid.logout();

    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }
}
