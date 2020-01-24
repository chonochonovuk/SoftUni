import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> players = new LinkedHashMap<>();
        String joker;
        while (!"JOKER".equals(joker = scanner.nextLine())){
            String[] toArr = joker.split("[:\\s]{2}");
            String[] cards = toArr[1].split("[,]?\\s+");
            players.computeIfAbsent(toArr[0],k -> new LinkedHashSet<>());
            for (int i = 0; i < cards.length; i++) {
                players.get(toArr[0]).add(cards[i]);
            }
        }
        for (Map.Entry<String, Set<String>> map : players.entrySet()) {
            int sum = 0;
            for (String s : map.getValue()) {
                int digit = 0;
                int multi = 0;
                String substring = s.substring(0, s.length() - 1);
                String multiNumber = s.substring(s.length() - 1);
                switch (substring){
                    case "J":
                        digit = 11;
                        break;
                    case "Q":
                        digit = 12;
                        break;
                    case "K":
                        digit = 13;
                        break;
                    case "A":
                        digit = 14;
                        break;
                    default:
                        digit = Integer.parseInt(substring);
                        break;
                }

                switch (multiNumber){
                    case "S":
                        multi = 4;
                        break;
                    case "H":
                        multi = 3;
                        break;
                    case "D":
                        multi = 2;
                        break;
                    case "C":
                        multi = 1;
                        break;
                }
                sum += digit*multi;
            }

            System.out.println(map.getKey() + ": " + sum);

        }
    }
}
