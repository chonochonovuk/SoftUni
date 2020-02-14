package GenericCountMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        GenericClass<Double> compareT = new GenericClass<>();
        for (int i = 0; i < n; i++) {
            compareT.add(Double.parseDouble(scanner.nextLine()));
        }
        System.out.println(compareT.compare(Double.parseDouble(scanner.nextLine())));
    }
}
