import javafx.application.Preloader;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = Integer.parseInt(scanner.nextLine());;
        int h = Integer.parseInt(scanner.nextLine());

       double d = (double) Factorial(s) / Factorial(h);

        System.out.printf("%.2f%n",d);
    }

    static long Factorial(int a){
        long c = 1;
        for (int f = 2; f <= a; f++){
            c *= f;
        }


        return c;
    }
}
