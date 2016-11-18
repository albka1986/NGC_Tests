package android.pages;/* Created by Ponomarenko Oleh on 07/11/16. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

public class SearchPage extends AndroidSetup {

    public static By searchField = By.id(APP_PACKAGE_NAME + "base_search_search_view_text");
    public By searchButton = By.id(APP_PACKAGE_NAME + "button_base_search_search");

}
