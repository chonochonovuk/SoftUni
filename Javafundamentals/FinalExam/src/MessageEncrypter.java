import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageEncrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "([*]|[@])([A-Z][a-z]{3,})\\1(:\\s)(\\[[A-Za-z]\\])\\|(\\[[A-Za-z]\\])\\|(\\[[A-Za-z]\\])\\|$";
        int times = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < times; i++) {
            String toCheck = scanner.nextLine();
            validOrNot(regex,toCheck);
        }
    }

    private static void validOrNot(String regex, String toCheck) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(toCheck);
        if (matcher.find()){
            char a = matcher.group(4).charAt(1);
            char b = matcher.group(5).charAt(1);
            char c = matcher.group(6).charAt(1);
            int one = a;
            int two = b;
            int three = c;
            System.out.println(matcher.group(2) + matcher.group(3) + one + " " + two + " " + three);
            return;
        }
        System.out.println("Valid message not found!");
    }
}
