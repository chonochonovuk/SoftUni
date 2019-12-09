import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            checkMessage(message);
        }
    }

    private static void checkMessage(String message) {
        String regex = "^!([A-Z][a-z]{2,})!:(\\[[A-Za-z]{8,}\\])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        if (matcher.find()){
            String charPrint = matcher.group(2).replaceAll("[\\[\\]]","");
            System.out.print(matcher.group(1) + ":");
            for (int i = 0; i < charPrint.length(); i++) {
                int value = charPrint.charAt(i);
                System.out.printf(" %d",value);
            }
            System.out.println();
        }else {
            System.out.println("The message is invalid");
        }
    }
}
