import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int teddyB = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int lorry = Integer.parseInt(scanner.nextLine());
        double totalPrice = (puzzle*2.60 + doll*3 + teddyB*4.10 + minion*8.20 + lorry*2 );
        int toysTotal = (puzzle + doll + teddyB + minion + lorry);

        if(toysTotal >= 50) {
            double discount = totalPrice*0.25;
            double finalPrice = totalPrice - discount;
            double rent = finalPrice*0.10;
            double profit = finalPrice - rent;
            if(profit >= tripPrice){
                double going = profit - tripPrice;
                System.out.printf("Yes! %.2f lv left.",going);
            } else if(tripPrice > profit) {
                double notGoing = tripPrice - profit;
                System.out.printf("Not enough money! %.2f lv needed.",notGoing);


            }
        }else {

            double finalPrice = totalPrice;
            double rent = finalPrice*0.10;
            double profit = finalPrice - rent;
            if(tripPrice > profit){
                double notGoing = tripPrice - profit;
                System.out.printf("Not enough money! %.2f lv needed.",notGoing);
            }else if(profit >= tripPrice){
                double going = profit - tripPrice;
                System.out.printf("Yes! %.2f lv left.",going);
            }
        }
    }
}
