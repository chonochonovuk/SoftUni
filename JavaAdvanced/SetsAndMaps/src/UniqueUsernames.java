import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        Set<String> names = new LinkedHashSet<>();
        for (int i = 0; i < length; i++) {
            names.add(scanner.nextLine());
        }
        names.stream().forEach(System.out::println);
    }
}
