import java.util.Scanner;

public class SpringVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double fuelPerKmPrice = Double.parseDouble(scanner.nextLine());
        double foodExpensesDayPerson = Double.parseDouble(scanner.nextLine());
        double oneNightHotelPrice = Double.parseDouble(scanner.nextLine());
        
        budget = GoOrStay(scanner,days,budget,people,fuelPerKmPrice,foodExpensesDayPerson,oneNightHotelPrice);

        if (budget >= 0){
            System.out.printf("You have reached the destination. You have %.2f$ budget left.",budget);
        }else {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.",Math.abs(budget));
        }
    }

    private static double GoOrStay(Scanner scanner,int days, double budget, int people, double fuelPerKmPrice, double foodExpensesDayPerson, double oneNightHotelPrice) {
        double sumFood = days*people*foodExpensesDayPerson;
        double totHotel = days*people*oneNightHotelPrice;
        if (people > 10){
            totHotel = totHotel*0.75;
        }
        double totExp = sumFood + totHotel;
        double fuelDays = 0;

        for (int i = 1; i <= days; i++) {
            if (totExp > budget){
                break;
            }
            double traveledDist = Double.parseDouble(scanner.nextLine());
            fuelDays = traveledDist*fuelPerKmPrice;
            totExp += fuelDays;
            if (i % 3 == 0 || i % 5 == 0) {
               totExp += totExp * 0.40;
            }
                if (i % 7 == 0){
                    totExp -= (totExp/people);
                }


        }
        budget = budget - totExp;
        return budget;
    }
}
