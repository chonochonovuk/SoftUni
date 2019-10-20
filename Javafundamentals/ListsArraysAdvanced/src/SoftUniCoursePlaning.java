import com.sun.source.tree.IfTree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPlan = scanner.nextLine();
        List<String> plan = Arrays.stream(firstPlan.split(",\\s+")).collect(Collectors.toList());
        String scan = "";
        while (!"course start".equals(scan = scanner.nextLine())){
            String[] schedule = scan.split(":");
            switch (schedule[0]){

                case "Add":
                    if (plan.contains(schedule[1])){
                        continue;
                    }

                    plan.add(schedule[1]);
                    break;
                case "Insert":
                    if (plan.contains(schedule[1])){
                        continue;
                    }
                    int index = Integer.parseInt(schedule[2]);
                    plan.add(index,schedule[1]);
                    break;
                case "Remove":
                    if (!plan.contains(schedule[1])){
                        continue;
                    }
                    plan.remove(schedule[1]);
                    break;
                case "Swap":
                    if(!plan.contains(schedule[1])){
                        continue;
                }
                if (!plan.contains(schedule[2])){
                    continue;
                }
                    String exerciseSw1 = schedule[1] + "-Exercise";
                    String exerciseSw2 = schedule[2] + "-Exercise";

                if (plan.contains(exerciseSw1) && plan.contains(exerciseSw2)) {

                    int first = plan.indexOf(schedule[1]);
                    int inxExer1 = plan.indexOf(exerciseSw1);
                    int sec = plan.indexOf(schedule[2]);
                    int inxExer2 = plan.indexOf(exerciseSw2);
                    plan.set(first, schedule[2]);
                    plan.set(sec, schedule[1]);
                    plan.set(first + 1, exerciseSw2);
                    plan.set(sec + 1, exerciseSw1);
                }else if(plan.contains(exerciseSw1)){
                    int first = plan.indexOf(schedule[1]);
                    int inxExer1 = plan.indexOf(exerciseSw1);
                    int sec = plan.indexOf(schedule[2]);
                    plan.remove(inxExer1);
                    plan.set(first, schedule[2]);
                    plan.set(sec, schedule[1]);
                    plan.add(sec + 1, exerciseSw1);

                }else if (plan.contains(exerciseSw2)){
                    int first = plan.indexOf(schedule[1]);
                    int inxExer2 = plan.indexOf(exerciseSw2);
                    int sec = plan.indexOf(schedule[2]);
                    plan.remove(inxExer2);
                    plan.set(first, schedule[2]);
                    plan.set(sec, schedule[1]);
                    plan.add(first + 1, exerciseSw2);


                }else{
                    int first = plan.indexOf(schedule[1]);
                    int sec = plan.indexOf(schedule[2]);
                    plan.set(first, schedule[2]);
                    plan.set(sec, schedule[1]);

                }
                    break;
                case "Exercise":
                    String exercise = schedule[1] + "-Exercise";
                    if (!plan.contains(exercise)){
                        if (!plan.contains(schedule[1])) {
                            plan.add(schedule[1]);
                            plan.add(exercise);
                        }else {
                            int inxLesson = plan.indexOf(schedule[1]);
                            plan.add(inxLesson + 1 ,exercise);
                        }

                    }


                    break;
            }
        }

        for (int i = 0; i < plan.size() ; i++) {

            System.out.printf("%d.%s%n",i + 1,plan.get(i));

        }
    }
}
