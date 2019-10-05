import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double water = 20.00;
        double net = 15.00;
        double elT = 0;
        double others = 0;
        double avg = 0;

        for (int k = 0; k < months; k++){
            double elect = Double.parseDouble(scanner.nextLine());
            elT += elect;
            others += (elect + water + net)*1.20;
        }

        water = water*months;
        net = net*months;
        avg = (elT + water + net +others)/months;

        System.out.printf("Electricity: %.2f lv\n", elT);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", net);
        System.out.printf("Other: %.2f lv\n", others);
        System.out.printf("Average: %.2f lv\n", avg);
    }
}
