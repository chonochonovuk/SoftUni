import java.util.*;

public class Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> allMembers = new LinkedHashMap<>();
        Map<String,Integer> playTime = new LinkedHashMap<>();
        String command = "";
        while (!"start of concert".equals(command = scanner.nextLine())){
            String[] bands = command.split("(;\\s)|(,\\s)");
            switch (bands[0]){
                case "Add":
                    String bandName = bands[1];
                    List<String> toAdd = allMembers.computeIfAbsent(bandName,k -> new ArrayList<>());
                    findMember(toAdd,bands);
                    break;
                case "Play":
                    String bandName2 = bands[1];
                    Integer time = Integer.parseInt(bands[2]);
                    playTime.merge(bandName2,time,Integer::sum);
                    break;
            }
        }
        int allTimes = playTime.values().stream().reduce(Integer::sum).get();
        System.out.println("Total time: " + allTimes);
        playTime.entrySet().stream().sorted((a1,a2) -> {
            int res = Integer.compare(a2.getValue(),a1.getValue());
            if (res == 0){
                res = a1.getKey().compareTo(a2.getKey());
            }
            return res;
        }).forEach(s -> System.out.println(s.getKey() + " -> " + s.getValue()));
        String seeBand = scanner.nextLine();
        System.out.println(seeBand);
        allMembers.entrySet().stream().filter(x -> x.getKey().equals(seeBand)).forEach(z -> {
            for (String s : z.getValue()) {
                System.out.println("=> " + s);
            }

        });
    }

    private static void findMember(List<String> toAdd, String[] bands) {
        for (int i = 2; i < bands.length; i++) {
            String newMember = bands[i];
            if (!toAdd.contains(newMember)){
                toAdd.add(newMember);
            }
        }
    }
}
