package EqualityLogic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<Person> sortedTree = new TreeSet<>();
        HashSet<Person> sortedHash = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split("\\s+");
            int age = Integer.parseInt(arr[1]);
            sortedTree.add(new Person(arr[0],age));
            sortedHash.add(new Person(arr[0],age));
        }

        System.out.println(sortedTree.size());
        System.out.println(sortedHash.size());

    }
}
