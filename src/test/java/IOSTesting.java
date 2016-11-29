import config.MyListener;
import iOS.configDevice.IOSSetup;
import iOS.scenarios.RegistrationIOS;
import interfaces.Registration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilites.Utilities;

@Listeners(MyListener.class)
public class IOSTesting extends IOSSetup {


    @BeforeClass
    public void setUp() throws Exception {
        prepareIosSimulator();
    }

    @Test(invocationCount = 1)
    public void testApp() throws InterruptedException {
        System.out.println("Ready for tests");
        Thread.sleep(1000);

        Registration registration = new RegistrationIOS();
        registration.validRandomRegistration(driver);

        Thread.sleep(2000);
        Utilities.takeScreenShot(driver);
    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(5000);
//        driver.quit();
    }
}
