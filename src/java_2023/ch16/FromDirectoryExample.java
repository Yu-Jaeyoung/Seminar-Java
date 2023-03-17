package java_2023.ch16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/java_2023/ch16");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p -> System.out.println(p.getFileName()));
    }
}