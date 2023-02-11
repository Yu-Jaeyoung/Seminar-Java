package java_2023.ch11;

import java.io.IOException;

public class KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100]; // 읽은 바이트르 ㄹ저장하기 위한 배열 생성

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes); // 배열에 읽은 바이트를 저장, 읽은 바이트수를 리턴

        String str = new String(bytes,0,readByteNo-1); // 배열을 문자열로 전환, -1 진행
        System.out.println(str);
    }
}
