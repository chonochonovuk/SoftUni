import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> phones = new LinkedHashMap<>();
        String command;
        while (!"search".equals(command = scanner.nextLine())){
            String[] toArr = command.split("-");
            phones.put(toArr[0],toArr[1]);
        }
        while (!"stop".equals(command = scanner.nextLine())){
            if (phones.containsKey(command)){
                System.out.println(command + " -> " + phones.get(command));
            }else {
                System.out.printf("Contact %s does not exist.%n",command);
            }
        }
    }
}
