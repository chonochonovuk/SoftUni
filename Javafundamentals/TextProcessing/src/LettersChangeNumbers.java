import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        totalSum(lines);

    }

    private static void totalSum(List<String> lines) {
        double sum = 0;
        for (int i = 0; i < lines.size(); i++) {
            String that = lines.get(i);
            String digit = that.replaceAll("\\D","");
            double num = Double.parseDouble(digit);
            int fist = that.indexOf(digit) - 1;
            int sec = that.indexOf(digit) + digit.length();
            char before = that.charAt(fist);
            char after = that.charAt(sec);

            if (Character.isUpperCase(before)){
                int divide = before - 64;
                num = num/divide;
            }

            if (Character.isLowerCase(before)){
                int multi = before - 96;
                num = num*multi;
            }

            if (Character.isUpperCase(after)){
                int minus = after - 64;
                num = (num - minus);
            }

            if (Character.isLowerCase(after)){
                int add = after - 96;
                num = (num + add);
            }
            sum += num;
        }

        System.out.printf("%.2f",sum);


    }
}
