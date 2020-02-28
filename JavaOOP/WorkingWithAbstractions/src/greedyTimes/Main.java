
package greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        Treasure treasures = new Treasure(scanner.nextLine().split("\\s+"));

        Bag bag = new Bag(capacity);


        for (var pair:treasures) {
            String first = pair.getFirst();
            Long second = pair.getSecond();

            if (first.length() == 3) {
                if (bag.hasRoomFor(second)){
                    bag.addCash(first,second);
                }
            }
            if (first.toLowerCase().endsWith("gem")) {
                if (bag.hasRoomFor(second)){
                    bag.addGem(first,second);
                }
            }
            if (first.toLowerCase().equals("gold")) {
                if (bag.hasRoomFor(second)){
                    bag.addGold(second);
                }
            }

        }

        System.out.println(bag.report());
    }
}
