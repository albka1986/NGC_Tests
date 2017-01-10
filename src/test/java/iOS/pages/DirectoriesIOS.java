package iOS.pages;/* Created by Ponomarenko Oleh on 06/01/17. */

import iOS.configDevice.IOSSetup;
import org.openqa.selenium.By;

import static utilites.Utilities.waitAndTap;

public class DirectoriesIOS extends IOSSetup {
    private By likeButton = By.name("like");

    public void pressLikeButton() {
        waitAndTap(likeButton);
    }

    public void selectObject(String name) {
        waitAndTap(By.name(name));
    /*    MobileElement element = (MobileElement) driver.findElement(By.name(name));
        System.out.println(element);
        while (element == null) {
            swipingToTopIOS();
            System.out.println("SWIPING...");
        }
        element.click();*/
    }

    public void selectCategory(String category) {
        waitAndTap(By.name(category));
    }
}
