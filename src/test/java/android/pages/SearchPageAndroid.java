package android.pages;/* Created by Ponomarenko Oleh on 03/01/17. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.*;

public class SearchPageAndroid extends AndroidSetup {

    private By request = By.id(APP_PACKAGE_NAME + "base_search_search_view_text");
    private By searchButton = By.id(APP_PACKAGE_NAME + "button_base_search_search");

    public void findUserByName(String name) {
        DrawerPageAndroid drawerPageAndroid = new DrawerPageAndroid();
        drawerPageAndroid.openSearch();
        sendKeys(request, name);
        hideKeyboard();
        pressSearchButton();

    }

    private void pressSearchButton() {
        waitAndTap(searchButton);
    }
}
