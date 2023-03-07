package java_2023.ch18;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis;
        FileOutputStream fos;
        BufferedInputStream bis;
        BufferedOutputStream bos;

        int data = -1;
        long start = 0;
        long end = 0;

        fis = new FileInputStream("src/java_2023/ThisisJavaFront.jpeg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/java_2023/ch18/CopyedThisisJava.jpeg");
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("사용하지 않았을 때: " + (end - start) + "ms");

        fis = new FileInputStream("src/java_2023/ch18/CopyedThisisJava.jpeg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/ThisisJavaFront.jpeg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("사용했을 때: " + (end - start) + "ms");
    }
}
