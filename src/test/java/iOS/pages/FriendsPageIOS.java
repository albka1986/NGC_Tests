package iOS.pages;/* Created by Ponomarenko Oleh on 04/01/17. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.tapOn;
import static utilites.Utilities.waitAndTap;

public class FriendsPageIOS extends IOSSetup {
    private By sendRequestButton = By.name("addFriendIc");
    private By acceptFriendship = By.name("Accept");
    private By rejectFriendship = By.name("");

    public void acceptFriendship() {
        new DrawerPageIOS().openFriends();
        try {
            while (true) {
                tapOn(acceptFriendship);
            }
        } catch (Exception e) {
            System.out.println("You don't have any invite");
        }

    }

    public void sendRequestFriendship() {
        waitAndTap(sendRequestButton);
    }
}
