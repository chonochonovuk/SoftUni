import java.util.Scanner;

public class WaterTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int wt = 0;
        int cap = 255;

        for (int l = 1; l <= n; l++){
            int littre = Integer.parseInt(scanner.nextLine());
            if (littre > cap){
                System.out.println("Insufficient capacity!");
                continue;
            }

            wt += littre;

            if (wt > cap){
                System.out.println("Insufficient capacity!");
                wt -= littre;
                continue;
            }
        }
        System.out.println(wt);
    }
}
