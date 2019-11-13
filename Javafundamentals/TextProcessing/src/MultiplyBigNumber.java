import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        BigDecimal longNumber = new BigDecimal(line);
        int multi = Integer.parseInt(scanner.nextLine());

        BigDecimal result = longNumber.multiply(new BigDecimal(multi));
        System.out.println(result);


    }
}
