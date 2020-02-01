import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String input1 = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt";
        String input2 = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt";
        String output = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output4.txt";
        Map<String,Integer> countWords = new LinkedHashMap<>();
        try(BufferedReader scanner1 = new BufferedReader(new FileReader(input1));
            BufferedReader reader = new BufferedReader(new FileReader(input2));
            PrintWriter printWriter = new PrintWriter(output)){
            String[] words = scanner1.readLine().split("\\s+");
            String toCompare = reader.readLine();

            while (toCompare != null){
                int firstInx = 0;
                while (toCompare.indexOf(words[0] + " ",firstInx) != -1){
                    countWords.merge(words[0],1,Integer::sum);
                    int currentIndex = toCompare.indexOf(words[0],firstInx);
                    firstInx = currentIndex + words[0].length();
                }
                firstInx = 0;
                while (toCompare.indexOf(words[1] + " ",firstInx) != -1){
                    countWords.merge(words[1],1,Integer::sum);
                    int currentIndex = toCompare.indexOf(words[1],firstInx);
                    firstInx = currentIndex + words[1].length();
                }
                firstInx = 0;
                while (toCompare.indexOf(words[2] + " ",firstInx) != -1){
                    int currentIndex = toCompare.indexOf(words[2],firstInx);
                    if (toCompare.charAt(currentIndex + words[2].length()) == ' '){
                        countWords.merge(words[2],1,Integer::sum);
                    }
                    firstInx = currentIndex + words[2].length();
                }
                toCompare = reader.readLine();
            }

            for (Map.Entry<String, Integer> map : countWords.entrySet()) {
                printWriter.println(map.getKey() + " - " + map.getValue());
            }

        }

    }
}
