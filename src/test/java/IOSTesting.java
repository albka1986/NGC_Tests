import config.MyListener;
import iOS.configDevice.IOSSetup;
import iOS.scenarios.CampsIOS;
import iOS.scenarios.MappingIOS;
import iOS.scenarios.RegistrationIOS;
import interfaces.Camps;
import interfaces.Mapping;
import interfaces.Registration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class IOSTesting extends IOSSetup {

    Registration registration = new RegistrationIOS();
    Mapping mappingIOS = new MappingIOS();

    @BeforeClass
    public void setUp() throws Exception {
        prepareIosSimulator();
    }

    @Test(invocationCount = 30)
    public void testValidRandomRegistration() throws InterruptedException {
        System.out.println("Ready to test");

        registration.validRandomRegistration(driver);
    }

    @Test
    public void registrationByData() throws InterruptedException {
        System.out.println("Ready for test");

        registration.registrationByData(driver, "newUser5771@gmail.com", "5Th1LhQO3FZdkJ", ".RsOlGdAffObc.sZB", "", false);
        registration.logout(driver);
    }

    @Test
    public void mapping() throws InterruptedException {
        mappingIOS.mapper();
    }

    @Test
    public void camps() throws InterruptedException {
        Camps camps = new CampsIOS();
        camps.createCamp(10);
    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }
}
