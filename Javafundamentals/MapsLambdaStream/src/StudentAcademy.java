import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrade = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            Double grade = scanner.nextDouble();


            List<Double> newStudent = studentGrade.computeIfAbsent(name, k -> new ArrayList<>());
            newStudent.add(grade);

        }

        Map<String,Double> allGrades = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> stG : studentGrade.entrySet()) {
            Double avg = stG.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (avg >= 4.50) {
                allGrades.put(stG.getKey(), avg);
            }
        }

        allGrades.entrySet().stream().sorted((a1,a2) -> a2.getValue().compareTo(a1.getValue())).forEach(s -> System.out.printf("%s -> %.2f%n",s.getKey(),s.getValue()));


    }
}
