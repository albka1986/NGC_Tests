package iOS.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilites.Terminal;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class iosSetup {

    public final static String BUILD_PATH = "/Users/oleh/Documents/App/NGC/iOS/build/sprint_2";
    public final static String BUILD_NAME = "Campfiire_2.2.0.app";
    protected AppiumDriver driver;


    protected void prepareIosSimulator() throws IOException, InterruptedException {

        Terminal.sendCommandToTerminal();

        File appDir = new File(BUILD_PATH);
        File app = new File(appDir, BUILD_NAME);
        System.out.println("Testing build: iOS, " + BUILD_NAME);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 5");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "10.1");
        capabilities.setCapability("udid", "17E09D32-9C73-4461-997F-F9F92CC1B64A");

        capabilities.setCapability("app", app.getAbsolutePath());

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Has prepared emulator");
    }


}
