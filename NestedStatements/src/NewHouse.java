import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double cost = 0;
        switch (flower){
            case "Roses":
                if(count > 80){
                    cost = (count*5.00)*0.90;
                    break;
                }
                cost = count*5.00;
                break;
            case "Dahlias":
                if(count > 90){
                    cost = (count*3.80)*0.85;
                    break;
                }
                cost = count*3.80;
                break;
            case "Tulips":
                if(count > 80){
                    cost = (count*2.80)*0.85;
                    break;
                }
                cost = count*2.80;
                break;
            case "Narcissus":
                if(count < 120){
                    cost = (count*3.00)*1.15;
                    break;
                }
                cost = count*3.00;
                break;
            case "Gladiolus":
                if(count < 80){
                    cost = (count*2.50)*1.20;
                    break;
                }
                cost = count*2.50;
                break;
        }

        if(budget >= cost){
            cost = budget - cost;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count,flower,cost);
        }else{
            cost = cost - budget;
            System.out.printf("Not enough money, you need %.2f leva more.",cost);
        }
    }
}
