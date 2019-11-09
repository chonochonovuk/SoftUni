import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> students = new LinkedHashMap<>();
        String command;
        while (!"end".equals(command = scanner.nextLine())){
            String[] comArr = command.split(":");
            String course = comArr[0].trim();
            List<String> thisStudent = students.computeIfAbsent(course, k -> new ArrayList<>());
            thisStudent.add(comArr[1]);
        }
        for (Map.Entry<String, List<String>> allStu : students.entrySet()) {
            Collections.sort(allStu.getValue());
        }

        students.entrySet().stream().sorted((a,b) -> Integer.compare(b.getValue().size(),a.getValue().size())).forEach(e -> {
            System.out.printf("%s: %d%n",e.getKey(),e.getValue().size());

            e.getValue().stream().forEach(d -> System.out.println("--" + d));


        });

    }
}
