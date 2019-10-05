import java.util.Scanner;

public class SchoolarShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double score = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());
        if(score >= 5.50){
            double bonus = Math.floor(score*25);
            System.out.printf("You get a scholarship for excellent results %.0f BGN",bonus);
        }else if(score > 4.5 && income < minWage) {
            double bonus = Math.floor(0.35*minWage);
            System.out.printf("You get a Social scholarship %.0f BGN",bonus);

        }else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
