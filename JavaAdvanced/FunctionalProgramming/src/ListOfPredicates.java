import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int n = 1;
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        List<Integer> fill = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            fill.add(i);
        }

        for (int num:numbers) {
            Predicate<Integer> checkDiv = x -> x % num == 0;
            fill = fill.stream().filter(checkDiv).collect(Collectors.toList());
        }
        fill.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
