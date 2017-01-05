package android.pages;/* Created by Ponomarenko Oleh on 04/01/17. */

import android.configDevice.AndroidSetup;

public class NavigationAndroid extends AndroidSetup {

    public void back() {
        driver.navigate().back();
    }
}
