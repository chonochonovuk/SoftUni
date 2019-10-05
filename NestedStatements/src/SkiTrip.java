import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine().toLowerCase();
        String feedback = scanner.nextLine().toLowerCase();
        days = days-1;
        double cost = 0;

        switch (feedback) {

            case "positive":
                switch (room){
                    case "room for one person":
                        cost = (days*18.00)*1.25;
                        System.out.printf("%.2f",cost);
                        break;
                    case "apartment":
                        if(days < 10){
                            cost = ((days*25.00)*0.70)*1.25;
                            System.out.printf("%.2f",cost);
                        }else if(days >=10 && days <= 15) {
                            cost = ((days * 25.00)*0.65)* 1.25;
                            System.out.printf("%.2f", cost);
                        }else if(days > 15){
                            cost = ((days * 25.00)*0.50)* 1.25;
                            System.out.printf("%.2f", cost);
                        }
                        break;
                    case "president apartment":
                        if(days < 10){
                            cost = ((days*35.00)*0.90)*1.25;
                            System.out.printf("%.2f",cost);
                        }else if(days >=10 && days <= 15) {
                            cost = ((days * 35.00)*0.85)* 1.25;
                            System.out.printf("%.2f", cost);
                        }else if(days > 15){
                            cost = ((days * 35.00)*0.80)* 1.25;
                            System.out.printf("%.2f", cost);
                        }
                        break;
                }
                break;
            case "negative":
                switch (room){
                    case "room for one person":
                        cost = (days*18.00)*0.90;
                        System.out.printf("%.2f",cost);
                        break;
                    case "apartment":
                        if(days < 10){
                            cost = ((days*25.00)*0.70)*0.90;
                            System.out.printf("%.2f",cost);
                        }else if(days >=10 && days <= 15) {
                            cost = ((days * 25.00)*0.65)* 0.90;
                            System.out.printf("%.2f", cost);
                        }else if(days > 15){
                            cost = ((days * 25.00)*0.50)* 0.90;
                            System.out.printf("%.2f", cost);
                        }
                        break;
                    case "president apartment":
                        if(days < 10){
                            cost = ((days*35.00)*0.90)*0.90;
                            System.out.printf("%.2f",cost);
                        }else if(days >=10 && days <= 15) {
                            cost = ((days * 35.00)*0.85)* 0.90;
                            System.out.printf("%.2f", cost);
                        }else if(days > 15){
                            cost = ((days * 35.00)*0.80)* 0.90;
                            System.out.printf("%.2f", cost);
                        }
                        break;
                }
                break;

        }

    }
}
