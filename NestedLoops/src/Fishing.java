import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fishTotal = Integer.parseInt(scanner.nextLine());
        int tot = 0;
        int l = 0;
        double price = 0;
        double profit = 0;
        double lost = 0;



        for(int i = 1; i <= fishTotal;i++) {
            String name = scanner.nextLine();

               if (name.equals("Stop")) {
                   if(profit >= lost){
                       i--;
                       profit = profit - lost;
                       System.out.printf("Lyubo's profit from %d fishes is %.2f leva.",i,profit);
                   }else {
                       lost = lost - profit;
                       System.out.printf("Lyubo lost %.2f leva today.", lost);
                   }
                    break;
                }

               double kg = Double.parseDouble(scanner.nextLine());

               for(int y = 0; y < name.length(); y++){

                   char c = name.charAt(y);
                   int sum = (int)c;
                   tot += sum;

            }

               price = tot/kg;

            if(i%3 == 0){
                profit += price;
                tot = 0;
                price = 0;
                l++;
            }else {
                lost += price;
                tot = 0;
                price = 0;
                l++;
            }

        }

        if(l == fishTotal && profit >= lost){
            profit = profit - lost;
            System.out.println("Lyubo fulfilled the quota!");
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.",fishTotal,profit);
        }else if(l == fishTotal && profit < lost){
            lost = lost - profit;
            System.out.println("Lyubo fulfilled the quota!");
            System.out.printf("Lyubo lost %.2f leva today.", lost);
        }

    }
}
