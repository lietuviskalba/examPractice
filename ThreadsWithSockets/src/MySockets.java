import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mantas_MSI on 05-Dec-17.
 */
public class MySockets {

    //A socket is one end-point of a two-way communication link between two programs running on the network.
    //Socket classes are used to represent the connection between a client program and a server program
    //Used in TCP as it need to sockets to establish a connection

    public static void main(String[] args) {

        int portNumber = 2222;

        try {
            Socket MyClient = new Socket("Socket name is Jeff", portNumber);
            ServerSocket MyServerice = new ServerSocket(portNumber);

            MyServerice.accept();

        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
