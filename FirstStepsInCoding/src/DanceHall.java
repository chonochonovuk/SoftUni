import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double wardrobe = Double.parseDouble(scanner.nextLine());
        double hallSize = (length*100)*(width*100);
        double wardArea = (wardrobe*100)*(wardrobe*100);
        double benchSize = (hallSize/10);
        double freeSpace = (hallSize - wardArea - benchSize);
        double dancerCount = Math.floor(freeSpace/(40+7000));
        System.out.printf("%.0f",dancerCount);
    }
}
