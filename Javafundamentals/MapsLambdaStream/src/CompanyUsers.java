import com.sun.source.tree.IfTree;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,List<String>> allUsers = new LinkedHashMap<>();
        String ends;
        while (!"End".equals(ends = scanner.nextLine())){
            String[] user = ends.split(" -> ");
            String company = user[0];
            String employee = user[1];
            List<String> newUser = allUsers.computeIfAbsent(company,k -> new ArrayList<>());
            if (!newUser.contains(employee)){
                newUser.add(employee);
            }
        }

        allUsers.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(d -> {
            System.out.printf("%s%n",d.getKey());
            for (String s : d.getValue()) {
                System.out.printf("-- %s%n",s);
            }

        });
    }
}
