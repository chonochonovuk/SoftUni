import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> countChars = new TreeMap<>();
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);
            countChars.merge(c,1,Integer::sum);
        }
        countChars.entrySet().stream().forEach(a -> System.out.printf("%c: %d time/s%n",a.getKey(),a.getValue()));
    }
}
