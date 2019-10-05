import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toCoin = scanner.nextLine();
        double tot = 0;
        double coin = 0;
        while (!toCoin.equals("Start")){
            coin = Double.parseDouble(toCoin);
            if (coin == 0.1){
                tot += 0.1;
            }else if (coin == 0.2){
                tot += 0.2;
            }else if (coin == 0.5){
                tot += 0.5;
            }else if (coin == 1){
                tot += 1;
            }else if (coin == 2){
                tot += 2;
            }else{
                System.out.printf("Cannot accept %.2f%n",coin);
            }
            toCoin = scanner.nextLine();
        }
          coin = tot;
        String toDrink = scanner.nextLine();

        while (!toDrink.equals("End")){
            switch (toDrink){
                case "Nuts":
                    if (coin >= 2){
                        coin -= 2;
                        System.out.println("Purchased Nuts");
                    }else {
                        System.out.println("Sorry, not enough money");

                    }
                    break;
                case "Water":
                    if (coin >= 0.7){
                        coin -= 0.7;
                        System.out.println("Purchased Water");
                    }else {
                        System.out.println("Sorry, not enough money");

                    }
                    break;
                case "Crisps":
                    if (coin >= 1.5){
                        coin -= 1.5;
                        System.out.println("Purchased Crisps");
                    }else {
                        System.out.println("Sorry, not enough money");

                    }
                    break;
                case "Soda":
                    if (coin >= 0.8){
                        coin -= 0.8;
                        System.out.println("Purchased Soda");
                    }else {
                        System.out.println("Sorry, not enough money");

                    }
                    break;
                case "Coke":
                    if (coin >= 1){
                        coin -= 1;
                        System.out.println("Purchased Coke");
                    }else {
                        System.out.println("Sorry, not enough money");


                    }
                    break;
                    default:
                        System.out.println("Invalid product");
                        break;
            }


            toDrink = scanner.nextLine();


        }

        if (toDrink.equals("End")){
            System.out.printf("Change: %.2f",coin);
        }

    }
}
