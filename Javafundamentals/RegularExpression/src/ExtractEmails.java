import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> emails = new ArrayList<>();
        String regex = "\\b([A-Za-z0-9]+[._-]?[A-Za-z0-9]+)@([A-Za-z]+[-]?[A-Za-z]+)(\\.[A-Za-z]+[-]?[A-Za-z]+)+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            emails.add(matcher.group());
        }

        for (String email : emails) {
            System.out.println(email);
        }

    }
}
