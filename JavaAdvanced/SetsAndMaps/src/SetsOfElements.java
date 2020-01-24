import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] times = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        Set<Integer> m = new LinkedHashSet<>();
        for (int i = 0; i < times[0]; i++) {
            m.add(Integer.parseInt(scanner.nextLine()));
        }
        Set<Integer> n = new LinkedHashSet<>();
        for (int i = 0; i < times[1]; i++) {
            n.add(Integer.parseInt(scanner.nextLine()));
        }
        for (Integer integer : m) {
            if (n.contains(integer)){
                System.out.printf("%d ",integer);
            }
        }
        System.out.println();
    }
}
