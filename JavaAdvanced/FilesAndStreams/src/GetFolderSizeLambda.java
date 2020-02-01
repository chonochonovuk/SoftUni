import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GetFolderSizeLambda {
    public static void main(String[] args) throws IOException {
        Path folder = Path.of("/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources");
        long size = Files.walk(folder)
                .filter(p -> p.toFile().isFile())
                .mapToLong(p -> p.toFile().length())
                .sum();
        System.out.println("Folder size long with Lambda: " + size);
    }
}
