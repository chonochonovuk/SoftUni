import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.nextLine();
        String type = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        double tot = 0;

        switch (drink){
            case "Espresso":
                switch (type){
                    case "Without":
                        tot = (n*0.90)*0.65;

                        if (n >= 5){
                            tot = tot*0.75;
                            if (tot > 15){
                                tot = tot*0.80;
                            }
                        }else if (tot > 15){
                                tot = tot*0.80;

                        }
                        System.out.printf("You bought %d cups of Espresso for %.2f lv.",n,tot);
                        break;
                    case "Normal":

                        if (n >= 5){
                            tot = (n*1.00)*0.75;
                            if (tot > 15){
                                tot = tot*0.80;
                            }
                        }else {
                            tot = (n*1.00);
                            if (tot > 15){
                                tot = tot*0.80;
                            }
                        }
                        System.out.printf("You bought %d cups of Espresso for %.2f lv.",n,tot);
                        break;
                    case "Extra":
                        if (n >= 5){
                            tot = (n*1.20)*0.75;
                            if (tot > 15){
                                tot = tot*0.80;
                            }
                        }else {
                            tot = (n*1.20);
                            if (tot > 15){
                                tot = tot*0.80;
                            }
                        }

                        System.out.printf("You bought %d cups of Espresso for %.2f lv.",n,tot);

                        break;
                }
                break;
            case "Cappuccino":
                switch (type){
                    case "Without":

                        tot = (n*1.00)*0.65;
                        if (tot > 15){
                            tot = tot*0.80;
                        }
                        System.out.printf("You bought %d cups of Cappuccino for %.2f lv.",n,tot);
                        break;
                    case "Normal":
                        tot = (n*1.20);
                        if (tot > 15){
                            tot = tot*0.80;
                        }
                        System.out.printf("You bought %d cups of Cappuccino for %.2f lv.",n,tot);
                        break;
                    case "Extra":
                        tot = (n*1.60);
                        if (tot > 15){
                            tot = tot*0.80;
                        }
                        System.out.printf("You bought %d cups of Cappuccino for %.2f lv.",n,tot);
                        break;
                }
                break;
            case "Tea":
                switch (type){
                    case "Without":
                        tot = (n*0.50)*0.65;
                        if (tot > 15){
                            tot = tot*0.80;
                        }
                        System.out.printf("You bought %d cups of Tea for %.2f lv.",n,tot);
                        break;
                    case "Normal":
                        tot = n*0.60;
                        if (tot > 15){
                            tot = tot*0.80;
                        }
                        System.out.printf("You bought %d cups of Tea for %.2f lv.",n,tot);
                        break;
                    case "Extra":
                        tot = n*0.70;
                        if (tot > 15){
                            tot = tot*0.80;
                        }

                        System.out.printf("You bought %d cups of Tea for %.2f lv.",n,tot);
                        break;
                }
                break;
        }
    }
}
