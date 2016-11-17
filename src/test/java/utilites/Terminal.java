package utilites;

import org.testng.annotations.Test;

import java.io.IOException;

public class Terminal {

    @Test
    public static void sendCommandToTerminal() throws IOException, InterruptedException {

        String command = "appium --reboot --address 127.0.0.1 --port 4723";
        Runtime.getRuntime().exec(command);
        Thread.sleep(5000);
    }
}
