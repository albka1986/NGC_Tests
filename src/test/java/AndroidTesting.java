import android.configDevice.AndroidSetup;
import android.scenarios.MappingAndroid;
import android.scenarios.RegistrationAndroid;
import config.MyListener;
import interfaces.Mapping;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class AndroidTesting extends AndroidSetup {

    RegistrationAndroid registrationAndroid = new RegistrationAndroid();
    Mapping mappingAndroid = new MappingAndroid();

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidDevice();
        System.out.println("Has prepared device Android");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Quit");
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(invocationCount = 100)
    public void validRandomRegistration() throws InterruptedException {
        registrationAndroid.validRandomRegistration(driver);
    }

    @Test
    public void registrationByData() throws InterruptedException {
        registrationAndroid.registrationByData(driver, "mail4@mail.com", "12345678", "Oleh", "Odessa");
    }

    @Test
    public void mapping() throws InterruptedException {
        mappingAndroid.mapper("mail@mail.com", "12345678");
    }

}
