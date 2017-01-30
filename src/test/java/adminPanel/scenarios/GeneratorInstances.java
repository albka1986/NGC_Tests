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
        fileInput.sendKeys("/Users/oleg/IdeaProjects/NGC_Tests/src/test/resources/images/doctor_avatar.png");
    }

    private void sleep(int x) {
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void createDirectoryInstances(int amount) {


        for (int i = 0; i < amount; i++) {
            Doctor doctor = new Doctor();
            doctor.setName(nameMan());
            doctor.setSpecialization("psychiatrist");
            doctor.setPhoneNumber("777777779");
            doctor.setEmail("email10@mail.com");
            doctor.setLocation("Canada");
            createDoctor(doctor);

        }


        PainClinic painClinic = new PainClinic();
        painClinic.setName("Clini23c2");
        painClinic.setSpecialization("psyc23hiatrist2");
        painClinic.setPhoneNumber("77777237778");
        painClinic.setEmail("ma2il2@mail.com");
        painClinic.setScheduleStartTime(8);
        painClinic.setScheduleEndTime(20);
        painClinic.setLocation("Canada");
        createPainClinic(painClinic);


        LicensedProducer licensedProducer = new LicensedProducer();
        licensedProducer.setName("Bot 3");
        licensedProducer.setPhoneNumber("77771377");
        licensedProducer.setEmail("mail3@mai2l.com");
        licensedProducer.setWebsite("mail3@2mail.com");
        licensedProducer.setLocation("Canada");
        createLicensedProducer(licensedProducer);

        OnlineStore onlineStore = new OnlineStore();
        onlineStore.setName("Online Store 1");
        onlineStore.setPhoneNumber("7777777");
        onlineStore.setEmail("mail@mail.com3");
        onlineStore.setWebsite("http://google.com.ua");
        createOnlineStore(onlineStore);

        Dispensary dispensary = new Dispensary();
        dispensary.setName("Dispensary 2");
        dispensary.setEmail("mail2@mail.com");
        dispensary.setPhoneNumber("77777772");
        dispensary.setScheduleStartTime(8);
        dispensary.setScheduleEndTime(20);
        dispensary.setLocation("Canada");
        createDispensary(dispensary);

    }


}
