package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        String command;
        while (!"END".equals(command = scanner.nextLine())){
            String[] array = command.split("\\s+");
            String name = array[0];
            String town = array[2];
            int age = Integer.parseInt(array[1]);
            personList.add(new Person(name,age,town));
        }
        int personNumber = Integer.parseInt(scanner.nextLine());
        if (personNumber >= 0 && personNumber < personList.size()){
            Person compare = personList.get(personNumber);
            int equals = 0;
            int not = 0;
            for (Person person1 : personList) {
                if (person1.compareTo(compare) == 0){
                    equals++;
                }
                if (person1.compareTo(compare) < 0){
                    not++;
                }
            }

            System.out.printf("%d %d %d",equals,not,personList.size());
        }else {
            System.out.println("No matches");
        }
    }
}
