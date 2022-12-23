package java_2022.ch18;

import java.io.*;

public class SerialVersionUIDExample1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/java_2022.ch4.ch18/Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ClassC classC = new ClassC();
        classC.field1 = 1;
        oos.writeObject(classC);
        oos.flush();
        oos.close();
        fos.close();
    }
}
