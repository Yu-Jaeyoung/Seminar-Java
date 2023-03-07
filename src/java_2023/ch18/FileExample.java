package java_2023.ch18;

import java_2023.ch15.Person;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("src/java_2023/ch18/Dir");
        File file1 = new File("src/java_2023/ch18/file1.txt");
        File file2 = new File("src/java_2023/ch18/file2.txt");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        if (!file1.exists()) {
            file1.createNewFile();
        }

        if (!file2.exists()) {
            file2.createNewFile();
        }

        File temp = new File("src/java_2023/ch18");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a HH:mm");
        File[] contents = temp.listFiles();
        System.out.println("날짜          시간       형태       크기    이름");
        System.out.println("------------------------------------------");
        for (File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.print("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
