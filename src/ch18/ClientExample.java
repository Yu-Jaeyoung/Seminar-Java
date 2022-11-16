package ch18;

import java.io.IOException;
import java.net.*;

public class ClientExample {
    public static void main(String[] args) {
        Socket socket = null; //Socket 생성
        try {
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5001)); // 연결 요청
            System.out.println("[연결 성공]");
        } catch (Exception e) {
        }

        if (!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e1) {
            }
        }
    }
}
