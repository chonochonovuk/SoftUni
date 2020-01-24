import java.util.*;


public class RoboticsEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robotsArr = scanner.nextLine().split(";");
        String[] robots = new String[robotsArr.length];
        int[] processingTime = new int[robotsArr.length];
        int[] workingTime = new int[robotsArr.length];
        for (int i = 0; i < robotsArr.length; i++) {
            String[] fill = robotsArr[i].split("-");
            String name = fill[0];
            int time = Integer.parseInt(fill[1]);
            robots[i] = name;
            processingTime[i] = time;
        }
        ArrayDeque<String> products = new ArrayDeque<>();
        int[] timeArr = Arrays.stream(scanner.nextLine().split(":")).mapToInt(Integer::parseInt).toArray();
        int totalTime = (timeArr[0] * 3600) + (timeArr[1] * 60) + (timeArr[2]);
        String prodComm;
        while (!"End".equals(prodComm = scanner.nextLine())){
            products.offer(prodComm);
        }

        while (!products.isEmpty()){
            totalTime++;

            String thisProduct = products.poll();

            boolean isWorking = false;

            for (int i = 0; i < robotsArr.length; i++) {
                if (workingTime[i] == 0 && !isWorking){
                    isWorking = true;
                    workingTime[i] = processingTime[i];
                   printProcessing(totalTime,robots[i],thisProduct);
                }
                if (workingTime[i] > 0){
                    workingTime[i]--;
                }
            }

            if (!isWorking){
                products.offer(thisProduct);
            }

        }
    }

    private static void printProcessing(int totalTime, String robot, String thisProduct) {
        long sec = totalTime % 60;
        long min = (totalTime/60) % 60;
        long hour = (totalTime/(60 * 60)) % 24;
        System.out.println(robot + " - " + thisProduct + String.format(" [%02d:%02d:%02d] ", hour,min,sec));
    }
}
