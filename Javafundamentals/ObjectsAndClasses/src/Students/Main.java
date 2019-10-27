package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> student = new ArrayList<>();
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < times ; i++) {
            String fName = scanner.next();
            String lName = scanner.next();
            double gradeA = scanner.nextDouble();

            Students students = new Students(fName,lName,gradeA);
            student.add(students);
        }

        student.stream().sorted((student1,student2) -> student2.getGrade().compareTo(student1.getGrade())).forEach(System.out::println);
    }
}
