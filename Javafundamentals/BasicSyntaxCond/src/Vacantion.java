import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double tot = 0;

        switch (day){
            case "Friday":
                switch (type){
                    case "Students":
                        if (count >= 30){
                            tot = (count*8.45)*0.85;
                            System.out.printf("Total price: %.2f",tot);
                        }else{
                            tot = (count*8.45);
                            System.out.printf("Total price: %.2f",tot);
                        }
                        break;
                    case "Business":
                        if (count >= 100){
                            count -= 10;
                            tot = count*10.90;
                            System.out.printf("Total price: %.2f",tot);
                        }else {
                            tot = count*10.90;
                            System.out.printf("Total price: %.2f",tot);
                        }
                        break;
                    case "Regular":
                        if ( count >= 10 && count <= 20){
                            tot = (count*15.00)*0.95;
                            System.out.printf("Total price: %.2f",tot);
                        }else{
                            tot = (count*15.00);
                            System.out.printf("Total price: %.2f",tot);
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (type){
                    case "Students":
                        if (count >= 30){
                            tot = (count*9.80)*0.85;
                            System.out.printf("Total price: %.2f",tot);
                        }else{
                            tot = (count*9.80);
                            System.out.printf("Total price: %.2f",tot);
                        }
                        break;
                    case "Business":
                        if (count >= 100){
                            count -= 10;
                            tot = count*15.60;
                            System.out.printf("Total price: %.2f",tot);
                        }else {
                            tot = count*15.60;
                            System.out.printf("Total price: %.2f",tot);
                        }
                        break;
                    case "Regular":
                        if ( count >= 10 && count <= 20){
                            tot = (count*20.00)*0.95;
                            System.out.printf("Total price: %.2f",tot);
                        }else{
                            tot = (count*20.00);
                            System.out.printf("Total price: %.2f",tot);
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (type){
                    case "Students":
                        if (count >= 30){
                            tot = (count*10.46)*0.85;
                            System.out.printf("Total price: %.2f",tot);
                        }else{
                            tot = (count*10.46);
                            System.out.printf("Total price: %.2f",tot);
                        }
                        break;
                    case "Business":
                        if (count >= 100){
                            count -= 10;
                            tot = count*16.00;
                            System.out.printf("Total price: %.2f",tot);
                        }else {
                            tot = count*16.00;
                            System.out.printf("Total price: %.2f",tot);
                        }
                        break;
                    case "Regular":
                        if ( count >= 10 && count <= 20){
                            tot = (count*22.50)*0.95;
                            System.out.printf("Total price: %.2f",tot);
                        }else{
                            tot = (count*22.50);
                            System.out.printf("Total price: %.2f",tot);
                        }
                        break;
                }
                break;

        }
    }
}
