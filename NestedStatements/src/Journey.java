import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());;
        String season = scanner.nextLine();
        double cost = 0;

        switch (season){
            case "summer":
                if(budget <= 100){
                    cost = budget*0.30;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f",cost);
                }else if(budget > 100 && budget <= 1000){
                    cost = budget*0.40;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f",cost);
                }else if(budget > 1000){
                    cost = budget*0.90;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f",cost);
                }
                break;
            case "winter":
                if(budget <= 100){
                    cost = budget*0.70;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f",cost);
                }else if(budget > 100 && budget <= 1000){
                    cost = budget*0.80;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f",cost);
                }else if(budget > 1000){
                    cost = budget*0.90;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f",cost);
                }
                break;

        }
    }
}
