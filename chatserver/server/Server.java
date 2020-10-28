package chatserver.server;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6789);

        // Why did i made the anonymous inner class?
        // Because only one object of the inner class was required.
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    // IOException is a compile time exception.
                    Socket clientSocket = serverSocket.accept();
                    OutputStream outputStream = clientSocket.getOutputStream();
                    InputStream inputStream = clientSocket.getInputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                    DataInputStream dataInputStream = new DataInputStream(inputStream);

                    // Send a message to client that we are connected, and we can chat now.
                    dataOutputStream.writeUTF("[Server] - Hi client, we are connected, we can chat now. I am waiting for your message.");

                    Scanner scanner = new Scanner(System.in);
                    while (true) {
                        // It will wait for client to type the line, and then print it.
                        String input = dataInputStream.readUTF();
                        System.out.println("[Client] - " + input);

                        // Check if loops needs to be ended.
                        if ("bye".equals(input)) {
                            break;
                        }

                        // It will wait for server to type the line in terminal, and then get it.
                        dataOutputStream.writeUTF(scanner.nextLine());
                        dataOutputStream.flush();
                    }

                    // Close all sockets and streams
                    scanner.close();
                    inputStream.close();
                    dataInputStream.close();
                    dataOutputStream.close();
                    clientSocket.close();
                    serverSocket.close();
                } catch(IOException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        };

        thread.start();
        System.out.println("Hello, I am lined after thread.start()");
    }
}
