import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> users = new LinkedHashMap<>();
        String name;
        while (!"stop".equals(name = scanner.nextLine())){
            String email = scanner.nextLine();
            int dot = email.lastIndexOf(".");
            String afterDot = email.substring(dot);
            switch (afterDot){
                case ".us":
                case ".uk":
                case ".com":
                    break;
                default:
                    users.put(name,email);
                    break;

            }
        }
        users.entrySet().stream().forEach(s -> {
            System.out.println(s.getKey() + " -> " + s.getValue());
        });
    }
}
