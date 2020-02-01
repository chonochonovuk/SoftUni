import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String input = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
        String output = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output2.txt";

        int space = ' ';
        int vowels = 0;
        int consonant = 0;
        int punctuation = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(input));
            PrintWriter printWriter = new PrintWriter(new FileWriter(output))){
            String line = reader.readLine();
            while (line != null){
                for (char c: line.toCharArray()) {
                    if (c == space){
                        continue;
                    }
                    if ("aeiou".indexOf(c) != -1){
                        vowels++;
                    }else if ("!,.?".indexOf(c) != -1){
                        punctuation++;
                    }else {
                        consonant++;
                    }


                }
               line = reader.readLine();

            }
            printWriter.println("Vowels: " + vowels);
            printWriter.println("Consonants: " + consonant);
            printWriter.println("Punctuation: " + punctuation);
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonant);
            System.out.println("Punctuation: " + punctuation);
        }
    }
}
