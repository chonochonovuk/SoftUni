import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char c = (char) (line.charAt(i) + 3);
            code.append(c);
        }

        System.out.println(code);
    }
}
