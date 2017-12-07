package UPDStuff;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by coag on 12-09-2017.
 */
//applications send packets of data, called datagrams, to one another. A datagram is an independent,
// self-contained message sent over the network whose arrival, arrival time, and content are not guaranteed.
//When you want to use for games, movie streams

public class MyUDP8081 {
    private static final int PORT_IN = 4568;
    private static final int PORT_OUT = 4567;
    private static final String IP_IN = "192.168.0.197";
    private static final String IP_OUT = "192.168.0.197";

    private static DatagramSocket socket;
    private static InetAddress inetAddressIn;
    private static InetAddress inetAddressOut;

    public static void main(String[] args) {
        System.out.println("app for sending is running now");

        try {
            inetAddressIn = InetAddress.getByName(IP_IN);//store the IP of ass whole who sends
            inetAddressOut = InetAddress.getByName(IP_OUT);//store the Ip of whomstdve you send out
            socket = new DatagramSocket(PORT_IN, inetAddressIn);//receives packages
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread tSend = new Thread(() -> {
            while (true) {
                byte[] dataOut;
                Scanner sc = new Scanner(System.in);// a scanner to type message
                System.out.println("Type your msg please:");
                String msgToSend = sc.nextLine();//type here
                dataOut = msgToSend.getBytes(); // store your message into a byte
                DatagramPacket packet = // store the message into a packet
                        new DatagramPacket(
                                dataOut,//packet
                                dataOut.length,//it's lengtn
                                inetAddressOut,// to whomstdve your sending it
                                PORT_OUT);//his port

                try {
                    socket.send(packet);// send packet
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("data was sent");
            }
        });

        Thread tRecive = new Thread(() -> {
            while (true) {
                byte[] dataIn = new byte[1024];//store received data in bytes
                DatagramPacket packetIn =// form a packet to receive
                        new DatagramPacket(dataIn,//the packet
                                dataIn.length);// it's length

                try {
                    socket.receive(packetIn);//a socket method to actualy receive the message
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("HERE IS THE DATA you assked for");
                String msgToPrint = (new String(dataIn));//print the message you got
                System.out.println(msgToPrint.trim());//kill of the emty spaces
            }
        });

        tSend.start();// start both treds
        tRecive.start();

    }
}
