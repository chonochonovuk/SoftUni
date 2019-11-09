import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> users = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] register = scanner.nextLine().split(" ");
            String user = register[1];

            switch (register[0]){
                case "register":
                    String plate = register[2];
                    if (!users.containsKey(user)){
                        users.put(user,plate);
                        System.out.printf("%s registered %s successfully%n",user,plate);
                    }else {
                        System.out.printf("ERROR: already registered with plate number %s%n",users.get(user));
                    }
                    break;
                case "unregister":
                    if (!users.containsKey(user)){
                        System.out.printf("ERROR: user %s not found%n",user);
                    }else {
                        System.out.printf("%s unregistered successfully%n",user);
                        users.remove(user);
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> use : users.entrySet()) {
            System.out.printf("%s => %s%n",use.getKey(),use.getValue());
        }

    }
}
