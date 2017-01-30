package adminPanel.scenarios;

import adminPanel.pages.DrawerPage;
import adminPanel.pages.LoginPage;
import adminPanel.pages.Toolbar;
import model.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static config.MyListener.webDriver;
import static utilites.Utilities.*;

public class GeneratorInstances {
    DrawerPage drawerPage = new DrawerPage();
    private By fieldName = xpathContainsIdBrowser("name");
    private By fieldSpecialization = xpathContainsIdBrowser("specialization");
    private By fieldPhoneNumber = xpathContainsIdBrowser("cellPhone");
    private By fieldEmail = xpathContainsIdBrowser("email");
    private By fieldLocation = By.id("us3-address");
    private By buttonCreateReturn = By.name("btn_create_and_list");
    //    private By buttonCreateReturn = By.xpath("/html/body/div[1]/aside[2]/section[2]/div/form/div[3]/button[2]");
    private By fieldScheduleStartTime = xpathContainsIdBrowser("startTime");
    private By fieldScheduleEndTime = xpathContainsIdBrowser("finishTime");
    private By fieldWebSite = xpathContainsIdBrowser("webSite");

    public void createDoctor(Doctor doctor) {
        new LoginPage().loginByDefaultData();
        drawerPage.openDrawer();
        drawerPage.openDirectories();
        drawerPage.addDoctor();

        sendKeysBrowser(fieldName, doctor.getName());
        sendKeysBrowser(fieldSpecialization, doctor.getSpecialization());
        sendKeysBrowser(fieldPhoneNumber, doctor.getPhoneNumber());
        sendKeysBrowser(fieldEmail, doctor.getEmail());
        scrollBrowserToDown();
        setPhoto();
        webDriver.findElement(fieldLocation).clear();
        sendKeysBrowser(fieldLocation, doctor.getLocation());
        scrollBrowserToDown();
        waitAndTapBrowser(buttonCreateReturn);
        new Toolbar().logout();
    }


    public void createPainClinic(PainClinic painClinic) {
        new LoginPage().loginByDefaultData();
        drawerPage.openDrawer();
        drawerPage.openDirectories();
        drawerPage.addPainClinic();

        sendKeysBrowser(fieldName, painClinic.getName());
        sendKeysBrowser(fieldSpecialization, painClinic.getSpecialization());
        sendKeysBrowser(fieldPhoneNumber, painClinic.getPhoneNumber());
        sendKeysBrowser(fieldEmail, painClinic.getEmail());
        sendKeysBrowser(fieldScheduleStartTime, String.valueOf(painClinic.getScheduleStartTime()));
        sendKeysBrowser(fieldScheduleEndTime, String.valueOf(painClinic.getScheduleEndTime()));
        scrollBrowserToDown();
        setPhoto();
        webDriver.findElement(fieldLocation).clear();
        sendKeysBrowser(fieldLocation, painClinic.getLocation());
        scrollBrowserToDown();
        waitAndTapBrowser(buttonCreateReturn);
        new Toolbar().logout();

    }

    public void createLicensedProducer(LicensedProducer licensedProducer) {
        new LoginPage().loginByDefaultData();
        drawerPage.openDrawer();
        drawerPage.openDirectories();
        drawerPage.addLicensedProducer();

        sendKeysBrowser(fieldName, licensedProducer.getName());
        sendKeysBrowser(fieldPhoneNumber, licensedProducer.getPhoneNumber());
        sendKeysBrowser(fieldEmail, licensedProducer.getEmail());
        sendKeysBrowser(fieldWebSite, licensedProducer.getWebsite());
        setPhoto();
        webDriver.findElement(fieldLocation).clear();
        sendKeysBrowser(fieldLocation, licensedProducer.getLocation());
        sleep(2000);
        scrollBrowserToDown();
        sleep(2000);
        scrollBrowserToDown();
        waitAndTapBrowser(buttonCreateReturn);
        new Toolbar().logout();

    }

    public void createOnlineStore(OnlineStore onlineStore) {
        new LoginPage().loginByDefaultData();
        drawerPage.openDrawer();
        drawerPage.openDirectories();
        drawerPage.addOnlineStore();

        sendKeysBrowser(fieldName, onlineStore.getName());
        sendKeysBrowser(fieldPhoneNumber, onlineStore.getPhoneNumber());
        sendKeysBrowser(fieldEmail, onlineStore.getEmail());
        sendKeysBrowser(fieldWebSite, onlineStore.getWebsite());
        setPhoto();
        waitAndTapBrowser(buttonCreateReturn);
        new Toolbar().logout();
    }

    public void createDispensary(Dispensary dispensary) {
        new LoginPage().loginByDefaultData();
        drawerPage.openDrawer();
        drawerPage.openDirectories();
        drawerPage.addDispensary();

        sendKeysBrowser(fieldName, dispensary.getName());
        sendKeysBrowser(fieldPhoneNumber, dispensary.getPhoneNumber());
        sendKeysBrowser(fieldEmail, dispensary.getEmail());
        sendKeysBrowser(fieldScheduleStartTime, String.valueOf(dispensary.getScheduleStartTime()));
        sendKeysBrowser(fieldScheduleEndTime, String.valueOf(dispensary.getScheduleEndTime()));
        sleep(2000);
        scrollBrowserToDown();
        setPhoto();
        sleep(2000);
        scrollBrowserToDown();
        webDriver.findElement(fieldLocation).clear();
        sendKeysBrowser(fieldLocation, dispensary.getLocation());
        waitAndTapBrowser(buttonCreateReturn);
        new Toolbar().logout();


    }

    private void setPhoto() {
        WebElement fileInput = webDriver.findElement(By.xpath("//*[@id=\"file_ajax\"]"));
        fileInput.sendKeys("/Users/oleg/IdeaProjects/NGC_Tests/src/test/recources/images/doctor_avatar.png");
    }

    private void sleep(int x) {
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
