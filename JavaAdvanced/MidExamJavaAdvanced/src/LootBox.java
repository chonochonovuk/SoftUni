import java.util.*;

public class LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> firstLoot = new ArrayDeque<>();
        ArrayDeque<Integer> secondLoot = new ArrayDeque<>();
        int[] firstSequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int m:firstSequence) {
            firstLoot.offer(m);
        }
        int[] secondSequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int m:secondSequence) {
            secondLoot.push(m);
        }
        List<Integer> collectionOfEvenSum = new ArrayList<>();
        while (!firstLoot.isEmpty() && !secondLoot.isEmpty()){

            int first = firstLoot.poll();
            int last = secondLoot.pop();
            int sum = first + last;
            if (sum % 2 == 0){
                collectionOfEvenSum.add(sum);
            }else {
                firstLoot.offer(last);
                firstLoot.push(first);
            }
        }
        if (firstLoot.isEmpty()){
            System.out.println("First lootbox is empty");
            checkIfCollectionIsEpic(collectionOfEvenSum);
        }
        if (secondLoot.isEmpty()){
            System.out.println("Second lootbox is empty");
            checkIfCollectionIsEpic(collectionOfEvenSum);
        }
    }

    private static void checkIfCollectionIsEpic(List<Integer> collectionOfEvenSum) {
        int sumToCheck = collectionOfEvenSum.stream().mapToInt(Integer::intValue).sum();
        if (sumToCheck >= 100){
            System.out.printf("Your loot was epic! Value: %d%n",sumToCheck);
        }else {
            System.out.printf("Your loot was poor... Value: %d%n",sumToCheck);
        }
    }
}
