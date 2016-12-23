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
    public final static String BUILD_NAME = "Campfiire-0.0.7_3-qaDebug.apk";
    public final static File app = new File(BUILD_PATH, BUILD_NAME);
    public static AndroidDriver driver;

    private final String udidMotorolaMotoE = "ZX1B24GVX2";
    private final String udidMotorolaMotoEWIFI = "192.168.0.92:5555";


    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void setDriver(AndroidDriver driver) {
        AndroidSetup.driver = driver;
    }

    public void prepareAndroidDevice() throws MalformedURLException {
        System.out.println("Testing build: " + BUILD_NAME);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", udidMotorolaMotoEWIFI); // Motorola Moto E
        capabilities.setCapability("deviceName", "AndroidEmulator");
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        MyListener.setDriver(driver);
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
