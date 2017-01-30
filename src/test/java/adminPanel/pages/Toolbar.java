package adminPanel.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static config.MyListener.webDriver;
import static utilites.Utilities.waitAndTapBrowser;


public class Toolbar {
    private By profile = By.xpath("/html/body/header/nav/div[2]/ul/li[5]/a/i[2]");
    private By buttonLogout = By.xpath("/html/body/header/nav/div[2]/ul/li[5]/ul/ul/li/a");


    public void logout() {
        waitAndTapBrowser(profile);
        waitAndTapBrowser(buttonLogout);
        try {
            Alert alert = webDriver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {

        }
    }


}
