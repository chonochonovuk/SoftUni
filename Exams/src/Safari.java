import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        double cost = fuel*2.10 + 100.00;
        if(day.equals("Saturday")){
            cost = cost*0.90;
        }else if(day.equals("Sunday")){
            cost = cost*0.80;
        }
        if(budget >= cost){
            cost = budget - cost;
            System.out.printf("Safari time! Money left: %.2f lv. ",cost);
        }else{
            cost = cost - budget;
            System.out.printf("Not enough money! Money needed: %.2f lv.",cost);
        }

    }
}
