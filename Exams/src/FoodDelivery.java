import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veg = Integer.parseInt(scanner.nextLine());
        double totalDes = (chicken*10.35 + fish*12.40 + veg*8.15);
        totalDes = totalDes + totalDes*0.20 + 2.50;
        System.out.printf("Total: %.2f",totalDes);

    }
}
