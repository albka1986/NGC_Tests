package adminPanel.configAdminPanel;

import config.MyListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdminPanelSetup {

    public static void prepareChrome() {
        System.setProperty("webdriver.chrome.driver", "/Users/oleg/IdeaProjects/NGC_Tests/src/test/resources/seleniumDrivers/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "/usr/libexec/SeleniumDrivers/chromedriverc/SeleniumDrivers/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-fullscreen");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://campfiire.gotests.com/");
        MyListener.setWebDriver(webDriver);
    }

}
