import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int result = 0;

        for (int i = 0; i <= num.length() - 1; i++){
            int sum = Character.getNumericValue(num.charAt(i));

            result += sum;

        }
        System.out.println(result);
    }
}
