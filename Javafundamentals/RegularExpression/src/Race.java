import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> racers = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        Map<String,Integer> threeWon = new LinkedHashMap<>();

        String race;

        while (!"end of race".equals(race = scanner.nextLine())){
            String regexName = "[A-Za-z]+";
            String regexNumber = "[\\d]";
            StringBuilder name = new StringBuilder(matchedName(regexName,race));
            int run = matchedNumber(regexNumber,race);
            if (racers.contains(name.toString())){
                threeWon.merge(name.toString(),run,Integer::sum);
            }
        }

        List<String> winners = threeWon.entrySet().stream().sorted((a,b) -> Integer.compare(b.getValue(),a.getValue())).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.printf("1st place: %s%n",winners.get(0));
        System.out.printf("2nd place: %s%n", winners.get(1));
        System.out.printf("3rd place: %s%n", winners.get(2));


    }

    private static String matchedName(String regexName, String race) {
        Pattern pattern = Pattern.compile(regexName);
        Matcher matcher = pattern.matcher(race);
        String match = "";
        while (matcher.find()){
            match += matcher.group();
        }
        return match;
    }

    private static int matchedNumber(String regexName, String race) {
        Pattern pattern = Pattern.compile(regexName);
        Matcher matcher = pattern.matcher(race);
        int match = 0;
        while (matcher.find()){
            match += Integer.parseInt(matcher.group());
        }
        return match;
    }
}
