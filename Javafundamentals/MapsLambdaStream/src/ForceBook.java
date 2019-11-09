import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> sides = new LinkedHashMap<>();
        String command;
        while (!"Lumpawaroo".equals(command = scanner.nextLine())){
            String[] forces = command.split("\\s+\\|\\s+|\\s+->\\s+");

            if (command.contains("|")) {
                boolean isPresent = false;
                List<String> pipe = sides.computeIfAbsent(forces[0], k -> new ArrayList<>());
                for (Map.Entry<String, List<String>> entries : sides.entrySet()) {
                    if (entries.getValue().contains(forces[1])){
                        isPresent = true;
                    }
                }

                if (!isPresent) {
                    pipe.add(forces[1]);
                }
            }else {

                    String toRem = forces[0];
                    List<String> arrow = sides.computeIfAbsent(forces[1], key -> new ArrayList<>());
                for (Map.Entry<String, List<String>> entries2 : sides.entrySet()) {

                        entries2.getValue().remove(toRem);

                }
                arrow.add(toRem);
                System.out.printf("%s joins the %s side!%n",toRem,forces[1]);
            }

        }

        sides.forEach((key,value) -> {
            Collections.sort(value);
        });

        sides.entrySet().stream().sorted((a1,a2) -> {
                int res =  Integer.compare(a2.getValue().size(),a1.getValue().size());
                if (res == 0){
                    res = a1.getKey().compareTo(a2.getKey());
                }
                return res;

        }).forEach(r -> {
            if (r.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", r.getKey(), r.getValue().size());
                for (String s : r.getValue()) {
                    System.out.printf("! %s%n", s);
                }
            }

        });

    }
}
