import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        String regex = "^([$]|[%])([A-Z][a-z]{2,})\\1(:\\s)(\\[[0-9]+\\])\\|(\\[[0-9]+\\])\\|(\\[[0-9]+\\])\\|$";
        for (int i = 0; i < times; i++) {
            String text = scanner.nextLine();
            printMatch(regex,text);
        }
    }

    private static void printMatch(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            char a = (char) Integer.parseInt(matcher.group(4).replaceAll("[\\[\\]]",""));
            char b = (char) Integer.parseInt(matcher.group(5).replaceAll("[\\[\\]]",""));
            char c = (char) Integer.parseInt(matcher.group(6).replaceAll("[\\[\\]]",""));

            System.out.printf("%s: %c%c%c%n",matcher.group(2),a,b,c);
            return;
        }

        System.out.println("Valid message not found!");
    }
}
