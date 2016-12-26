package utilites;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal {

    public static void sendCommandToTerminal() throws IOException, InterruptedException {
        System.out.println("Running Appium ");
        String command = "appium --reboot --address 127.0.0.1 --port 4723";
        Runtime.getRuntime().exec(command);
        Thread.sleep(15000);
        System.out.println("Appium launched");
    }

    @Test
    public static void sendCommandToTerminalDetails() throws IOException, InterruptedException {
        System.out.println("Running Appium...");
        Runtime.getRuntime().exec("killall node");
        String command = "appium --reboot --address 127.0.0.1 --port 4723";
        Process proc = Runtime.getRuntime().exec(command);

        // Read the output

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        m:
        while ((line = reader.readLine()) != null) {
            System.out.print(line + "\n");
            if (line.contains("Appium REST http interface listener started on 127.0.0.1:4723")) {
                break m;
            }
        }
    }


}
