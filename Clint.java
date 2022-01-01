//CLIENT

import java.net.*; 
import java.io.*;

public class Clint {

    public static void main(String[] args) throws Exception {

        byte []b = new byte[20002];

        // establish a connection
        Socket socket = new Socket("127.0.0.1", 4333);
        System.out.println("Connected");

        // takes input from terminal
        InputStream inputStream = socket.getInputStream();

        //path for file should be recived
        FileOutputStream fOutputStream = new FileOutputStream("/Users/farisali/Downloads/ttttttt.txt");

        // read and write the file
        inputStream.read(b, 0, b.length);
        fOutputStream.write(b, 0, b.length);

    }
    
}
