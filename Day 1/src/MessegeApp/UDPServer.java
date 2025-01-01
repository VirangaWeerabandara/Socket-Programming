package MessegeApp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket server = new DatagramSocket(4411);
        byte[] receiveBuffer = new byte[25]; // Buffer to store incoming data

        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        server.receive(receivePacket);

        String response = new String(receivePacket.getData());
        System.out.println("Received: " + response);

        server.close();

    }
}
