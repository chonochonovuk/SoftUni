import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> taskHours = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = "";
        int index = 0;
        while (!"End".equals(command = scanner.nextLine())){
            String[] task = command.split(" ");
            switch (task[0]){
                case "Complete":
                    index = Integer.parseInt(task[1]);
                    if (index >= 0 && index < taskHours.size()){
                        taskHours.set(index,0);
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(task[1]);
                    int newHr = Integer.parseInt(task[2]);
                    if (index >= 0 && index < taskHours.size()){
                        taskHours.set(index,newHr);
                    }
                    break;
                case "Drop":
                    index = Integer.parseInt(task[1]);
                    if (index >= 0 && index < taskHours.size()){
                        taskHours.set(index,-1);
                    }
                    break;
                case "Count":
                    switch (task[1]) {
                        case "Completed":
                        int count = 0;
                        for (Integer taskHour : taskHours) {
                            if (taskHour == 0) {
                                count++;
                            }
                        }
                        System.out.println(count);
                        break;
                        case "Incomplete":
                            count = 0;
                            for (Integer taskHour : taskHours) {
                                if (taskHour > 0) {
                                    count++;
                                }
                            }
                            System.out.println(count);
                            break;
                        case "Dropped":
                            count = 0;
                            for (Integer taskHour : taskHours) {
                                if (taskHour < 0) {
                                    count++;
                                }
                            }
                            System.out.println(count);
                            break;
                    }
                    break;

            }
        }

        for (Integer taskHour : taskHours) {
            if (taskHour > 0) {
                System.out.print(taskHour + " ");
            }
        }
    }
}
