package TCPStuff;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mantas_MSI on 05-Dec-17.
 */
public class Server {


    //provides a reliable, point-to-point communication channel that client-server applications on the Internet
    // use to communicate with each other. To communicate over TCP, a client program and a server program establish a
    // connection to one another. Each program binds a socket to its end of the connection.
    // To communicate, the client and the server each reads from and writes to the socket bound to the connection.
    //USed for chat messages, bank transfers

    public static void main(String[] args) {
        System.out.println("--Server up--");
        final int PORT = 12456;


        try {
            ServerSocket server = new ServerSocket(PORT);//clients accept socket
            Socket socket = server.accept();//accept request
            System.out.println("**A new Russian is connected**");//display when a client conncected
            String welcomeMsg = "добро пожаловать";//a welcome message for them
            PrintWriter out = new PrintWriter(socket.getOutputStream());//class to print messages
            out.write(welcomeMsg);//writes the message to client
            out.flush();//make sure no message data is left
            out.close();//close the stream
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
