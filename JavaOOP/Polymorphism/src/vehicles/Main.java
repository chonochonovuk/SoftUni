package vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carArr = scanner.nextLine().split("\\s+");
        String[] truckArr = scanner.nextLine().split("\\s+");
        String[] busArr = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carArr[1]),Double.parseDouble(carArr[2]),Double.parseDouble(carArr[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckArr[1]),Double.parseDouble(truckArr[2]),Double.parseDouble(truckArr[3]));
        Vehicle bus = new Bus(Double.parseDouble(busArr[1]),Double.parseDouble(busArr[2]),Double.parseDouble(busArr[3]));
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            try{
                switch (command[0]){
                    case "Drive":
                        switch (command[1]){
                            case "Car":
                                car.fuelAfterDistance(Double.parseDouble(command[2]));
                                break;
                            case "Truck":
                                truck.fuelAfterDistance(Double.parseDouble(command[2]));
                                break;
                            case "Bus":
                                bus.fuelAfterDistance(Double.parseDouble(command[2]),1.4);
                                break;
                        }
                        break;
                    case "Refuel":
                        switch (command[1]){
                            case "Car":
                                car.fuelRefill(Double.parseDouble(command[2]));
                                break;
                            case "Truck":
                                truck.fuelRefill(Double.parseDouble(command[2]));
                                break;
                            case "Bus":
                                bus.fuelRefill(Double.parseDouble(command[2]));
                        }
                        break;
                    case "DriveEmpty":
                        bus.fuelAfterDistance(Double.parseDouble(command[2]));
                        break;
                }

            }catch (IllegalArgumentException iae){
                System.out.println(command[1] + iae.getMessage());
            }catch (IllegalStateException ise){
                System.out.println(ise.getMessage());
            }
        }
        System.out.printf("Car: %.2f%n",car.getFuel());
        System.out.printf("Truck: %.2f%n",truck.getFuel());
        System.out.printf("Bus: %.2f",bus.getFuel());
    }
}
