package adminPanel.scenarios;

import adminPanel.pages.DrawerPage;
import adminPanel.pages.LoginPage;
import adminPanel.pages.Toolbar;
import model.Doctor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static config.MyListener.webDriver;
import static utilites.Utilities.*;

public class GeneratorInstances {
    private By fieldName = xpathContainsIdBrowser("name");
    private By fieldSpecialization = xpathContainsIdBrowser("specialization");
    private By fieldPhoneNumber = xpathContainsIdBrowser("cellPhone");
    private By fieldEmail = xpathContainsIdBrowser("email");
    private By fieldLocation = By.id("us3-address");
    private By buttonCreateReturn = By.xpath("/html/body/div[1]/aside[2]/section[2]/div/form/div[3]/button[2]");


    public void createDoctor(Doctor doctor) throws InterruptedException {
        DrawerPage drawerPage = new DrawerPage();

        new LoginPage().loginByDefaultData();
        drawerPage.openDrawer();
        drawerPage.openDirectories();
        drawerPage.addDoctor();


        sendKeysBrowser(fieldName, doctor.getName());
        sendKeysBrowser(fieldSpecialization, doctor.getSpecialization());
        sendKeysBrowser(fieldPhoneNumber, doctor.getPhoneNumber());
        sendKeysBrowser(fieldEmail, doctor.getEmail());
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,250)", "");
        webDriver.findElement(fieldLocation).clear();
        sendKeysBrowser(fieldLocation, doctor.getLocation());
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(3000);
        waitAndTapBrowser(buttonCreateReturn);
        new Toolbar().logout();
    }
}
