import java.util.*;

public class TTPracticeSessions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> roadRacers = new LinkedHashMap<>();
        String command;
        while (!"END".equals(command = scanner.nextLine())){
            String[] commArr = command.split("->");
            switch (commArr[0]){
                case "Add":
                    String road = commArr[1];
                    List<String> racer = roadRacers.computeIfAbsent(road,k -> new ArrayList<>());
                    racer.add(commArr[2]);
                    break;
                case "Move":
                    String currentRoad = commArr[1];
                    String racerMove = commArr[2];
                    String newRoad = commArr[3];
                    if (roadRacers.get(currentRoad).contains(racerMove)) {
                        roadRacers.get(currentRoad).remove(racerMove);
                        roadRacers.get(newRoad).add(racerMove);
                    }
                    break;
                case "Close":
                    String findRoad = commArr[1];
                    roadRacers.remove(findRoad);
                    break;
            }
        }

        System.out.println("Practice sessions:");

        roadRacers.entrySet().stream().sorted((a1,a2) -> {
            int res = Integer.compare(a2.getValue().size(),a1.getValue().size());
            if (res == 0){
                res = a1.getKey().compareTo(a2.getKey());
            }

            return res;
        }).forEach(x -> {
            System.out.println(x.getKey());
            for (String s : x.getValue()) {
                System.out.println("++" + s);
            }

        });
    }

}
