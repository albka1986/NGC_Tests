package utilites;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal {

    @Test
    public static void sendCommandToTerminalDetails() throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        System.out.println("Running Appium...");
        Runtime.getRuntime().exec("killall node");
        String command = "appium --reboot --address 127.0.0.1 --port 4723";
        Process proc = r.exec(command);

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
