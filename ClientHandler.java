package coding.chatserver.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler {
    private Socket clientSocket;
    private PrintWriter writer;
    private BufferedReader reader;
    private Server server;

    public ClientHandler(Socket clientSocket, Server server) throws IOException {
        this.clientSocket = clientSocket;
        this.writer = new PrintWriter(clientSocket.getOutputStream());
        this.reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        this.server = server;
    }

    public void startChatting() {
        sendWelcomeMessage();
        String partner = askClientForPartnerName();
        connectWithPartner(partner);
        startChat();
    }

    private void sendWelcomeMessage() {
        writer.println(Constants.WELCOME_MSG);
    }

    private String getClientName() {
        writer.println(Constants.ASK_USER_NAME);
        return reader.readLine();
    }

    private String askClientForPartnerName() throws IOException {
        writer.println(Constants.ASK_PARTNER_NAME);
        return reader.readLine();
    }

    private void connectWithPartner(String partner) {
        ClientHandler partnerClientHandler = server.getClientHandler(partner);
    }
    
}
