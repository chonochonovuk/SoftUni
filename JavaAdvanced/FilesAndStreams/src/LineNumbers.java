import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String input = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt";
        String output = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output3.txt";
        int lines = 1;
        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             PrintWriter printWriter = new PrintWriter(new FileWriter(output))){

            String line = reader.readLine();
            while (line != null){
                printWriter.println(lines + ". " + line);
                lines++;
                line = reader.readLine();
            }

        }


    }
}
