package coding.chatserver.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    HashMap<String, ClientHandler> clientHandlers = new HashMap<String, ClientHandler>();

    public static void main(String[] args) throws IOException {
        System.out.println("Hello server");
        Server server = new Server();
        server.startServerAndWait();
    }

    private void startServerAndWait() throws IOException {
        ServerSocket serverSocket = createServerSocket();
        runServer();
    }

    /**
     * Creates the server socket.
     * @return port at which server is started
     * @throws IOException when server is not able to start at the port.
     */
    private ServerSocket createServerSocket() throws IOException {
        ServerSocket serverSocket = new ServerSocket(Constants.SERVER_PORT);
        System.out.printf("Server for chatting started at %d\n", Constants.SERVER_PORT);
        return serverSocket;
    }

    /**
     * Runs the server.
     * 
     * Note: Server should wait only for accepting new clients. 
     * Other things like chatting for a specific client should not be handled
     * in server thread so that is not blocked and can spend the time in 
     * accepting new clients.
     */
    private void runServer() {
        while(true) {
            // This is a blocking call and waits until a new client is connected.
            Socket clientSocket = waitForClientConnection();
            handleClientInNewThread(clientSocket);
        } 
    }

    private void handleClientInNewThread(Socket clientSocket) throws IOException {
        Thread thread = new Thread() { 
            public void run() {
                ClientHandler clientHandler = new ClientHandler(clientSocket, this);
                String clientName = clientHandler.getClientName();
                clientHandlers.put(clientName, clientHandler);
                // Note: This call should start the chatting in different thread so that server can accept another client.
                clientHandler.startChatting();
            }
        };
        // Never call run directly. Use start so that it can create a new thread in your computer.
        thread.start();
    }

    private ClientHandler getClientHandler(String name) {
        return clientHandlers.get(name);
    }





    
}
