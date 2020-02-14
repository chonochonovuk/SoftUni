import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CustomMinFunctionSmart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intStr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Function<int[],Integer> findMin = num -> Arrays.stream(num).min().getAsInt();
        System.out.println(findMin.apply(intStr));


    }
}
