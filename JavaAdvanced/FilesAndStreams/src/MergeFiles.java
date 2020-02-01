import java.io.*;

public class MergeFiles {
    public static void main(String[] args) throws IOException {
        String file1 = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputOne.txt";
        String file2 = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputTwo.txt";
        String file3 = "/home/chono/Desktop/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output5.txt";
        File[] files = new File[2];
        files[0] = new File(file1);
        files[1] = new File(file2);
        File mergedFile = new File(file3);
        try(PrintWriter printWriter = new PrintWriter(new FileWriter(mergedFile,true))){
            for (File f : files) {
                try (
                        FileInputStream fis = new FileInputStream(f);
                        BufferedReader in = new BufferedReader(new InputStreamReader(fis))){
                        String line = in.readLine();
                        while (line != null){
                            printWriter.println(line);
                            line = in.readLine();
                        }
                }
            }

        }
    }
}
