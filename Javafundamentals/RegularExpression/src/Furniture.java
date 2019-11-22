import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "([>]{2})([A-Za-z]+)([<]{2})(\\d+([.]\\d+)?)!(\\d+)";
        String text;
        double tot = 0;
        List<String> furniture = new ArrayList<>();
        while (!"Purchase".equals(text = scanner.nextLine())){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()){
                furniture.add(matcher.group(2));
                tot += Double.parseDouble(matcher.group(4))*Integer.parseInt(matcher.group(6));
            }
        }
        if (furniture.isEmpty()){
            System.out.println("Bought furniture:");
            System.out.printf("Total money spend: %.2f", tot);
        }else {
            System.out.println("Bought furniture:");
            System.out.print(String.join("\n", furniture));
            System.out.printf("%nTotal money spend: %.2f", tot);
        }
    }
}
