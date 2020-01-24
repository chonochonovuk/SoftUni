import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < times; i++) {
            String[] toArr = scanner.nextLine().split("\\s+");
            elements.addAll(Arrays.asList(toArr));
        }
        for (String element : elements) {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
}
