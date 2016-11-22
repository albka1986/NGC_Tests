package android.configDevice;

import config.MyListener;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {

    public static final String APP_PACKAGE_NAME = "com.erminesoft.ngc:id/";
    final static String BUILD_NAME = "Campfiire-0.0.5_20-qaDebug.apk";
    public static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void setDriver(AndroidDriver driver) {
        AndroidSetup.driver = driver;
    }

    public void prepareAndroidEmulator() throws MalformedURLException {
        File appDir = new File("/Users/oleh/Documents/App/NGC/Android/build/sprint_3");
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

        MyListener.setDriver(driver);
    }


}
