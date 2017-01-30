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
    private By addPainClinic = By.xpath("/html/body/div[1]/aside[2]/section[2]/div/div/div/div/div/div/table/tbody/tr[2]/td[3]/div/a[2]");
    private By licensedProducer = By.xpath("/html/body/div[1]/aside[2]/section[2]/div/div/div/div/div/div/table/tbody/tr[3]/td[3]/div/a[2]");
    private By onlineStore = By.xpath("/html/body/div[1]/aside[2]/section[2]/div/div/div/div/div/div/table/tbody/tr[4]/td[3]/div/a[2]");
    private By dispensary = By.xpath("/html/body/div[1]/aside[2]/section[2]/div/div/div/div/div/div/table/tbody/tr[5]/td[3]/div/a[2]");


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

    public void addPainClinic() {
        waitAndTapBrowser(addPainClinic);
    }

    public void addLicensedProducer() {
        waitAndTapBrowser(licensedProducer);
    }

    public void addOnlineStore() {
        waitAndTapBrowser(onlineStore);
    }

    public void addDispensary() {
        waitAndTapBrowser(dispensary);
    }

}
