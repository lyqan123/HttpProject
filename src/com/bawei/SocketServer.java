package com.bawei;



import javax.print.DocFlavor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket vSocket = serverSocket.accept();
        InputStream inputStream = vSocket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream outputStream = vSocket.getOutputStream();
        outputStream.write("客户端，我已经收到了".getBytes());
        vSocket.close();
        serverSocket.close();

    }
}
