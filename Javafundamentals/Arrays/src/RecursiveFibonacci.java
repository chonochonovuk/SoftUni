import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        fibonacci(num);
    }

    private static void fibonacci(int num) {

        if (num == 1){
            System.out.println(1);
        }else if (num == 2){
            System.out.println(1 + " " + 1);
        }else{
            int a = 1;
            int b = 1;
            int sum = 0;
            for (int i = 3; i <= num ; i++) {

                sum = a + b;
                a = b;
                b = sum;
                
            }

            System.out.println(sum);
        }
    }
}
