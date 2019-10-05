import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double pi = 3.14159265;
        double area = pi*r*r;
        double perimeter = 2*pi*r;
        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f%n",perimeter);
    }
}
