package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            switch (data.length){
                case 2:
                    engines.add(new Engine(data[0],data[1]));
                    break;
                case 3:
                    engines.add(new Engine(data[0],data[1],data[2]));
                    break;
                case 4:
                    engines.add(new Engine(data[0],data[1],data[2],data[3]));
                    break;
            }
        }

        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            switch (data.length){
                case 2:
                    cars.add(new Car(data[0],data[1]));
                    break;
                case 3:
                    cars.add(new Car(data[0],data[1],data[2]));
                    break;
                case 4:
                    cars.add(new Car(data[0],data[1],data[2],data[3]));
                    break;
            }
        }

        for (Car car : cars) {
            System.out.println(car.getModel() + ":");
            String engine1 = car.getEngine();
            for (Engine engine : engines) {
                if (engine.getModel().equals(engine1)){
                    System.out.println(engine.getModel() + ":");
                    System.out.println("Power: " + engine.getPower());
                    System.out.println("Displacement: " + engine.getDisplacement());
                    System.out.println("Efficiency: " + engine.getEfficiency());
                }
            }
            System.out.println("Weight: " + car.getWeight());
            System.out.println("Color: " + car.getColor());

        }

    }
}
