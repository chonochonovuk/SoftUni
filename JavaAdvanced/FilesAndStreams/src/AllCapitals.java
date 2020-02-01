import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String inputPath = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
        String outputPath = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output1.txt";
        try(BufferedReader read = new BufferedReader(new FileReader(inputPath));
            PrintWriter write = new PrintWriter(new FileWriter(outputPath))){
            String lines = read.readLine();
            while (lines != null){

                lines = lines.toUpperCase();
                write.println(lines);
                lines = read.readLine();
            }
        }
    }
}
