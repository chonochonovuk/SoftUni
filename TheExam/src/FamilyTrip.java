import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double night1price = Double.parseDouble(scanner.nextLine());
        int extraPercent = Integer.parseInt(scanner.nextLine());
        double tot = 0;

        if(nights > 7){
            night1price = night1price*0.95;
        }

        tot = (nights*night1price) + (budget*(extraPercent*1.00/100));

        if(budget >= tot){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",(budget - tot));
        }else {
            System.out.printf("%.2f leva needed.",(tot - budget));
        }
    }
}
