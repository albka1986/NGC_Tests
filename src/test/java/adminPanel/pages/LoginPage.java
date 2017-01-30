package adminPanel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static config.MyListener.getWebDriver;
import static utilites.Utilities.sendKeysBrowser;
import static utilites.Utilities.waitAndTapBrowser;

public class LoginPage {

    private final String address = "http://campfiire.gotests.com/login";
    WebDriver webDriver = getWebDriver();
    private String usernameDefault = "qa";
    private String passwordDefault = "4i?7662r*6z60bZ";
    private By fieldUsername = By.id("username");
    private By fieldPassword = By.id("password");
    private By buttonLogin = By.xpath("/html/body/div/form/div[3]/div[2]/button");

    public void loginByData(String username, String password) throws InterruptedException {
        if (!webDriver.getCurrentUrl().equals(address)) {
            getWebDriver().get(address);
        }
        sendKeysBrowser(fieldUsername, username);
        sendKeysBrowser(fieldPassword, password);
        waitAndTapBrowser(buttonLogin);
    }


    public void loginByDefaultData() {
        if (!webDriver.getCurrentUrl().equals(address)) {
            getWebDriver().get(address);
        }
        sendKeysBrowser(fieldUsername, usernameDefault);
        sendKeysBrowser(fieldPassword, passwordDefault);
        waitAndTapBrowser(buttonLogin);
    }
}
