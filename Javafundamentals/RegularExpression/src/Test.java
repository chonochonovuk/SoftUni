import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String regex = "[A-Za-z]+";
        String number = "\\d";
        String name = "G!32e%o7r#32g$235@!2e";
        Pattern pattern = Pattern.compile(regex);
        Pattern numbers = Pattern.compile(number);
        Matcher matcher = pattern.matcher(name);
        Matcher matchNumber = numbers.matcher(name);
        String realName = "";
        int realNumber = 0;
        while (matcher.find()){
           realName += matcher.group();
        }

        while (matchNumber.find()){
            realNumber += Integer.parseInt(matchNumber.group());
        }

        System.out.println(realName);
        System.out.println(realNumber);
    }
}
