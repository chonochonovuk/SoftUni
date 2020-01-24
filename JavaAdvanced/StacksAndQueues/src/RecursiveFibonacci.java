import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Long> stack = new ArrayDeque<>();
        long a = 0;
        long b = 1;
            if (length == 0){
                System.out.println(1);
            }else{
                for (long i = 1; i <= length; i++) {
                    stack.push(a + b);
                    a = b;
                    b = stack.peek();
                }
                System.out.println(stack.peek());
            }




    }
}
