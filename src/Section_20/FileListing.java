package Section_20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileListing {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("");
        System.out.println("cwd = " + path.toAbsolutePath());

        Stream<Path> paths = Files.list(path);
    }
}
