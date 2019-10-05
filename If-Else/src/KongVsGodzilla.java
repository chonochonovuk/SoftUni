import java.util.Scanner;

public class KongVsGodzilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());
        double dekor = 0.10*budget;
        if(people > 150) {
            double clothesTotal = clothesPrice*people;
            clothesTotal = clothesTotal - 0.10*clothesTotal;
            double totalAll = dekor + clothesTotal;

            if(budget < totalAll) {
                double moneyNeeded = Math.abs(budget - totalAll);
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
            } else if(budget >= totalAll) {
                double moneyLeft = budget - totalAll;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left." ,moneyLeft);
            }

        }else {

            double clothesTotal = clothesPrice * people;
            double totalAll = dekor + clothesTotal;

            if (budget < totalAll) {
                double moneyNeeded = Math.abs(budget - totalAll);
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
            } else if(budget >= totalAll){
                double moneyLeft = budget - totalAll;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
            }
        }




    }
}
