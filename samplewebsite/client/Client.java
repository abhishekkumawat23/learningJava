package samplewebsite.client;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        // Connect to that port of the server machine, on which server socket is listening.
        // Host address is the server address to which we want to connect.
        // Note: 127.0.0.1 is the IP address of your machine, if you are referring from within.
        Socket clientSocket = new Socket("127.0.0.1", 9876);

        // Getting the input stream.
        // Whatever server writes to the client socket, client can read it from the input stream.
        // Note: We get data from input stream in bytes format.
        InputStream inputStream = clientSocket.getInputStream();

        // Using data input stream, we can access the input in Java data types.
        // Data input stream makes our life easier, as it uderstands Java data types instead of raw bytes type.
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        // Read the data which server sent us.
        String inputFromServer = dataInputStream.readUTF();
        System.out.println(inputFromServer);

        // Closing the socket
        clientSocket.close();
    }
}
