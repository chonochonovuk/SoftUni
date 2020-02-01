package RawData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            double tyre1 = Double.parseDouble(data[5]);
            double tyre2 = Double.parseDouble(data[7]);
            double tyre3 = Double.parseDouble(data[9]);
            double tyre4 = Double.parseDouble(data[11]);
            List<Double> tyres = new ArrayList<>(Arrays.asList(tyre1,tyre2,tyre3,tyre4));
            cars.add(new Car(data[0],Integer.parseInt(data[2]),data[4] ,tyres));
        }
        String cargo = scanner.nextLine();
        switch (cargo){
            case "fragile":
                findLowPressureTyre(cars);
                break;
            case "flamable":
                findEngine(cars);
                break;
        }
    }

    private static void findEngine(List<Car> cars) {
        for (Car car : cars) {
            if (car.getEngine() > 250){
                System.out.println(car.getModel());
            }
        }

    }

    private static void findLowPressureTyre(List<Car> cars) {
        for (Car car : cars) {
            for (Double tirePressure : car.getTirePressures()) {
                if (tirePressure < 1){
                    System.out.println(car.getModel());
                    break;
                }
            }

        }

    }
}
