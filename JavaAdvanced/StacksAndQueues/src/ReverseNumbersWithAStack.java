import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toArray = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String s : toArray) {
            stack.push(Integer.parseInt(s));
        }

        while (stack.size() > 1){
            System.out.print(stack.pop() + " ");
        }
        System.out.println(stack.pop());
        System.out.println();
    }
}
