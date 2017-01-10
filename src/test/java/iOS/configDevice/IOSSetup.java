package iOS.configDevice;

import config.MyListener;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilites.Terminal;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class IOSSetup {

    public final static String BUILD_PATH = "/Users/oleh/Documents/App/NGC/iOS/build/sprint_6";
    public static String BUILD_NAME = "Campfiire.app";
    public static IOSDriver driver;

    public void prepareIosSimulator() throws IOException, InterruptedException {

//        Terminal.sendCommandToTerminalDetails();

        System.out.println("Setting capabilities...");
        File appDir = new File(BUILD_PATH);
        File app = new File(appDir, BUILD_NAME);
        System.out.println("Testing build: iOS, " + BUILD_NAME);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 5");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "10.1");
        capabilities.setCapability("udid", "17E09D32-9C73-4461-997F-F9F92CC1B64A");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("noReset", "true");

        System.out.println("Begin to create a new Driver");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Has prepared emulator");

        MyListener.setDriver(driver);
    }

    public void prepareIosDevice() throws IOException, InterruptedException {

        Terminal.sendCommandToTerminalDetails();
        BUILD_NAME = "Campfiire.app";
        System.out.println("Setting capabilities...");
        File appDir = new File(BUILD_PATH);
        File app = new File(appDir, BUILD_NAME);
        System.out.println("Testing build: iOS, " + BUILD_NAME);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 5");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "10.0.2"); //white iOS
        capabilities.setCapability("udid", "0dbccb9b899550db539a6be4533955a29880133d"); //white iOS
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("noReset", "true");

        System.out.println("Begin to create a new Driver");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Has prepared emulator");

        MyListener.setDriver(driver);
    }
}
