import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> malesStack = new ArrayDeque<>();
        int[] malesSequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int m:malesSequence) {
            malesStack.push(m);
        }
        Deque<Integer> femalesQueue = new ArrayDeque<>();
        int[] femalesSequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int m:femalesSequence) {
            femalesQueue.offer(m);
        }

        int matches = 0;

        while (!malesStack.isEmpty() && !femalesQueue.isEmpty()){
            int male = malesStack.pop();
            if (male <= 0){
                    continue;
            }
            if (male % 25 == 0){
                if (!malesStack.isEmpty()){
                    malesStack.pop();
                    continue;
                }
            }
            int fame = femalesQueue.poll();
            if (fame <= 0){
                malesStack.push(male);
               continue;
            }
            if (fame % 25 == 0){
                if (!femalesQueue.isEmpty()){
                    femalesQueue.poll();
                }
                malesStack.push(male);
                continue;
            }

             if (fame == male){
                 matches++;
             }else {
                 malesStack.push(male - 2);
             }

        }
        System.out.printf("Matches: %d%n",matches);
        if (!malesStack.isEmpty()){
            System.out.print("Males left: ");
            while (!malesStack.isEmpty()){
                System.out.print(malesStack.poll());
                if (!malesStack.isEmpty()){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }else {
            System.out.println("Males left: none");
        }

        if (!femalesQueue.isEmpty()){
            System.out.print("Females left: ");
            while (!femalesQueue.isEmpty()){
                System.out.print(femalesQueue.poll());
                if (!femalesQueue.isEmpty()){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }else {
            System.out.println("Females left: none");
        }

    }
}
