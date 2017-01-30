import adminPanel.scenarios.DrawerAdminPanel;
import adminPanel.scenarios.GeneratorInstances;
import adminPanel.scenarios.LoginAdminPanel;
import model.Doctor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static adminPanel.configAdminPanel.AdminPanelSetup.prepareChrome;
import static config.MyListener.webDriver;

public class AdminPanelTesting {

    @BeforeClass
    public void setUp() {
        prepareChrome();
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
    public void createDoctor() throws InterruptedException {
        GeneratorInstances generator = new GeneratorInstances();
        Doctor doctor = new Doctor();
        doctor.setName("Oleh Ponomarenko8");
        doctor.setSpecialization("psychiatrist");
        doctor.setPhoneNumber("777777779");
        doctor.setEmail("email10@mail.com");
        doctor.setLocation("Canada");

        generator.createDoctor(doctor);

    }


}
