import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] intStr = scanner.nextLine().split("\\s+");
        ToIntFunction<String> toIntMap = Integer::parseInt;
        int toInt = Arrays.stream(intStr).mapToInt(toIntMap).min().getAsInt();
        System.out.println(toInt);
    }
}
