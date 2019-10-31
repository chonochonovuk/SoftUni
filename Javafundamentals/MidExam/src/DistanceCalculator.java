import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());

        distanceTraveled(steps,length,distance);
    }

    private static void distanceTraveled(int steps, double length, int distance) {
        double sum = 0;
        for (int i = 1; i <= steps; i++) {
            if (i % 5 == 0){
                sum += (length*0.70);
                continue;
            }

            sum += length;
        }

        double totSteps = sum/distance;
        System.out.printf("You travelled %.2f%c of the distance!",totSteps,'%');
    }
}
