import java.util.ArrayDeque;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operations = scanner.nextLine().split("\\s+");
        String[] numbers = scanner.nextLine().split("\\s+");
        int stackSize = Integer.parseInt(operations[0]);
        int popTotal = Integer.parseInt(operations[1]);
        int toCheck = Integer.parseInt(operations[2]);
        ArrayDeque<Integer> stack = new ArrayDeque<>(stackSize);
        for (int i = 1; i <= stackSize; i++) {
            stack.push(Integer.parseInt(numbers[i - 1]));
        }
        for (int i = popTotal; i > 0 ; i--) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println(0);
        }else if (stack.contains(toCheck)){
            System.out.println(true);
        }else {
            System.out.println(stack.stream().min(Integer::compareTo).get());
        }
    }
}
