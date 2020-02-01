package SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            cars.add(new Car(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2])));
        }
        String drive;
        while (!"End".equals(drive = scanner.nextLine())){
            String[] driveArr = drive.split("\\s+");
            String model = driveArr[1];
            int distance = Integer.parseInt(driveArr[2]);
            Car modelMatch = findModelAndCheckFuel(model,cars,distance);
            if (modelMatch == null){
                System.out.println("Insufficient fuel for the drive");
            }
        }

        for (Car car : cars) {
            System.out.printf("%s %.2f %d%n",car.getModel(),car.getFuel(),car.getDistanceTraveled());
        }

    }

    private static Car findModelAndCheckFuel(String model, List<Car> cars, int distance) {
        for (Car car : cars) {
            if (car.getModel().equals(model)){
                double fueLEnough = car.getConsumption()*distance;
                double fuelLeft = car.getFuel() - fueLEnough;
                if (fuelLeft >= 0){
                    car.setFuel(fuelLeft);
                    car.setDistanceTraveled(car.getDistanceTraveled() + distance);
                    return car;
                }
            }
        }


        return null;
    }
}
