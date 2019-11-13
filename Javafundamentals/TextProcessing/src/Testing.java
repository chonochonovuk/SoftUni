import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Double> studentAvg = new LinkedHashMap<>();
        String command;

        while (!"end".equals(command = scanner.nextLine())){
            String[] student = command.split(" ");
            String name = student[0];
            Double grade = Double.parseDouble(student[1]);

            studentAvg.merge(name,grade,Double::max);
        }

        for (Map.Entry<String, Double> stu : studentAvg.entrySet()) {
            System.out.println(stu.getKey() + " -> " + stu.getValue());
        }

    }
}
