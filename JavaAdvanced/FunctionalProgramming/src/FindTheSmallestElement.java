import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toList = scanner.nextLine().split("\\s+");
        int min  = Arrays.stream(toList).mapToInt(Integer::parseInt).min().getAsInt();
        List<String> ifWork = new ArrayList<>(Arrays.asList(toList));
        System.out.println(ifWork.lastIndexOf(String.valueOf(min)));
    }
}
