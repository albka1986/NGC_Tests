import adminPanel.scenarios.DrawerAdminPanel;
import adminPanel.scenarios.GeneratorInstances;
import adminPanel.scenarios.LoginAdminPanel;
import model.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static adminPanel.configAdminPanel.AdminPanelSetup.prepareChrome;
import static config.MyListener.webDriver;

public class AdminPanelTesting {
    GeneratorInstances generator;


    @BeforeClass
    public void setUp() {
        prepareChrome();
        generator = new GeneratorInstances();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(14000);
        webDriver.quit();
    }

    @Test
    public void login() {
        LoginAdminPanel login = new LoginAdminPanel();
        login.loginByDefaultData();
    }

    @Test
    public void testDrawer() {
        DrawerAdminPanel drawerAdminPanel = new DrawerAdminPanel();
        drawerAdminPanel.testOpenCloseDrawer();
    }

    @Test(invocationCount = 120)
    public void loginLogout() throws InterruptedException {
        LoginAdminPanel loginAdminPanel = new LoginAdminPanel();
        Thread.sleep(2000);

        loginAdminPanel.loginByDefaultData();
        Thread.sleep(2000);
        loginAdminPanel.logout();
    }

    @Test
    public void createDoctor() {
        Doctor doctor = new Doctor();
        doctor.setName("Oleh Ponomarenko8");
        doctor.setSpecialization("psychiatrist");
        doctor.setPhoneNumber("777777779");
        doctor.setEmail("email10@mail.com");
        doctor.setLocation("Canada");
        generator.createDoctor(doctor);
    }

    @Test
    public void createPainClinic() {
        PainClinic painClinic = new PainClinic();
        painClinic.setName("Clini23c2");
        painClinic.setSpecialization("psyc23hiatrist2");
        painClinic.setPhoneNumber("77777237778");
        painClinic.setEmail("ma2il2@mail.com");
        painClinic.setScheduleStartTime(8);
        painClinic.setScheduleEndTime(20);
        painClinic.setLocation("Canada");
        generator.createPainClinic(painClinic);
    }


    @Test
    public void createLicensedProducer() {
        LicensedProducer licensedProducer = new LicensedProducer();
        licensedProducer.setName("Bot 3");
        licensedProducer.setPhoneNumber("77771377");
        licensedProducer.setEmail("mail3@mai2l.com");
        licensedProducer.setWebsite("mail3@2mail.com");
        licensedProducer.setLocation("Canada");

        generator.createLicensedProducer(licensedProducer);
    }

    @Test
    public void createOnlineStore() {
        OnlineStore onlineStore = new OnlineStore();
        onlineStore.setName("Online Store 1");
        onlineStore.setPhoneNumber("7777777");
        onlineStore.setEmail("mail@mail.com3");
        onlineStore.setWebsite("http://google.com.ua");

        generator.createOnlineStore(onlineStore);
    }

    @Test
    public void createDispensary() {
        Dispensary dispensary = new Dispensary();
        dispensary.setName("Dispensary 2");
        dispensary.setEmail("mail2@mail.com");
        dispensary.setPhoneNumber("77777772");
        dispensary.setScheduleStartTime(8);
        dispensary.setScheduleEndTime(20);
        dispensary.setLocation("Canada");

        generator.createDispensary(dispensary);

    }


}
