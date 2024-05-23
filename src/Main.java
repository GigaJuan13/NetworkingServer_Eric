/* SERVER - may be enhanced to work for multiple clients */
import java.net. *;
import java.io. *;

public class NetworkingServer_Eric {
    public static void main(String[] args) {
    ServerSocket server = null;
    Socket client;

    // Default port number we are going to use
        int portnumber = 1234;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        // Creat server side socket

    }
}