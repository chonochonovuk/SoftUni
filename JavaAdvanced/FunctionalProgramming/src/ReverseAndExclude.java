import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] scanInt = scanner.nextLine().split("\\s+");
        int numDiv = Integer.parseInt(scanner.nextLine());
        Predicate<Integer> isDiv = x -> x % numDiv != 0;
        Function<String,Integer> toInteger = Integer::parseInt;
        Consumer<Integer> print = ints -> System.out.print(ints + " ");
        List<Integer> divisible = new ArrayList<>();

        divisible = Arrays.stream(scanInt)
                .map(toInteger)
                .filter(isDiv)
                .collect(Collectors.toList());
        Collections.reverse(divisible);
        for (Integer i: divisible) {
            print.accept(i);
        }
        System.out.println();
    }
}
