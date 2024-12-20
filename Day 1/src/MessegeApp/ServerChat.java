package MessegeApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {
    static  int port = 9999;
    public static void main(String[] args) throws IOException {
        System.out.println("\t \t Simple Socket Server");
        System.out.println("\t \t =====================");

        ServerSocket serverSocket = new ServerSocket(port);
        Scanner scannerInput = new Scanner(System.in);
        String input,output;
        try{
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("\t \t Client is Connected...\n \n");
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                try {
                    out.println("Welcome to socket programming");
                    while(true){
                        input = in.readLine();
                        System.out.println("Client says: " + input);

                        System.out.println("Client: ");
                        output = scannerInput.nextLine();
                        out.println(output);

                    }
                } finally {
                    socket.close();
                    out.close();
                    in.close();
                }
            }
        }finally {
            serverSocket.close();
        }
    }
}
