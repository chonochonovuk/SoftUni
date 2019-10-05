import java.util.Scanner;

public class OscarSpendings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());
        double gold = rent*0.70;
        double cetering = gold*0.85;
        double sound = cetering/2;
        double total = rent + gold + cetering + sound;
        System.out.printf("%.2f",total);
    }
}
