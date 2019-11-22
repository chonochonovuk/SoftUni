import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String endOfShift;
        while (!"end of shift".equals(endOfShift = scanner.nextLine())){
            String regexCustomer = "[%][A-Z][a-z]+[%]";
            String regexProduct = "[<]\\w+[>]";
            String regexCount = "[\\|]\\d+[\\|]";
            String regexPrice = "\\d+([.]\\d+)?[$]";
            String customerName = stringMatches(regexCustomer,endOfShift).replaceAll("%","");
            String productName = stringMatches(regexProduct,endOfShift).replace("<","").replace(">","");
            String checkCount = stringMatches(regexCount,endOfShift).replaceAll("\\|","");
            String checkPrice = stringMatches(regexPrice,endOfShift).replace("$","");
            if (!customerName.isEmpty() && !productName.isEmpty() && !checkCount.isEmpty() && !checkPrice.isEmpty()) {
                int count = intMatches(regexCount,endOfShift);
                double price = (doubleMatches(regexPrice,endOfShift))*count;
                total += price;
                System.out.printf("%s: %s - %.2f%n", customerName, productName, price);
            }
        }

        System.out.printf("Total income: %.2f",total);
    }

    private static String stringMatches(String regexCustomer, String endOfShift) {
        Pattern pattern = Pattern.compile(regexCustomer);
        Matcher matcher = pattern.matcher(endOfShift);
        String match = "";
        while (matcher.find()){
            match += matcher.group();
        }
        return  match;
    }

    private static int intMatches(String regexCustomer, String endOfShift) {
        Pattern pattern = Pattern.compile(regexCustomer);
        Matcher matcher = pattern.matcher(endOfShift);
        String match = "";

        while (matcher.find()){
            match += matcher.group();
        }
        match = match.replaceAll("\\|","");
        int count = Integer.parseInt(match);
        return count;
    }

    private static double doubleMatches(String regexCustomer, String endOfShift) {
        Pattern pattern = Pattern.compile(regexCustomer);
        Matcher matcher = pattern.matcher(endOfShift);
        String match = "";

        while (matcher.find()){
            match += matcher.group();
        }
        match = match.replace("$","");
        double price = Double.parseDouble(match);
        return price;
    }
}
