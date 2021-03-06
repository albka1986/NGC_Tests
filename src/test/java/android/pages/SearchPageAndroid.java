package android.pages;/* Created by Ponomarenko Oleh on 03/01/17. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.*;

public class SearchPageAndroid extends AndroidSetup {

    private By request = By.id(APP_PACKAGE_NAME + "base_search_search_view_text");
    private By searchButton = By.id(APP_PACKAGE_NAME + "button_base_search_search");

    public void findUserByName(String name) throws InterruptedException {
        DrawerPageAndroid drawerPageAndroid = new DrawerPageAndroid();
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
