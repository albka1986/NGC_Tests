package android.pages;/* Created by Ponomarenko Oleh on 07/11/16. */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {

    public static By searchField = By.id(APP_PACKAGE_NAME + "base_search_search_view_text");
    public By searchButton = By.id(APP_PACKAGE_NAME + "button_base_search_search");

    public SearchPage(AppiumDriver driver) {
        super(driver);
    }

}
