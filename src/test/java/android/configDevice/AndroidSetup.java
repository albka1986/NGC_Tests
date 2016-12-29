package android.configDevice;

import config.MyListener;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {

    public static final String APP_PACKAGE_NAME = "com.erminesoft.ngc:id/";
    public final static String sprint = "5";
    public final static File BUILD_PATH = new File("/Users/oleh/Documents/App/NGC/Android/build/sprint_" + sprint);
    public final static String BUILD_NAME = "Campfiire-0.0.7_4-qaDebug.apk";
    public final static File app = new File(BUILD_PATH, BUILD_NAME);
    public static final String DEVICE_MOTOROLA = "ZX1B24GVX2";
    public static AndroidDriver driver;
    public final String DEVICE_MOTOROLA_WIFI = "192.168.0.92:5555";

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void setDriver(AndroidDriver driver) {
        AndroidSetup.driver = driver;
    }

    public void prepareAndroidDevice() throws MalformedURLException, InterruptedException {
        System.out.println("Testing build: " + BUILD_NAME);
        String device = DEVICE_MOTOROLA_WIFI;
        String platform = "Android";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", device); // Motorola Moto E
        capabilities.setCapability("deviceName", "AndroidEmulator");
        capabilities.setCapability("platformName", platform);
        capabilities.setCapability("app", app.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        System.out.println("driver is set");

        MyListener.setDriver(driver);
        MyListener.setDevice(device);
        MyListener.setPlatform(platform);
    }


    public void prepareAndroidEmulator() throws MalformedURLException {
        System.out.println("Testing build: " + BUILD_NAME);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("avd", "LG_G4");
        capabilities.setCapability("deviceName", "AndroidEmulator");
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        MyListener.setDriver(driver);
    }


}
