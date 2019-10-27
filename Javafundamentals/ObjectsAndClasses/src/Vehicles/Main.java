package Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cars> car = new ArrayList<>();
        String input;
        double carpower = 0;
        double truckpower = 0;
        int carz = 0;
        int trucks = 0;

        while (!"End".equals(input = scanner.nextLine())){
            String[] entries = input.split(" ");
            String typeA = entries[0];
            String modelA = entries[1];
            String color = entries[2];
            int power = Integer.parseInt(entries[3]);
            switch (typeA){
                case "car":
                    typeA = "Car";
                    carpower += power;
                    carz++;
                    break;
                case "truck":
                    typeA = "Truck";
                    truckpower += power;
                    trucks++;
                    break;
            }
            Cars cars = new Cars(typeA,modelA,color,power);
            car.add(cars);
        }
        String output;
        while (!"Close the Catalogue".equals(output = scanner.nextLine())){
            String finalOutput = output;
            car.stream().filter(car1 -> car1.getModel().equals(finalOutput)).forEach(System.out::println);
        }

        double cp = carpower/carz;
        double tp = truckpower/trucks;

        if (carz != 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n",cp);
        }else {
            cp = 0.0;
            System.out.printf("Cars have average horsepower of: %.2f.%n",cp);
        }

        if (trucks != 0){
            System.out.printf("Trucks have average horsepower of: %.2f.",tp);
        }else {
            tp = 0.0;
            System.out.printf("Trucks have average horsepower of: %.2f.",tp);
        }

    }
}
