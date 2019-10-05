import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sushiType = scanner.nextLine();
        String sushiRest = scanner.nextLine();
        int orders = Integer.parseInt(scanner.nextLine());
        String deliver = scanner.nextLine();
        double tot = 0;


        switch (sushiRest){

            case "Sushi Zone":
                switch (sushiType){
                    case "sashimi":
                        switch (deliver){
                            case "Y":
                                tot += (orders*4.99)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*4.99);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "maki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*5.29)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*5.29);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "uramaki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*5.99)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*5.99);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "temaki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*4.29)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*4.29);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                }
                break;
            case "Sushi Time":
                switch (sushiType){
                    case "sashimi":
                        switch (deliver){
                            case "Y":
                                tot += (orders*5.49)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*5.49);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "maki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*4.69)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*4.69);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "uramaki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*4.49)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*4.49);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "temaki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*5.19)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*5.19);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                }
                break;
            case "Sushi Bar":
                switch (sushiType){
                    case "sashimi":
                        switch (deliver){
                            case "Y":
                                tot += (orders*5.25)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*5.25);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "maki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*5.55)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*5.55);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "uramaki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*6.25)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*6.25);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "temaki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*4.75)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*4.75);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                }
                break;
            case "Asian Pub":
                switch (sushiType){
                    case "sashimi":
                        switch (deliver){
                            case "Y":
                                tot += (orders*4.50)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*4.50);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "maki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*4.80)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*4.80);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;
                    case "uramaki":
                    case "temaki":
                        switch (deliver){
                            case "Y":
                                tot += (orders*5.50)*1.20;;
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                            case "N":
                                tot += (orders*5.50);
                                System.out.printf("Total price: %.0f lv.",Math.ceil(tot));
                                break;
                        }
                        break;


                }
                break;
                default:
                    System.out.printf("%s is invalid restaurant!",sushiRest);


        }
    }
}
