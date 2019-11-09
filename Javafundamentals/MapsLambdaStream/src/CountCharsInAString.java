import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> matches = new LinkedHashMap<>();
        String StrOfChars = scanner.nextLine();
        for (int i = 0; i < StrOfChars.length(); i++) {
            Character k = StrOfChars.charAt(i);
            if (k.equals(' ')){
                continue;
            }
            Integer count = matches.get(k);
            if (count == null){
                matches.put(k,1);
            }else {
                matches.put(k,count + 1);
            }
        }

        for (Map.Entry<Character, Integer> charIntEntry : matches.entrySet()) {
            System.out.printf("%c -> %d%n",charIntEntry.getKey(),charIntEntry.getValue());
        }

    }
}
