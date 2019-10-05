import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double slower = Math.floor(length/15)*12.5;
        double timeIvan = (length*time) + slower;
        if(timeIvan < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",timeIvan);
        } else {
            double timeLeft = timeIvan - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.",timeLeft);
        }

    }
}

