package tests;

import org.testng.annotations.Test;
import utilites.SendCTRLC;

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




}
