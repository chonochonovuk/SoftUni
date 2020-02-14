import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class PredicatePartySmartMini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String comm;
        while (!"Party!".equals(comm = scanner.nextLine())){
            String[] commArray = comm.split("\\s+");
            Predicate<String> check = returnPredicate(commArray[1],commArray[2]);
            List<String> collectIf = new ArrayList<>();
            names.forEach(n -> {
              if (check.test(n)){
                  collectIf.add(n);
              }
            });
            if (commArray[0].equals("Remove")){
                names.removeAll(collectIf);
            }else {
                names.addAll(collectIf);
            }
        }

        if (names.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            Collections.sort(names);
            System.out.println(names.toString().replaceAll("[\\[\\]]","") + " are going to the party!");
        }

    }

    private static Predicate<String> returnPredicate(String s, String s1) {

        switch (s){
            case "StartsWith":
                return str -> str.startsWith(s1);

            case "EndsWith":
                return str -> str.endsWith(s1);

            case "Length":
                return str -> str.length() == Integer.parseInt(s1);

        }
        return null;
    }
}
