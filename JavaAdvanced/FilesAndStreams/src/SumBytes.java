import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String inputPath = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputPath))){
            String lines = input.readLine();
            int asciiSum = 0;
            while (lines != null){
                for (int i = 0; i < lines.length(); i++) {
                    asciiSum += lines.charAt(i);
                }
                lines = input.readLine();
            }
            System.out.println(asciiSum);
        }

    }
}
