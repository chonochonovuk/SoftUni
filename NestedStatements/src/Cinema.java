import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        double total = (row*column);

        switch (type) {
            case "premiere":
                total = total*12.00;
                System.out.printf("%.2f leva",total);
                break;
            case "normal":
                total = total*7.50;
                System.out.printf("%.2f leva",total);
                break;
            case "discount":
                total = total*5.00;
                System.out.printf("%.2f leva",total);
                break;
        }
    }
}
