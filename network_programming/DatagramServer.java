import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(5000);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        System.out.println("Server is running and waiting for messages...");
        serverSocket.receive(packet);

        String message = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received from client: " + message);

        serverSocket.close();
    }
}
