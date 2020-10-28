package chatserver.server;

import java.io.OutputStream;
import java.net.Socket;

public class MyThread extends Thread {
    @Override
    public void run() {
        Socket clientSocket = serverSocket.accept();
        OutputStream outputStream = clientSocket.getOutputStream();
        // TODO: Write remaining code.
    }
}
