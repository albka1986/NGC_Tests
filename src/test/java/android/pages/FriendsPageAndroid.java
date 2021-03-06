package android.pages;/* Created by Ponomarenko Oleh on 30/12/16. */

import android.configDevice.AndroidSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilites.Utilities.sendKeys;
import static utilites.Utilities.waitAndTap;

public class FriendsPageAndroid extends AndroidSetup {
    private By acceptButton = By.id(APP_PACKAGE_NAME + "friends_invite_item_accept_btn");
    private By rejectButton = By.id(APP_PACKAGE_NAME + "friends_invite_item_reject_btn");
    private By searchButton = By.id(APP_PACKAGE_NAME + "search_button");
    private By query = By.id(APP_PACKAGE_NAME + "search_src_text");
    private By sendRequestButton = By.id(APP_PACKAGE_NAME + "user_profile_add_friend");


    public void acceptFriendship() {
        new DrawerPageAndroid().openMyProfile();
        new DrawerPageAndroid().openFriends();
        try {
            while (driver.findElement(acceptButton) != null) {
                waitAndTap(acceptButton);
                new DrawerPageAndroid().openFriends();
            }
        } catch (Exception e) {
        }
    }

    void rejectFriendship() {
        waitAndTap(rejectButton);
    }

    void findFriendInOwnList(String q) {
        waitAndTap(searchButton);
        sendKeys(query, q);
        driver.getKeyboard().pressKey(Keys.ENTER);
    }

    public void sendRequestFriendship() {
        waitAndTap(sendRequestButton);
    }
}
