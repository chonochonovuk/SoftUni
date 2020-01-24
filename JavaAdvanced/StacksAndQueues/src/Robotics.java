import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robotsArr = scanner.nextLine().split(";");
        int[] timeArr = Arrays.stream(scanner.nextLine().split(":")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<String> productQueue = new ArrayDeque<>();
        ArrayDeque<String> robotsQueue = new ArrayDeque<>();
        Map<String, String> robotsTiming = new LinkedHashMap<>();
        String productsAll;
        int clock = 1;
        for (int i = 0; i < robotsArr.length; i++) {
            robotsQueue.offer(robotsArr[i]);
        }
        while (!"End".equals(productsAll = scanner.nextLine())){
            productQueue.offer(productsAll);

        }
        while (!productQueue.isEmpty()){
            String thisProduct = productQueue.poll();
            String thisRobot = robotsQueue.poll();
            robotsQueue.offer(thisRobot);
            productTime(timeArr,clock);
            if (!robotsTiming.containsValue(thisRobot)){
                String timing = clculateRobotTime(timeArr,thisRobot);
                robotsTiming.put(timing,thisRobot);
                int endIndex = thisRobot.indexOf("-");
                String name = thisRobot.substring(0,endIndex);
                System.out.print(name + " - " + thisProduct + " ");
                printTime(timeArr);
                System.out.println();
            }else {
                String array = Arrays.toString(timeArr);
                if (robotsTiming.containsKey(array)){
                    String theRobot = robotsTiming.get(array);
                    robotsTiming.remove(array);
                    String timing = clculateRobotTime(timeArr,theRobot);
                    robotsTiming.put(timing,theRobot);
                    int endIndex = theRobot.indexOf("-");
                    String name = theRobot.substring(0,endIndex);
                    System.out.print(name + " - " + thisProduct + " ");
                    printTime(timeArr);
                    System.out.println();
                }else {
                    productQueue.offer(thisProduct);
                }

            }


        }
    }


    private static void printTime(int[] timeArr) {
        String hour = "" + timeArr[0];
        String minutes = "" + timeArr[1];
        String seconds = "" + timeArr[2];
        if (hour.length() == 1){
            hour = "0" + hour;
        }
        if (minutes.length() == 1){
            minutes = "0" + minutes;
        }
        if (seconds.length() == 1){
            seconds = "0" + seconds;
        }
        System.out.print("[" + hour +":"+ minutes +":"+ seconds +"]");
    }

    private static String clculateRobotTime(int[] timeArr, String thisRobot) {
        String[] arrRob = thisRobot.split("-");
        int robTime = Integer.parseInt(arrRob[1]);
        int seconds = (timeArr[2] + robTime) % 60;
        int minutes = (((seconds + robTime)/60) + timeArr[1]) % 60;
        int hours = (((((seconds + robTime)/60) + minutes)/60) + timeArr[0] ) % 24;
        List<Integer> timing = new ArrayList<>();
        timing.add(0,hours);
        timing.add(1,minutes);
        timing.add(2,seconds);

        return timing.toString();


    }


    private static void productTime(int[] timeArr, int clock) {
        int seconds = timeArr[2];
        int minutes = timeArr[1];
        int hours = timeArr[0];
        timeArr[2] = (seconds + clock) % 60;
        timeArr[1] = (((seconds + clock)/60) + minutes) % 60;
        timeArr[0] = (((((seconds + clock)/60) + minutes)/60) + hours ) % 24;
    }


}
