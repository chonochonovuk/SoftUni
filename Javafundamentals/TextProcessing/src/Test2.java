import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] test = Arrays.stream(scanner.nextLine().split(" ")).toArray(String[]::new);
        String s = "";
        for (int i = 0; i < test.length; i++) {
            s += test[i].repeat(test[i].length());
        }

        System.out.println(s);

    }
}
