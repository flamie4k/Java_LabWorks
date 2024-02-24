package Lab_9;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Server {
    public static void main(String[] args) {
        try {
            int port = 30002;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server running at port " + port);
            Socket socket = serverSocket.accept();
            
            DataInputStream din = new DataInputStream(socket.getInputStream());
            String msgFromClient = din.readUTF();
            msgFromClient = msgFromClient.toUpperCase();
            System.out.println("Message from client: " + msgFromClient);
            
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            dout.writeUTF(msgFromClient);
            
            dout.close();
            din.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
