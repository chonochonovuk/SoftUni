package OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            persons.add(new Person(data[0],Integer.parseInt(data[1])));
        }

        persons.stream().filter(a -> a.getAge() > 30)
                .sorted((a,b) -> a.getName().compareTo(b.getName()))
                .forEach(a -> System.out.println(a.getName() + " - " + a.getAge()));
    }
}
