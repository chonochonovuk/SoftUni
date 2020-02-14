package PatternStrategy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> sortPersons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] toArr = scanner.nextLine().split("\\s+");
            sortPersons.add(new Person(toArr[0],Integer.parseInt(toArr[1])));
        }

        TreeSet<Person> names = new TreeSet<>(new ComparingName());
        names.addAll(sortPersons);
        TreeSet<Person> ages = new TreeSet<>(new ComparingAge());
        ages.addAll(sortPersons);
        for (Person name : names) {
            System.out.println(name.getName() + " " + name.getAge());
        }
        for (Person age : ages) {
            System.out.println(age.getName() + " " + age.getAge());
        }


    }
}
