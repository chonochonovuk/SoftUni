import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HelloFrance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> all = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<Double> subList = new ArrayList<>();
        double budget = Double.parseDouble(scanner.nextLine());
        String price;
        double profit = 0;
        double thePr = 0;
        for (int i = 0; i < all.size(); i++) {
           price = all.get(i);
           String[] prArr = price.split("->");
           thePr = Double.parseDouble(prArr[1]);
           switch (prArr[0]){
               case "Clothes":
                   if (thePr > 50 || (budget - thePr) < 0){
                       continue;
                   }
                   subList.add(thePr*1.40);
                   profit += thePr*0.4;
                   budget -= thePr;
                   break;
               case "Shoes":
                   if (thePr > 35 || (budget - thePr) < 0){
                       continue;
                   }
                   subList.add(thePr*1.40);
                   profit += thePr*0.4;
                   budget -= thePr;
                   break;
               case "Accessories":
                   if (thePr > 20.50 || (budget - thePr) < 0){
                       continue;
                   }
                   subList.add(thePr*1.40);
                   profit += thePr*0.4;
                   budget -= thePr;
                   break;
           }
        }

        for (int i = 0; i < subList.size(); i++) {
            budget += subList.get(i);
            System.out.printf("%.2f ",subList.get(i));
        }
        System.out.println();

        System.out.printf("Profit: %.2f%n",profit);

        if (budget >= 150){
            System.out.println("Hello, France!");
        }else {
            System.out.println("Time to go.");
        }
    }
}
