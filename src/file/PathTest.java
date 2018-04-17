package file;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathTest {
    public static void main(String[] args) {
        Path path = Paths.get(".");

        System.out.println(path.getNameCount());
        System.out.println(path.toAbsolutePath());

    }
}
