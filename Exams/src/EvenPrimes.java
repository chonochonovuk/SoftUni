import java.util.Scanner;

public class EvenPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str1 = Integer.parseInt(scanner.nextLine());
        int str2 = Integer.parseInt(scanner.nextLine());
        int end1 = Integer.parseInt(scanner.nextLine());
        int end2 = Integer.parseInt(scanner.nextLine());


        for (int a = str1; a <= str1 + end1; a++) {

            for (int c = str2; c <= str2 + end2; c++) {


                if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0 && a % 7 != 0 && c % 2 != 0 && c % 3 != 0 && c % 5 != 0 && c % 7 != 0) {

                    System.out.printf("%d%d\n", a, c);

                }

            }
        }


    }
}
