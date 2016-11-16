package android.config;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {

    final static String BUILD_NAME = "Campfiire-0.0.4_8-qaDebug.apk";
    protected AndroidDriver driver;

    protected void prepareAndroidDevice() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    protected void prepareAndroidEmulator() throws MalformedURLException {
        File appDir = new File("/Users/oleh/Google Drive/QA DRIVE/Applications/NGC/sprint 2");
        File app = new File(appDir, BUILD_NAME);
        System.out.println("Testing build: " + BUILD_NAME);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("avd", "LG_G4._API_22._Android_5.1");

        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("fullReset", "False");


        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }


}
