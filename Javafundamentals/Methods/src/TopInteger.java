import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        TopNumber(number);
    }

    private static void TopNumber(int number) {

        for (int i = 11; i <= number; i++) {
            int check = 0;
            int sum = 0;
            boolean isOdd = false;

            int odd = i;

                do {
                    check = odd%10;

                   if (check % 2 != 0) {
                       isOdd = true;
                   }

                    odd = odd/10;
                    sum += check;
                }while (odd > 9);

                if (odd % 2 != 0){
                    isOdd = true;
                }

                sum += odd;

                if (sum % 8 == 0 && isOdd){
                    System.out.println(i);
                }


        }
    }
}
