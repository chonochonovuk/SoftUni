import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if(productName.equalsIgnoreCase("coffee")){
            if(city.equalsIgnoreCase("Sofia")){
                price = 0.50;


            }else if(city.equalsIgnoreCase("Plovdiv")){
                price = 0.40;


            }else if(city.equalsIgnoreCase("Varna")){
                price = 0.45;


            }
        }else if(productName.equalsIgnoreCase("water")) {
            if (city.equalsIgnoreCase("Sofia")) {
                price = 0.80;


            } else if (city.equalsIgnoreCase("Plovdiv")) {
                price = 0.70;


            } else if (city.equalsIgnoreCase("Varna")) {
                price = 0.70;


            }
        }else if(productName.equalsIgnoreCase("beer")) {
            if (city.equalsIgnoreCase("Sofia")) {
                price = 1.20;


            } else if (city.equalsIgnoreCase("Plovdiv")) {
                price = 1.15;


            } else if (city.equalsIgnoreCase("Varna")) {
                price = 1.10;


            }
        }else if(productName.equalsIgnoreCase("sweets")) {
            if (city.equalsIgnoreCase("Sofia")) {
                price = 1.45;


            } else if (city.equalsIgnoreCase("Plovdiv")) {
                price = 1.30;


            } else if (city.equalsIgnoreCase("Varna")) {
                price = 1.35;


            }
        }else if(productName.equalsIgnoreCase("peanuts")) {
            if (city.equalsIgnoreCase("Sofia")) {
                price = 1.60;


            } else if (city.equalsIgnoreCase("Plovdiv")) {
                price = 1.50;


            } else if (city.equalsIgnoreCase("Varna")) {
                price = 1.55;


            }
        }
        double result = quantity*price;
        productName = Double.toString(result);

            System.out.println(result);

    }
}
