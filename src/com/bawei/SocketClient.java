package com.bawei;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws Exception {
        Socket socketClient = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socketClient.getOutputStream();
        outputStream.write("你好服务器,收到请回复！！！".getBytes());
        InputStream inputStream = socketClient.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        socketClient.close();
    }
}
