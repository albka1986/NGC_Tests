package adminPanel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

import static utilites.Utilities.waitAndTapBrowser;
import static utilites.Utilities.waitForVisibilityOfBrowser;

public class DrawerPage {


    private By drawerButton = By.xpath("/html/body/header/nav/a");
    private By directories = By.xpath("/html/body/div[1]/aside[1]/div/section/ul/li[9]/a/span");
    private By subDirectories = By.xpath("/html/body/div[1]/aside[1]/div/section/ul/li[9]/ul/li/a");
    private By addDoctor = By.xpath("/html/body/div[1]/aside[2]/section[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[3]/div/a[2]");

    public void openDrawer() {
        try {
            System.out.println("Drawer is opened");
        } catch (TimeoutException e) {
            waitAndTapBrowser(drawerButton);
        }
    }

    public void closeDrawer() {
        try {
            waitForVisibilityOfBrowser(directories);
            waitAndTapBrowser(drawerButton);

        } catch (TimeoutException e) {
            System.out.println("Drawer is closed");
        }
    }


    public void openDirectories() {
        waitAndTapBrowser(directories);
        waitAndTapBrowser(subDirectories);
    }

    public void addDoctor() {
        waitAndTapBrowser(addDoctor);
    }
}
