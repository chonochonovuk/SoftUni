package TrafficLights;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lights = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int times = Integer.parseInt(scanner.nextLine());
        reorderList(times,lights);

    }

    private static void reorderList(int times, List<String> lights) {

        while (times != 0){
            List<String> temp = new ArrayList<>();
            for (String l : lights) {
                temp.add(Light.valueOf(l).getLightChange());
            }
            lights = temp;
            System.out.println(lights.toString().replaceAll("[\\[\\],]",""));
            times--;
        }

    }


}
