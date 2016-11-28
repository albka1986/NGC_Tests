package utilites;

import java.io.IOException;

public class Terminal {

    public static void sendCommandToTerminal() throws IOException, InterruptedException {
        System.out.println("Running Appium ");
        String command = "appium --reboot --address 127.0.0.1 --port 4723";
        Runtime.getRuntime().exec(command);
        Thread.sleep(5000);
        System.out.println("Appium launched");
    }
}
