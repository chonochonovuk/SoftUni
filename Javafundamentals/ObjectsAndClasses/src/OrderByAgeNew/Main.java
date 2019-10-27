package OrderByAgeNew;

import java.util.ArrayList;
import java.util.Collections;
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

       Collections.sort(person);
        for (Persons persons : person) {
            System.out.println(persons);
        }
    }
}
