import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int obsh = 0;
        int that = 0;


        for (int sum = 1; sum <= n; sum++){
            that = sum;

            while (sum > 0) {

                obsh += sum % 10;

                sum = sum / 10;

            }

            if((obsh == 5) || (obsh == 7) || (obsh == 11)) {
                System.out.printf("%d -> True%n", that);
            }else{
                System.out.printf("%d -> False%n", that);
            }
            obsh = 0;
            sum = that;
        }
    }
}
