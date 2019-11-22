import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexNumSum = "([-]?\\d+)([.]\\d+)?";
        String regexCalc = "[\\*\\/]";
        String regexHealth = "[^\\d\\*\\/\\+\\.\\-]";

        List<String> demon = Arrays.stream(scanner.nextLine().split(",\\s*")).collect(Collectors.toList());
        Collections.sort(demon);
        for (String demons : demon) {
            demons = demons.replaceAll(" ","");
            int health = demonHealth(regexHealth,demons);
            double result = sumDivideMultipli(regexNumSum,regexCalc,demons);

            System.out.printf("%s - %d health, %.2f damage%n",demons,health,result);
        }


    }

    private static int demonHealth(String regexHealth, String demons) {
        Pattern intP = Pattern.compile(regexHealth);
        Matcher matchHealth = intP.matcher(demons);
        int sum = 0;
        while (matchHealth.find()){
            char c = matchHealth.group().charAt(0);
            int d = c;
            sum += d;
        }
        return sum;
    }

    private static double sumDivideMultipli(String regexNumSum,String regexCalc ,String demons) {
        Pattern pattern = Pattern.compile(regexNumSum);
        Matcher matcher = pattern.matcher(demons);
        double res = 0;
        while (matcher.find()){
            res += Double.parseDouble(matcher.group());
        }
        if (res != 0){
            Pattern path = Pattern.compile(regexCalc);
            Matcher match = path.matcher(demons);

           while (match.find()){
               String matched = match.group();
               if (matched.equals("*")){
                   res = res*2;
               }
               if (matched.equals("/")){
                   res = res/2;
               }
           }

        }
        return res;
    }
}
