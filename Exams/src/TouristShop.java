import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String produktName = scanner.nextLine();
        double productPrice = 0.0;
        int prodAll = 0;
        int x = 0;
        double y = 0.00;
        double total = 0.00;

        while (!produktName.equals("Stop")) {

            productPrice = Double.parseDouble(scanner.nextLine());

            prodAll++;
            x++;

            if (prodAll == 3) {
                productPrice = productPrice * 0.50;
                prodAll = 0;
            }


            y += productPrice;


            if(budget < productPrice){
                budget = productPrice - budget;
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!%n",budget);
                break;
            }

            budget = budget - productPrice;

            produktName = scanner.nextLine();

        }

           if(produktName.equals("Stop")) {
               System.out.printf("You bought %d products for %.2f leva.", x, y);
           }

    }
}
