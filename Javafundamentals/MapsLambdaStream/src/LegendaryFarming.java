import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class LegendaryFarming {
    public static <j> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> legendary = new HashMap<>();
        legendary.put("shards","Shadowmourne");
        legendary.put("fragments","Valanyr");
        legendary.put("motes","Dragonwrath");
        Map<String,Integer> allItems = new HashMap<>();
        allItems.put("shards",0);
        allItems.put("fragments",0);
        allItems.put("motes",0);
        Map<String,Integer> others = new HashMap<>();
        boolean ifKey = false;

        while (!ifKey) {

                int q = scanner.nextInt();
                String k = scanner.next().toLowerCase();


                switch (k) {
                    case "shards":
                    case "fragments":
                    case "motes":

                        allItems.put(k, allItems.get(k) + q);

                        Stream<String> x = allItems.entrySet().stream().filter(m -> m.getValue() >= 250).map(Map.Entry::getKey);
                        Optional<String> keys = x.findAny();
                        if (keys.isPresent()) {

                            allItems.put(k, allItems.get(k) - 250);
                            String f = keys.get();
                            System.out.println(legendary.get(f) + " obtained!");
                            ifKey = true;

                        }
                        break;
                    default:
                        others.merge(k, q, Integer::sum);
                        break;
                }



        }


        allItems.entrySet().stream().sorted((a,b) -> {
            int res = b.getValue().compareTo(a.getValue());
            if (res == 0){
                res = a.getKey().compareTo(b.getKey());
            }
            return res;
        }).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        others.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(g -> System.out.println(g.getKey() + ": " + g.getValue()));


    }
}
