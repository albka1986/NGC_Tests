package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.SendCTRLC;
import utilites.Utilities;

import java.io.IOException;

import static utilites.Utilities.trueOrFalse;

public class OthersTests {

    @org.testng.annotations.Test(invocationCount = 100)
    public void testFalseOrTrue() {
        boolean result = trueOrFalse();
        System.out.println(result);
    }

    @Test
    public void recorderTest() throws InterruptedException, IOException {

        try {
            Runtime.getRuntime().exec("adb shell screenrecord /sdcard/movie.mp4 --time-limit 1800");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread.sleep(10000);

        SendCTRLC sendCTRLC = new SendCTRLC();
        sendCTRLC.sendCTRLC(12437);


    }

    @Test(invocationCount = 10000)
    public void testRandomName() {
        String x = Utilities.nameMan();
        System.out.println(x);
        Assert.assertTrue(x.length() > 0);

        String y = Utilities.nameWoman();
        System.out.println(y);
        Assert.assertTrue(y.length() > 0);
    }


    @Test(invocationCount = 50000)
    public void testTopName() {
        String s = Utilities.randomTopName();
        Assert.assertNotNull(s);
        Assert.assertTrue(s.length() > 0);
        System.out.println(s);
    }

}
