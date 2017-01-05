package iOS.pages;/* Created by Ponomarenko Oleh on 04/01/17. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.*;

public class SearchPageIOS extends IOSSetup {

    public By request = xpathBuilderByValue("search");
    private By searchButton = By.name("Search");

    public void findUserByName(String name) throws InterruptedException {
        DrawerPageIOS drawerPageAndroid = new DrawerPageIOS();
        drawerPageAndroid.openSearch();
        driver.findElement(request).clear();
        sendKeys(request, name);
        hideKeyboard();
        pressSearchButton();
        openUserProfile(name);
    }


    private void openUserProfile(String name) {
        driver.scrollTo(name).click();
    }

    private void pressSearchButton() {
        waitAndTap(searchButton);
    }
}
