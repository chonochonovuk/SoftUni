import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] commands = scanner.nextLine().split("\\s+");
        String[] toQueue = scanner.nextLine().split("\\s+");
        int toOffer = Integer.parseInt(commands[0]);
        int toPoll = Integer.parseInt(commands[1]);
        int toMatch = Integer.parseInt(commands[2]);
        for (int i = 1; i <= toOffer; i++) {
             queue.offer(Integer.parseInt(toQueue[i - 1]));
        }
        for (int i = toPoll; i > 0 ; i--) {
            queue.poll();
        }
        if (queue.isEmpty()){
            System.out.println(0);
        }else if (queue.contains(toMatch)){
            System.out.println(true);
        }else {
            System.out.println(queue.stream().min(Integer::compareTo).get());
        }
    }
}
