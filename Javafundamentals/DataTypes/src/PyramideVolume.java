import java.util.Scanner;

public class PyramideVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        double dul = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double sh = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double vis = Double.parseDouble(scanner.nextLine());
        double V = (dul * sh * vis)*1.00 / 3;
        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
