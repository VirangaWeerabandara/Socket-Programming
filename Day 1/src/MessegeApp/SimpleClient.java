package MessegeApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class SimpleClient {
    static int port = 9999;

    public static void main(String[] args) throws IOException {
        System.out.println("\t \t Simple Socket Client");
        System.out.println("\t \t =====================");

        InetAddress ipAddress = InetAddress.getLocalHost();

        Socket socket = new Socket(ipAddress, port);
        System.out.println("Server is Connected...");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String input = in.readLine();

        System.out.println("Server says: " + input);
        System.out.println("Closing the Connection...");
        socket.close();
        in.close();

        System.exit(0);
    }
}
