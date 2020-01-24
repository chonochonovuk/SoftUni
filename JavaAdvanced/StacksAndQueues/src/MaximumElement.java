import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            switch (command){
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(stack.stream().max(Integer::compareTo).get());
                    break;
                default:
                    int toStack = Integer.parseInt(command.substring(2));
                    stack.push(toStack);
                    break;
            }
        }
    }
}
