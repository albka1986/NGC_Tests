import config.MyListener;
import iOS.configDevice.IOSSetup;
import iOS.pages.DrawerPageIOS;
import iOS.pages.MyProfilePageIOS;
import iOS.pages.SignInPageIOS;
import iOS.scenarios.*;
import interfaces.Camps;
import interfaces.Hotspot;
import interfaces.Registration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static utilites.Utilities.swipingToDownIOS;
import static utilites.Utilities.swipingToTopIOS;

@Listeners(MyListener.class)
public class IOSTesting extends IOSSetup {

    Registration registration = new RegistrationIOS();


    @BeforeClass
    public void setUp() throws Exception {
        prepareIosSimulator();
//        prepareIosDevice();
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

    @Test(invocationCount = 3)
    public void mapping() throws InterruptedException {
        MappingIOS mappingIOS = new MappingIOS();
        mappingIOS.mapper();
    }

    @Test
    public void camps() throws InterruptedException {
        Camps camps = new CampsIOS();
        camps.createCamp(3);
    }

    @Test
    public void hotspots() throws InterruptedException {
        Hotspot hotspot = new HotspotsIOS();
        hotspot.createHotspot(1);
    }


    @Test
    public void swiping() throws InterruptedException {
        new DrawerPageIOS().drawerOpen();
        Thread.sleep(2000);
        swipingToTopIOS();
        swipingToDownIOS();
    }


    @Test
    public void friendship() throws InterruptedException {
        FriendsIOS friendsIOS = new FriendsIOS();
        friendsIOS.friendship(10);
    }

    @Test
    public void signInByData() throws InterruptedException {
        SignInPageIOS signInPageIOS = new SignInPageIOS();
        signInPageIOS.signInByData("mail@mail.com", "12345678");
        MyProfilePageIOS myProfilePageIOS = new MyProfilePageIOS();
        myProfilePageIOS.logout();
    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        driver.closeApp();
        driver.quit();
    }
}
