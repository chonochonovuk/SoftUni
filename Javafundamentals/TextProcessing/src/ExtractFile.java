import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int dot = line.lastIndexOf('.');
        int lastLine = line.lastIndexOf('\\');
        String first = line.substring(lastLine + 1,dot);
        System.out.println("File name: " + first);
        String second = line.substring(dot + 1);
        System.out.println("File extension: " + second);

    }
}
