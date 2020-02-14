package GenericSwapMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        SwapBox<Integer> box = new SwapBox<>();
        for (int i = 0; i < times; i++) {
            box.add(Integer.parseInt(scanner.nextLine()));
        }
        String[] next = scanner.nextLine().split("\\s+");
        int first = Integer.parseInt(next[0]);
        int sec = Integer.parseInt(next[1]);
        box.swap(first,sec);
        box.printList();

    }
}
