import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userNames = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        for (String userName : userNames) {
            String s = userName.replaceAll("[a-zA-Z0-9_\\-]","");

            if (s.isEmpty() && userName.length() > 3 && userName.length() < 16){
                System.out.println(userName);
            }
        }

    }
}
