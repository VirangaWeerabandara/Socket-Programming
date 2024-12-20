package MessegeApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    static  int port = 9999;
    public static void main(String[] args) throws IOException {
        System.out.println("\t \t Simple Socket Server");
        System.out.println("\t \t =====================");

        ServerSocket serverSocket = new ServerSocket(port);
        try{
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("\t \t Client is Connected...\n \n");
                try {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.println("Welcome to socket programming");
                } finally {
                    socket.close();
                }
            }
        }finally {
            serverSocket.close();
        }
    }
}
