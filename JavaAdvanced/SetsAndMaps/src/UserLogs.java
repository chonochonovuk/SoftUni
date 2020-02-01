import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,Integer>> users = new TreeMap<>();
        String messages;
        while (!"end".equals(messages = scanner.nextLine())){

            checkAddUsers(messages,users);
        }
        users.entrySet().stream().forEach(a -> {
            System.out.println(a.getKey() + ":");
            int size = a.getValue().size();
            for (Map.Entry<String, Integer> map : a.getValue().entrySet()) {
                if (size > 1) {
                    System.out.print(map.getKey() + " => " + map.getValue() + ", ");
                    size--;
                } else {
                    System.out.println(map.getKey() + " => " + map.getValue() + ".");
                }
            }

        });

    }

    private static void checkAddUsers(String messages, Map<String, Map<String, Integer>> users) {
       int checkIp = messages.indexOf("IP=");
       int checkMess = messages.indexOf("message=");
       int checkUser = messages.indexOf("user=");
       if ((checkIp != -1) && (checkMess != -1) && (checkUser != -1)){
           String ip = messages.substring(3,checkMess - 1);
           String user = messages.substring(checkUser + 5);
           users.computeIfAbsent(user,k -> new LinkedHashMap<>());
           users.get(user).merge(ip,1,Integer::sum);
       }
    }
}
