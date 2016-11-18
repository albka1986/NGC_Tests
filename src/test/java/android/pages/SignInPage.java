package android.pages;/* Created by Ponomarenko Oleh on 03/11/16. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;

public class SignInPage extends AndroidSetup {

    public By signInButton = By.id(APP_PACKAGE_NAME + "welcome_sign_in_tab");

}
