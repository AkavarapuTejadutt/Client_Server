import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to the server!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));

            String serverMsg, clientMsg;
            while (true) {
                System.out.print("Client: ");
                clientMsg = clientInput.readLine();
                output.println(clientMsg);

                if (clientMsg.equalsIgnoreCase("exit")) {
                    System.out.println("Client ended the chat.");
                    break;
                }

                serverMsg = input.readLine();
                if (serverMsg.equalsIgnoreCase("exit")) {
                    System.out.println("Server ended the chat.");
                    break;
                }
                System.out.println("Server: " + serverMsg);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
