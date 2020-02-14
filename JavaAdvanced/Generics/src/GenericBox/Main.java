package GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < times; i++) {
            Box<Integer> lines = new Box<>(Integer.parseInt(scanner.nextLine()));
            System.out.println(lines);
        }
    }
}
