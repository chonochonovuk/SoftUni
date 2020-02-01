import java.io.File;
import java.io.IOException;

public class GetFolderSize {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources");
        int size = 0;

        if (file.exists()){

            if (file.isDirectory()){
                File[] files = file.listFiles();
                for (File f : files) {
                    size += f.length();
                }

            }
        }
        System.out.println("Folder size: " + size);
    }
}
