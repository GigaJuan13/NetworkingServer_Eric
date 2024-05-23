/* SERVER - may be enhanced to work for multiple clients */
import java.io.IOException;
import java.io.InputStream;
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
                // this socket and accepts it. The method blocks until
                // a connection is made
                System.out.println("Waiting for connect request...");
                client = server.accept();

                System.out.println("Connect request is accepted...");
                String clientHost = client.getInetAddress().getHostAddress();
                int clientPort = client.getPort();
                System.out.println("Client host = " + clientHost + " Client port = " + clientPort);

                // Read data from the client
                InputStream clientIn = client.getInputStream();
            }
        }
    }
}