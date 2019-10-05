import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double fail = 0;
        double good = 0;
        double veryGood = 0;
        double top = 0;
        double avg = 0;
        char c = '%';

        for(int k = 0; k < students; k++){
            double mark = Double.parseDouble(scanner.nextLine());
            if(mark >= 2.00 && mark <= 2.99){
                fail++;
            }else if(mark >= 3.00 && mark <= 3.99){
                good++;
            }else if(mark >= 4.00 && mark <= 4.99){
                veryGood++;
            }else if(mark >= 5.00){
                top++;
            }

            avg += mark;
        }

        avg = avg/students;
        fail = fail/students*100;
        good = good/students*100;
        veryGood = veryGood/students*100;
        top = top/students*100;

        System.out.printf("Top students: %.2f%c\n", top,c);
        System.out.printf("Between 4.00 and 4.99: %.2f%c\n", veryGood,c);
        System.out.printf("Between 3.00 and 3.99: %.2f%c\n", good,c);
        System.out.printf("Fail: %.2f%c\n", fail,c);
        System.out.printf("Average: %.2f", avg);

    }
}
