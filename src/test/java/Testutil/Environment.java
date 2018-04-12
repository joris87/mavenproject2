package Testutil;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Tjitte Bouma on 09-01-2017.
 */
public class Environment {

    public static boolean isWindows() {
        if (System.getProperty("os.name").indexOf("Windows") == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static String getComputerName() {
        String computerName;
        try {
            computerName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            System.out.println("Could not determine computer name");
            computerName = "UNKNOWN";
        }
        return computerName;
    }
}
