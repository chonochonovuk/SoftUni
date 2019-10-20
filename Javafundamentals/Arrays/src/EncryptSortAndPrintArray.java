import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EncryptSortAndPrintArrays(scanner);
    }

    private static void EncryptSortAndPrintArrays(Scanner scanner) {
        int times = Integer.parseInt(scanner.nextLine());

        int[] sorted = new int[times];

        for (int i = 0; i < times ; i++) {
            String name = scanner.nextLine();
            double consunant = 0;
            double vowel = 0;
            int length = name.length();

            for (char c: name.toCharArray()
            ) {
                if ("aeiouAEIOU".indexOf(c) >= 0){
                    vowel += c*length;
                }else {
                    consunant += c/length;
                }
            }

            int maths = (int)(vowel + consunant);

            sorted[i] = maths;
        }

        int temp = 0;

        for (int i = 0; i < sorted.length ; i++) {

            for (int j = i + 1; j < sorted.length; j++) {

                if (sorted[i] > sorted[j]) {
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }

            }

        }


        for (int j = 0; j < sorted.length ; j++) {


            System.out.println(sorted[j]);

        }


    }

}
