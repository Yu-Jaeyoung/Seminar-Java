package ch18;

import java.io.*;

public class SystemExample2 {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;

        byte[] datas = new byte[100];

        System.out.println("이름: ");
        int nameBytes = is.read(datas);
        String name = new String(datas, 0, nameBytes - 1);
        // 교제에는 -2(CRLF)로 나와있으나, UNIX OS에서는 한줄 내림을 LF 하나로 인식
        // -1로 변경하여야한다.
        // CR(캐리지 리턴) , LF(라인 피드)

        System.out.println("하고 싶은 말: ");
        int commentBytes = is.read(datas);
        String comment = new String(datas, 0, commentBytes - 1);

        System.out.println("입력한 이름: " + name);
        System.out.println("입력한 하고 싶은말: " + comment);
    }
}
