package utilites;

import org.zeroturnaround.exec.ProcessExecutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;

import static utilites.Utilities.getTimeNow;

public class Record {

    public static void startRecord(String platform, String device) throws IOException {
        System.out.println("\n");
        String command = "flick video -a start -p android -c 36000 -e true -u ZX1B24GVX2";
        Process proc = Runtime.getRuntime().exec(command);

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void stopVideo(String platform) throws TimeoutException, IOException, InterruptedException {
        System.out.println("\nSaving video ...");
        List<String> commands = Arrays.asList("flick", "video", "-a", "stop", "-p", platform, "-n", "ngcAndroid" + getTimeNow(),
                "-o", "/Users/oleh/Documents/Intellij/NGC_Tests/records");
        new ProcessExecutor().command(commands).readOutput(true).execute().outputUTF8();
    }

    public static void cancelVideo(String platform) throws IOException, TimeoutException, InterruptedException {
        System.out.println("\nSaving video ...");
        List<String> commands = Arrays.asList("flick", "video", "-a", "stop", "-p", "android", "-n", "delete",
                "-o", "/Users/oleh/Documents/Intellij/NGC_Tests/records");
        new ProcessExecutor().command(commands).readOutput(true).execute().outputUTF8();
    }
}
