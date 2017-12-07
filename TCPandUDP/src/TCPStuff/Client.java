package TCPStuff;

import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mantas_MSI on 05-Dec-17.
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("--Client up and running--");

        final int PORT = 12456;
        final String IP = "127.0.0.1";

        try {
            InetAddress inetAddress = InetAddress.getByName(IP);//get the IP for server
            Socket socket = new Socket(inetAddress, PORT);//end point to connect to server
            Scanner sc = new Scanner(socket.getInputStream());//receive message from the server
            String msg = sc.nextLine();//store all messages in a string
            System.out.println(msg);//display message
            socket.close();//close the socker

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

