import iOS.configDevice.iosSetup;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilites.Utilities;

public class IosTesting extends iosSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareIosSimulator();
    }

    @Test
    public void testApp() throws InterruptedException {
        System.out.println("Waiting 1 second...");
        Thread.sleep(1000);
        driver.findElement(By.name("Sign Up")).click();


        Utilities.takeScreenShot(driver);

    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }
}
