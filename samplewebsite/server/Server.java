package samplewebsite.server;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        // We created a socket at server side on port 9876.
        // Note: Now 9876 port is busy, and no process in the
        // server machine can use this port.
        // Note: Now server can communicate to outside world like clients, using serverSocket (via 9876 port).
        ServerSocket serverSocket = new ServerSocket(9876);

        // Wait till some client tries to connect.
        // Once a client tries to connect, accept that connection.
        // Note: accept() is doing two things:
        // 1) waiting for some client to connect. aka it's listening.
        // 2) Once client tries to connect, it accepts that connection.
        // 3) After accepting the connection, gets the socket of that client.
        Socket clientSocket = serverSocket.accept();

        // Getting the output stream of the client socket.
        // Note: Output stream represents the data which will come from client to server.
        // Note: Output stream represents the data in byte format.
        OutputStream outputStream = clientSocket.getOutputStream();
        // Data output stream represents the data in Java's data types like Java's string, int, long.
        // That's why we are wrapping the outputStream object in dataOutputStream, so that we can use Java types instead of bytes.
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        // Writing the data to the pipe, so that it can go to the client.
        // Note: This data will not go to the client, as it is not yet flushed.
        dataOutputStream.writeUTF("Hello guys, I am the server. I need respect.");

        // Flushing the output data from server to client via socket pipe.
        dataOutputStream.flush();

        // Close the sockets
        // Note: Closing a socket helps in freeing the port quickly.
        // If the port is not closed, it can't be used by any other program/process in server's machine.
        clientSocket.close();
        serverSocket.close();

        // Closing the input and output streams
        // Note: Close all streams, and sockets, which are created to communicate with outside your world.
        // Your world is within your RAM area.
        // To talk with another process, hard disk files, another machine via ports, we need connections, and they should be closed after use.
        dataOutputStream.close();
        
    }
}
