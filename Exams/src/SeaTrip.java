import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine());
        double treats = Double.parseDouble(scanner.nextLine());
        double hotel = Double.parseDouble(scanner.nextLine());
        double tot = 0;
        tot += food*3 + treats*3 + (hotel*0.90 + hotel*0.85 + hotel*0.80) + 54.39;
        System.out.printf("Money needed: %.2f", tot);
    }
}
