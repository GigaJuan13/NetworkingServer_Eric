/* SERVER - may be enhanced to work for multiple clients */
import java.io.IOException;
import java.net. *;

public class NetworkingServer {
    public static void main(String[] args) {
    ServerSocket server = null;
    Socket client;

    // Default port number we are going to use
        int portnumber = 1234;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        // Creat server side socket
        try {
            server = new ServerSocket(portnumber);
        }
        catch (IOException ie) {
            System.out.println("Can't open socket." + ie);
            System.exit(1);
        }
        System.out.println("ServerSocket is created " + server);

        // Wait for the data from client and reply
        while (true){
            try {
                // Listens for a connection to be made to
            }
        }
    }
}