import java.util.Scanner;

public class FenShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= n; a++){
            String name = scanner.nextLine();
            switch (name){
                case "hoodie":
                    budget -= 30;
                    break;
                case "keychain":
                    budget -= 4;
                    break;
                case "T-shirt":
                    budget -= 20;
                    break;
                case "flag":
                    budget -= 15;
                    break;
                case "sticker":
                    budget -= 1;
                    break;
            }
        }

        if(budget >= 0){
            System.out.printf("You bought %d items and left with %d lv.",n,budget);
        }else {
            System.out.printf("Not enough money, you need %d more lv.",Math.abs(budget));
        }
    }
}
