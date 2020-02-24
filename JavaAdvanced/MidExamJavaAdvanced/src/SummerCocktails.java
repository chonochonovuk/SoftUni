import java.util.*;

public class SummerCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,String> cocktails = new LinkedHashMap<>();
        cocktails.put(150,"Mimosa");
        cocktails.put(250,"Daiquiri");
        cocktails.put(300,"Sunshine");
        cocktails.put(400,"Mojito");
        Map<String,Integer> madeCocktail = new TreeMap<>();
        ArrayDeque<Integer> ingredientsQueue = new ArrayDeque<>();
        int[] ingredients = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        for (int q:ingredients) {
            ingredientsQueue.offer(q);
        }
        ArrayDeque<Integer> freshnessStack = new ArrayDeque<>();
        int[] freshness = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        for (int s:freshness) {
            freshnessStack.push(s);

        }
        while (!ingredientsQueue.isEmpty() && !freshnessStack.isEmpty()){
            int ingredientFirst = ingredientsQueue.poll();
            if (ingredientFirst == 0){
                continue;
            }
            int freshnessLast = freshnessStack.pop();
            int multi = ingredientFirst*freshnessLast;
            if (cocktails.containsKey(multi)){
                    String key = cocktails.get(multi);
                    madeCocktail.merge(key,1,Integer::sum);
            }else {
                    ingredientFirst += 5;
                    ingredientsQueue.offer(ingredientFirst);
            }

        }

        if (madeCocktail.size() == 4){
            System.out.println("It's party time! The cocktails are ready!");
            madeCocktail.forEach((key, value) -> System.out.println("# " + key + " --> " + value));
        }else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
            if (!ingredientsQueue.isEmpty()){
                int sumLeft = ingredientsQueue.stream().mapToInt(x -> x).sum();
                System.out.printf("Ingredients left: %d%n",sumLeft);
            }
            madeCocktail.forEach((key, value) -> System.out.println("# " + key + " --> " + value));
        }
    }
}
