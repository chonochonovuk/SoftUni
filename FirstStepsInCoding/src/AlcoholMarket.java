import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskyLev = Double.parseDouble(scanner.nextLine());
        double beerTotal = Double.parseDouble(scanner.nextLine());
        double wineTotal = Double.parseDouble(scanner.nextLine());
        double rakiTotal = Double.parseDouble(scanner.nextLine());
        double whiskyTotal = Double.parseDouble(scanner.nextLine());
        double rakiLev = (whiskyLev*0.50);
        double wineLev = (rakiLev - (rakiLev*0.4));
        double beerLev = (rakiLev - (rakiLev*0.8));
        double raki = (rakiLev*rakiTotal);
        double wine = (wineLev*wineTotal);
        double beer = (beerLev*beerTotal);
        double whisky = (whiskyLev*whiskyTotal);
        double total = (raki + wine + beer + whisky);
        System.out.printf("%.2f",total);

    }
}
