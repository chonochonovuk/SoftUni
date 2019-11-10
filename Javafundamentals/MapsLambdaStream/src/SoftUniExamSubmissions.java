import java.util.*;

public class SoftUniExamSubmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> languageSubmissions = new LinkedHashMap<>();
        Map<String, List<Integer>> namePoints = new LinkedHashMap<>();
        String command;
        while (!"exam finished".equals(command = scanner.nextLine())){
            String[] nameLangPoint = command.split("-");
            String name = nameLangPoint[0];
            String lang = nameLangPoint[1];
            if (nameLangPoint.length > 2) {
                Integer points = Integer.parseInt(nameLangPoint[2]);
                languageSubmissions.merge(lang, 1, Integer::sum);
                List<Integer> nP = namePoints.computeIfAbsent(name, k -> new ArrayList<>());
                nP.add(points);
            }else {
                namePoints.remove(name);
            }

        }


        for (Map.Entry<String, List<Integer>> stuPoint : namePoints.entrySet()) {
            Collections.reverse(stuPoint.getValue());
        }


        System.out.println("Results:");
        namePoints.entrySet().stream().sorted((a1,a2) -> {
            int res = Integer.compare(a2.getValue().get(0),a1.getValue().get(0));
            if (res == 0){
                res = a1.getKey().compareTo(a2.getKey());
            }
            return res;
        }).forEach(c ->
                System.out.printf("%s | %d%n",c.getKey(),c.getValue().get(0)));

        System.out.println("Submissions:");
        languageSubmissions.entrySet().stream().sorted((a1,a2) -> {
            int res = Integer.compare(a2.getValue(),a1.getValue());
            if (res == 0){
                res = a1.getKey().compareTo(a2.getKey());
            }
            return res;
        }).forEach(f ->
                System.out.printf("%s - %d%n",f.getKey(),f.getValue()));



    }
}
