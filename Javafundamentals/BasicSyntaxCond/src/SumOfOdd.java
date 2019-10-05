import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = 0;
        int sum = 0;
        for(int i = 1; i <=  n ; i++){
                x = i*2 -1;
                System.out.println(x);
                sum += x;

        }

        System.out.println("Sum: " + sum);
    }
}
