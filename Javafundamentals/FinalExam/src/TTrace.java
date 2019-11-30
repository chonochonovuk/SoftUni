import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TTrace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        while (!found){
            String coordinates = scanner.nextLine();
            found = ifFound(false,coordinates);
        }
    }

    private static boolean ifFound(boolean found,String coordinates) {
        String regex = "^([#&$%*])([A-Za-z]+)\\1=(\\d+)!!(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(coordinates);
        if (matcher.find()){
            int length = Integer.parseInt(matcher.group(3));
            String toEncrypt = matcher.group(4);
            StringBuilder encrypted = new StringBuilder();
            if (toEncrypt.length() != length){
                System.out.println("Nothing found!");
                return false;
            }

            for (int i = 0; i < length; i++) {
                char c = (char) (toEncrypt.charAt(i) + length);
                encrypted.append(c);
            }
            found = true;
            System.out.printf("Coordinates found! %s -> %s",matcher.group(2),encrypted);
            return true;
        }

        System.out.println("Nothing found!");
        return false;
    }
}
