import java.util.*;

public class NikuldenMeals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> guestMeals = new LinkedHashMap<>();
        String command;
        int unliked = 0;
        while (!"Stop".equals(command = scanner.nextLine())){
            String[] toArray = command.split("-");
            switch (toArray[0]){
                case "Like":
                    String guest = toArray[1];
                    String meal = toArray[2];
                    List<String> mealAdd = guestMeals.computeIfAbsent(guest, k -> new ArrayList<>());
                    if (!mealAdd.contains(meal)){
                        mealAdd.add(meal);
                    }
                    break;
                case "Unlike":
                    if (guestMeals.containsKey(toArray[1])) {
                       if (guestMeals.get(toArray[1]).contains(toArray[2])){
                           System.out.println(toArray[1] + " doesn't like the " + toArray[2] + ".");
                           guestMeals.get(toArray[1]).remove(toArray[2]);
                           unliked++;
                       }else {
                           System.out.println(toArray[1] + " doesn't have the " + toArray[2] + " in his/her collection.");
                       }
                    }else {
                        System.out.println(toArray[1] + " is not at the party.");
                    }
                    break;
            }
        }

        guestMeals.entrySet().stream().sorted((a1,a2) -> {
            int res = Integer.compare(a2.getValue().size(),a1.getValue().size());
            if (res == 0){
                res = a1.getKey().compareTo(a2.getKey());
            }

            return res;
        }).forEach(x -> {
            System.out.print(x.getKey() + ": ");
            System.out.print(x.getValue().toString().replaceAll("[\\[\\]]",""));
            System.out.println();
        });

        System.out.println("Unliked meals: " + unliked);
    }

}
