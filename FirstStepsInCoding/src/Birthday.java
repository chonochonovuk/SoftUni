import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume = (length*wide*hight);
        double waterTotal = (volume*0.001);
        double percentVolume = (percent*0.01);
        double waterReal = (waterTotal*(1-percentVolume));
        System.out.printf("%.3f",waterReal);
    }

}
