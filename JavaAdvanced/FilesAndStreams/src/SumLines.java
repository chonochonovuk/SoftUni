import java.io.*;
import java.nio.file.Path;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String inputPath = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
        String outputPath = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))) {
            String lines = in.readLine();
            while (lines != null){
                int lineSum = 0;
                for (int i = 0; i < lines.length(); i++) {
                    lineSum += lines.charAt(i);
                }
                out.println(lineSum);
                lines = in.readLine();
            }
        }
    }
}
