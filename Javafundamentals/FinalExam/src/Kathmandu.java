import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kathmandu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        while (!"Last note".equals(command = scanner.nextLine())){
            ifFound(command);
        }
    }

    private static void ifFound(String command) {
        String regex = "^([!@#$?A-Za-z0-9]+)=(\\d+)<<(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(command);
        if (matcher.find()){
            String name = matcher.group(1).replaceAll("[!@#$?]","");
            int length = Integer.parseInt(matcher.group(2));
            String toDecode = matcher.group(3);
            if (toDecode.length() != length){
                System.out.println("Nothing found!");
                return;
            }
            System.out.printf("Coordinates found! %s -> %s%n",name,toDecode);
            return;
        }

        System.out.println("Nothing found!");
    }
}
