//SERVER

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws Exception {
        // create Server
        ServerSocket serverSocket = new ServerSocket(4333);
        
        //accept clint
        Socket socket = serverSocket.accept();

        //path for file should be sent
        FileInputStream fileInputStream = new FileInputStream("/Users/farisali/Downloads/sample3.txt");
        byte []b = new byte[2002];

        //read file
        fileInputStream.read(b, 0, b.length);

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write(b, 0, b.length);

        
        
    }

}
