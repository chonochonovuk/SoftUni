import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        TopNumber(number);
    }

    private static void TopNumber(String number) {
        int check = 0;
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {


            int odd = i;
            if (odd % 2 != 0){
                do {
                    check += odd%10;
                    odd = odd/10;
                }while (odd > 9);
                check += odd;

                if (check % 8 == 0){
                    System.out.println(i);
                }
            }

        }
    }
}
