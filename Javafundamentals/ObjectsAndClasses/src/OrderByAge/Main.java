package OrderByAge;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persons> person = new ArrayList<>();
        String input;
        while (!"End".equals(input = scanner.nextLine())){
            String[] insert = input.split(" ");
            String names = insert[0];
            int ids = Integer.parseInt(insert[1]);
            int age = Integer.parseInt(insert[2]);

            Persons persons = new Persons(names,ids,age);
            person.add(persons);
        }

        person.stream().sorted(Persons::compareTo).forEach(System.out::println);
    }
}
