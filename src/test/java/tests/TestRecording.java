package tests;/* Created by Ponomarenko Oleh on 26/12/16. */

import utilites.Record;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import static android.configDevice.AndroidSetup.DEVICE_MOTOROLA;

public class TestRecording {

    @org.testng.annotations.Test
    public void testRecording() throws IOException, InterruptedException, TimeoutException {
        Record.startRecord("android", DEVICE_MOTOROLA);
        Thread.sleep(20000);
        Record.stopVideo("android");
    }

}
