import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysTotal = Integer.parseInt(scanner.nextLine());
        int chefsTotal = Integer.parseInt(scanner.nextLine());
        int cakesTotal = Integer.parseInt(scanner.nextLine());
        int waffelsTotal = Integer.parseInt(scanner.nextLine());
        int panecakesTotal = Integer.parseInt(scanner.nextLine());
        int cakesPrice = (cakesTotal*45);
        double waffelsPrice = (waffelsTotal*5.80);
        double panecakesPrice = (panecakesTotal*3.20);
        double total1day = ((cakesPrice + waffelsPrice + panecakesPrice)*chefsTotal);
        double foundraisebefore = (total1day*daysTotal);
        double foundAfter = (foundraisebefore - (foundraisebefore/8));
        System.out.printf("%.2f",foundAfter);


    }
}
