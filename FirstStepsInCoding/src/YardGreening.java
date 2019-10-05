import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yardSize = Double.parseDouble(scanner.nextLine());
        double priceTotal = (yardSize*7.61);
        double priceDiscount = (0.18*priceTotal);
        double realPrice = (priceTotal - priceDiscount);
        System.out.printf("The final price is: %.2f lv.%n",realPrice);
        System.out.printf("The discount is: %.2f lv.",priceDiscount);


    }
}
