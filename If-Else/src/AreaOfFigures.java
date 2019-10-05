import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area;
        if(shape.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            area = side*side;
            System.out.printf("%.3f",area);

        }else if (shape.equals("rectangle")){
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            area = side1*side2;
            System.out.printf("%.3f",area);

        }else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double PI = Math.PI;
            area = PI*(r*r);
            System.out.printf("%.3f",area);

        }else if (shape.equals("triangle")){

            double b = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = (h*b)/2;
            System.out.printf("%.3f",area);

        }
    }
}
