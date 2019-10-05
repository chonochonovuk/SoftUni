import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myDogs = Integer.parseInt(scanner.nextLine());
        int neighboursDogs = Integer.parseInt(scanner.nextLine());
        double cost = (myDogs*2.5) + (neighboursDogs*4);
        System.out.printf("%.2f lv.",cost);

    }
}
