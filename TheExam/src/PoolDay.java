import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double vhod = Double.parseDouble(scanner.nextLine());
        double slg = Double.parseDouble(scanner.nextLine());
        double umbr = Double.parseDouble(scanner.nextLine());
        double shez = Math.ceil(people*0.75)*slg;
        double um = Math.ceil(people*1.00/2)*umbr;
        double extr = shez + um;

        double tot = people*vhod + extr;

        System.out.printf("%.2f lv.",tot);

    }
}
