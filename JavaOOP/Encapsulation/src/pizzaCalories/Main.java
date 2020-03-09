package pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split("\\s+");
        Pizza pizza = null;
        try {

            pizza = new Pizza(data[1],Integer.parseInt(data[2]));
            data = scanner.nextLine().split("\\s+");
            pizza.setDough(new Dough(data[1],data[2],Double.parseDouble(data[3])));

            String toppings;
            while (!"END".equals(toppings = scanner.nextLine())){
                data = toppings.split("\\s+");
                pizza.addTopping(new Topping(data[1],Double.parseDouble(data[2])));
            }



        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println(pizza);
    }
}
