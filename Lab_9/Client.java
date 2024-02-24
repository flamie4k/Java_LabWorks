package Lab_9;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner scanner = new Scanner(System.in);
        
        try {
            Socket socket = new Socket("127.0.0.1", 30002);
            System.out.println("Trying to connect to server...");
            System.out.println("Enter message: ");
            String message = scanner.nextLine();
            
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            dout.writeUTF(message);
            
            DataInputStream din = new DataInputStream(socket.getInputStream());
            String response = din.readUTF();
            
            System.out.println("Response from server: " + response);
            
            dout.close();
            din.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
